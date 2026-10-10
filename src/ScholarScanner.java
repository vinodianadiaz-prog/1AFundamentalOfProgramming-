import java.util.Locale;
import java.util.Scanner;

public class ScholarScanner {

    static double readPositive(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                double value = sc.nextDouble();
                if (value >= 0) {
                    return value;
                }
                System.out.println("Value cannot be negative. Try again.");
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double nsat = readPositive(sc, "Enter NSAT score: ");
        double salary = readPositive(sc, "Enter parents' monthly salary: ");
        double exam = readPositive(sc, "Enter entrance exam score: ");

        double average = (nsat + exam) / 2;
        String result;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "REJECTED";
        } else if (salary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        } else {
            result = "FOR FURTHER STUDY";
        }

        System.out.println();
        System.out.println("Average of NSAT and entrance exam: " + average);
        System.out.println("Application status: " + result);

    }
}