import java.util.Scanner;

public class Program4 {
    /**
     * Number of Days In Month
     * Write a method isLeapYear with a parameter of type int named year.
     * The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false.
     * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,  otherwise return false.
     * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
     */

    public static boolean isLeapYear(int year) {
        boolean a;
        if (year <= 1 || year >= 9999) {
            a = false;
            System.out.println("since the parameter is not in the range(1-9999");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            a = true;
            System.out.println(year + "is leap year");

        } else {
            a = false;
            System.out.println(year + "is Not a leap year");
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scan.nextInt();
        System.out.println("Please enter the month");
        int month = scan.nextInt();
        isLeapYear(year);

        // leap year 4 outputs
        //isleapyear (-1600);
        //isleapyear (1600);
        //isleapyear (2017);
        //isleapyear (2000);
        System.out.println("------------------------------");

        getDaysInMonth(month, year);
        scan.close();
        //5 outputs to get days in a month
        // getDaysInMonth(1, 2020); should return 31 since January has 31 days.
        // getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap   year.
        // getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and   2018 is not a leap year.
        // getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
        // getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to   9999
    }

    public static int getDaysInMonth(int month, int year) {
        int Month = 12;
        switch (month) {
            case 1:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 2:
                if (month == 2 && year % 4 == 0 && year % 100 != 0) {
                    System.out.println(("29 days"));
                } else {
                    System.out.println("28 days");
                }
                break;
            case 3:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid number");
                }
                break;
            case 4:
                if (year > 1 || year < 9999) {
                    System.out.println("30 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 5:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invaild year");
                }
                break;
            case 6:
                if (year > 1 || year < 9999) {
                    System.out.println("30 days");
                } else {
                    System.out.println("invaild year");
                }
                break;
            case 7:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invaild year");
                }
                break;
            case 8:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invaild year");
                }
                break;
            case 9:
                if (year > 1 || year < 9999) {
                    System.out.println("30 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 10:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 11:
                if (year > 1 || year < 9999) {
                    System.out.println("30 days");
                } else {
                    System.out.println("invalid year");
                }
                break;
            case 12:
                if (year > 1 || year < 9999) {
                    System.out.println("31 days");
                } else {
                    System.out.println("invalid year");
                }
                break;

        }
        return 0;


    }


}

