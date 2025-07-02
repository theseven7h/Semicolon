package date;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //1/12/2025

    public Date(int month, int day, int year) {
        validateMonth(month);
        validateDay(month, day);
        validateYear(year);
        validateFebruary_29(month, day, year);

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
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
        if(year < 1) {
            throw new IllegalArgumentException("year (" + year + ") must be above 0");
        }
    }

    public void nextDay() {
        day++;
        pushingToNextMonth();
        pushingToNextYear();
    }

    private void pushingToNextMonth() {
        if(day > daysPerMonth[month]) {
            day %= daysPerMonth[month];
            month++;
        }
    }

    private void pushingToNextYear() {
        if(month > 12) {
            month %= 12;
            year++;
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}

class DateRun {
    public static void main(String[] args) {
        Date date = new Date(11, 30, 2019);

        System.out.printf("Initial date: %n\t%s%n%n", date);
        System.out.println("Incrementing dates of month 11:");
        for(int day = 0; day <= 30; day++) {
            date.nextDay();
            System.out.printf("\t%s%n",date);
        }
        date.nextDay();
        System.out.printf("Incrementing into the next year:%n\t%s%n%n", date);
    }
}

