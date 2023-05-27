package game;

import java.util.ArrayList;
import java.util.List;

public class Clock {
    private static Clock instance = null;
    private Thread thread = null;
    private final List<FrameListener> frameListeners;

    private int fps;
    private int totalFrames;
    private int currentFrame;
    private boolean isRunning;

    // Total time elapsed at last frame update
    // in milliseconds
    private long lastTotalTimeElapsed;

    // Time a frame takes theoretically
    private final int timePerFrame;

    private int newDeltaT;
    private long newLast;
    private long newNow;

    private Clock() {
        // This is a singleton class.

        this.fps = 60;
        this.totalFrames = 0;
        this.currentFrame = 0;
        this.frameListeners = new ArrayList<>();

        this.timePerFrame = (int) (1000. / this.fps);

        this.newDeltaT = 0;
        this.newLast = System.currentTimeMillis();
        this.newNow = System.currentTimeMillis();

        // Initializing timestamps
        this.lastTotalTimeElapsed = 0;

        // Run the clock loop in a separate thread
        this.thread = new Thread(() -> {
            while (this.isRunning) {
                // Update Now time
                this.newNow = System.currentTimeMillis();

                // Update DeltaT time
                this.newDeltaT = (int) (this.newNow - this.newLast);

                // Increment the current frame
                this.totalFrames++;

                // Set current frame based on total frames and fps
                this.currentFrame = this.totalFrames % this.fps;

                // Notify all registered listeners
                for (FrameListener listener : frameListeners) {
                    listener.onFrameUpdated(this.currentFrame);
                }

                // Update last timestamp
                this.lastTotalTimeElapsed = System.currentTimeMillis();

                // Set last time to now
                this.newLast = this.newNow;

                // Sleep for timePerFrame seconds
                try {
                    Thread.sleep(timePerFrame);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static Clock getInstance() {
        if (Clock.instance == null) {
            Clock.instance = new Clock();
        }

        return Clock.instance;
    }

    public static void start() {
        Clock.getInstance().isRunning = true;
        Clock.getInstance().thread.start();
    }

    public static void stop() {
        Clock.getInstance().isRunning = false;
    }

    public static int getCurrentFrame() {
        return Clock.getInstance().currentFrame;
    }

    public static int getTotalFrames() {
        return Clock.getInstance().totalFrames;
    }

    public static int getFps() {
        return Clock.getInstance().fps;
    }

    public static void setFps(int fps) {
        Clock.getInstance().fps = fps;
    }

    public static void registerFrameListener(FrameListener listener) {
        Clock.getInstance().frameListeners.add(listener);
    }

    public static void unregisterFrameListener(FrameListener listener) {
        Clock.getInstance().frameListeners.remove(listener);
    }

    public static long getTimeElapsed() {
        return System.currentTimeMillis();
    }

    public static long getLastTimeElapsed() {
        return Clock.getInstance().lastTotalTimeElapsed;
    }

    public static int getDeltaT() {
        // System.out.println("deltaT: " + (Clock.getTimeElapsed() - Clock.getLastTimeElapsed()));
//        return (int) (Clock.getTimeElapsed() - Clock.getLastTimeElapsed());
        return Clock.getInstance().newDeltaT;
    }

    public interface FrameListener {
        void onFrameUpdated(int currentFrame);
    }
}
