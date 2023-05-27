package lab1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardHandler implements KeyListener {
    private boolean keyUpPressed;
    private boolean keyDownPressed;

    private static KeyboardHandler instance = null;

    private KeyboardHandler() {
        // This is a singleton class.
    }

    public static boolean isKeyDownPressed() {
        return KeyboardHandler.getInstance().keyDownPressed;
    }

    public static boolean isKeyUpPressed() {
        return KeyboardHandler.getInstance().keyUpPressed;
    }

    public static KeyboardHandler getInstance() {
        if (KeyboardHandler.instance == null) {
            KeyboardHandler.instance = new KeyboardHandler();
        }

        return KeyboardHandler.instance;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            keyUpPressed = true;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            keyDownPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            keyUpPressed = false;
        } else if (keyCode == KeyEvent.VK_DOWN) {
            keyDownPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Ignore keyTyped events
    }
}
