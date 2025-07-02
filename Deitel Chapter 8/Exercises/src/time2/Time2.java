package time2;

public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(Time2 time) {
        this(time.hour, time.minute, time.second);
    }

    public static void validate(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean secondOutOfRange = second < 0 || second >= 60;
        if (secondOutOfRange) throw new IllegalArgumentException("second must be 0–59");
    }

    private static void validateMinute(int minute) {
        boolean minuteOutOfRange = minute < 0 || minute >= 60;
        if (minuteOutOfRange) throw new IllegalArgumentException("minute must be 0–59");
    }

    private static void validateHour(int hour) {
        boolean hourOutOfRange = hour < 0 || hour >= 24;
        if (hourOutOfRange) throw new IllegalArgumentException("hour must be 0–23");
    }

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
       validateSecond(second);
        this.second = second;
    }

    public void tick() {
        second++;
        pushTime();
    }

    public void incrementMinute() {
        minute++;
        pushTime();
    }

    public void incrementHour() {
        hour++;
        pushTime();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void pushTime() {
        pushSecond();

        pushMinute();

        pushHour();
    }

    private void pushHour() {
        boolean hourExceeds23 = hour >= 24;
        if (hourExceeds23) hour %= 24;
    }

    private void pushMinute() {
        boolean minuteExceeds59 = minute >= 60;
        if (minuteExceeds59) {
            minute %= 60;
            incrementHour();
        }
    }

    private void pushSecond() {
        boolean secondExceeds59 = second >= 60;
        if (secondExceeds59) {
            second %= 60;
            incrementMinute();
        }
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

class Time2Run {
    public static void main(String[] args) {
        Time2 time = new Time2(22, 58, 58);

        System.out.printf("Initial Time:%n\t%s%n\t%s%n%n", time, time.toUniversalString());
        time.tick();
        System.out.printf("Time after tick:%n\t%s%n\t%s%n%n", time, time.toUniversalString());
        time.incrementMinute();
        System.out.printf("Time after minute increment:%n\t%s%n\t%s%n%n", time, time.toUniversalString());
        time.incrementHour();
        System.out.printf("Time after hour increment:%n\t%s%n\t%s%n%n", time, time.toUniversalString());
        time.tick();
        System.out.printf("Time after incrementing into the next day:%n\t%s%n\t%s%n%n", time, time.toUniversalString());
    }
}