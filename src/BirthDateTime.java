import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter the uear of birth (1950-2015):", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of birth(1-12)", 1, 12);

        int daysInMonth;
        switch (month)
        {
            case 2:
                daysInMonth = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }

        int day = SafeInput.getRangedInt(in, "Enter the day of birth (1- " + daysInMonth + "):", 1, daysInMonth);
        int hours = SafeInput.getRangedInt(in, "Enter the hour of birth (1-24):", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minute of birth (1-59):", 1, 59);

        System.out.println("\nBirth Date and Time");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);

    }
}