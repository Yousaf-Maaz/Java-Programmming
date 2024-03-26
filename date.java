public class date {
    private int month;
    private int day;
    private int year;

    // Constructor for case 1 format
    public date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // for cccase 1
    public date(String month, int day, int year) {
        this.month = getMonthNumber(month);
        this.day = day;
        this.year = year;
    }

    // Constructor for case 2
    public date(int dayOfYear, int year) {
        this.year = year;
        this.day = dayOfYear;
        this.month = 1;
        int daysInMonth = 31;
        while (dayOfYear > daysInMonth) {
            dayOfYear -= daysInMonth;
            this.month++;
            if (this.month == 2) {
                daysInMonth = isLeapYear(year) ? 29 : 28;
            } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
        }
        this.day = dayOfYear;
    }

    // Method to convert month name to number
    private int getMonthNumber(String monthName) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(monthName)) {
                return i + 1; // Month is 1-based
            }
        }
        return -1; // if not
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String toMM_DD_YYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public String toMonthDayYear() {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        return String.format("%s %d, %d", months[month - 1], day, year);
    }

    public String toDDD_YYYY() {
        int dayOfYear = 0;
        for (int m = 1; m < month; m++) {
            if (m == 2) {
                dayOfYear += isLeapYear(year) ? 29 : 28;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                dayOfYear += 30;
            } else {
                dayOfYear += 31;
            }
        }
        dayOfYear += day;
        return String.format("%03d %04d", dayOfYear, year);
    }

    public static void main(String[] args) {
        date date1 = new date(3, 14, 1992); // MM/DD/YYYY format
        date date2 = new date("June", 14, 1992); // "June 14, 1992" format
        date date3 = new date(155, 2024); // DDD YYYY format

        System.out.println(date1.toMM_DD_YYYY());
        System.out.println(date2.toMonthDayYear());
        System.out.println(date3.toDDD_YYYY());
    }
}
