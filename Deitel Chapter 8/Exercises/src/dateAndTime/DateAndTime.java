package dateAndTime;

import time2.Time2;

public class DateAndTime {

    private int hour;
    private int minute;
    private int second;
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //1/12/2025

    public DateAndTime(int month, int day, int year) {
        this(month, day, year, 0, 0, 0);
    }

    public DateAndTime(int month, int day, int year, int hour) {
        this(month, day, year, hour, 0, 0);
    }

    public DateAndTime(int month, int day, int year, int hour, int minute) {
        this(month, day, year, hour, minute, 0);
    }

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        validateTime(hour, minute, second);
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateAndTime(DateAndTime date) {
        this(date.month, date.day, date.year, date.hour, date.minute, date.second);
    }

    public void validate(DateAndTime date) {
        validateDate(date.month, date.day, date.year);
        validateTime(date.hour, date.minute, date.second);
    }

    public void validateDate(int month, int day, int year) {
        validateMonth(month);
        validateDay(month, day);
        validateYear(year);
        validateFebruary_29(month, day, year);
    }

    private static void validateFebruary_29(int month, int day, int year) {
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }
    }

    private static void validateDay(int month, int day) {
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }
    }

    private static void validateMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }
    }

    private static void validateYear(int year) {
        if (year < 1) {
            throw new IllegalArgumentException("year (" + year + ") must be above 0");
        }
    }

    public static void validateTime(int hour, int minute, int second) {
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
        boolean hourExceeds23 = hour >= 24;
        if (hourExceeds23) {
            hour %= 24;
            nextDay();
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
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

    public void nextDay() {
        day++;
        pushingToNextMonth();
        pushingToNextYear();
    }

    private void pushingToNextMonth() {
        if (day > daysPerMonth[month]) {
            day %= daysPerMonth[month];
            month++;
        }
    }

    private void pushingToNextYear() {
        if (month > 12) {
            month %= 12;
            year++;
        }
    }

    public String toUniversalString() {
        return String.format("%d/%d/%d, %02d:%02d:%02d", getMonth(), getDay(), getYear(), getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d/%d/%d, %d:%02d:%02d %s", getMonth(), getDay(), getYear(),
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

class DateRun {
    public static void main(String[] args) {
        DateAndTime date = new DateAndTime(12, 30, 2019, 23, 59, 59);

        System.out.printf("Initial date: %n\t%s%n\t%s%n", date, date.toUniversalString());
        date.incrementHour();
        System.out.printf("Incremented to next day by incrementing hour: %n\t%s%n\t%s%n", date, date.toUniversalString());
        date.tick();
        System.out.printf("Incremented to next second: %n\t%s%n\t%s%n", date, date.toUniversalString());
        date.incrementMinute();
        System.out.printf("Incremented to next minute: %n\t%s%n\t%s%n", date, date.toUniversalString());
        date.incrementHour();
        System.out.printf("Incremented to next hour: %n\t%s%n\t%s%n", date, date.toUniversalString());
        date.nextDay();
        System.out.printf("Incremented to next day: %n\t%s%n\t%s%n", date, date.toUniversalString());
    }
}

