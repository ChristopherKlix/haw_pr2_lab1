package lab1;

public class Timestamp {
    private int milliseconds;

    public Timestamp() {
        this(0);
    }

    public Timestamp(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public void setLastTimestampInMs(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getLastTimestampInMs() {
        return this.milliseconds;
    }

    public void addMilliseconds(int milliseconds) {
        this.milliseconds += milliseconds;
    }

    public void addSeconds(int seconds) {
        this.milliseconds += seconds * 1000;
    }

    public void addMinutes(int minutes) {
        this.milliseconds += minutes * 60 * 1000;
    }

    public void addHours(int hours) {
        this.milliseconds += hours * 60 * 60 * 1000;
    }

    public void addDays(int days) {
        this.milliseconds += days * 24 * 60 * 60 * 1000;
    }

    public void addWeeks(int weeks) {
        this.milliseconds += weeks * 7 * 24 * 60 * 60 * 1000;
    }

    public double getSeconds() {
        return this.milliseconds / 1000.0;
    }
}
