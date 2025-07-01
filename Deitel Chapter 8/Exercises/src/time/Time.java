package time;

public class Time {
    private int secondsSinceMidnight;

    public Time() {
        this(0);
    }

    public Time(int secondsSinceMidnight) {
        if (secondsSinceMidnight < 0) throw new IllegalArgumentException("seconds must be greater than 0");
        if(secondsSinceMidnight > 86400) throw new IllegalArgumentException("seconds must be less than 86400 (total seconds in a day)");
        this.secondsSinceMidnight = secondsSinceMidnight;
    }

    public Time(Time time) {
        this(time.secondsSinceMidnight);
    }

    public void setTime(int secondsSinceMidnight ) {
        if (secondsSinceMidnight < 0) throw new IllegalArgumentException("seconds must be greater than 0");
        if(secondsSinceMidnight > 86400) throw new IllegalArgumentException("seconds must be less than 86400 (total seconds in a day)");
        this.secondsSinceMidnight = secondsSinceMidnight;
    }

    public int getHour() {
        return secondsSinceMidnight / 3600;
    }

    public int getMinute() {
        return (secondsSinceMidnight % 3600) / 60;
    }

    public int getSecond() {
        return ((secondsSinceMidnight % 3600) % 60);
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(86400);
        Time t3 = new Time(t2);


        System.out.println("Constructed with:");
        displayTime("t1: default argument", t1);
        displayTime("t2: seconds since midnight specified", t2);
        displayTime("t3: Time object t2 specified", t3);


        try {
            Time t4 = new Time(86401);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t4: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time t) {
        System.out.printf("%s%n   %s%n   %s%n", header,
                t.toUniversalString(), t.toString());
    }
}