import java.time.YearMonth;
import java.util.Scanner;
public class yearmonthToday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (e.g., 2023): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
        } else {
            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();

            System.out.println("Number of days in month " + month + " of year " + year + ": " + daysInMonth);
        }

        scanner.close();
    }
}

