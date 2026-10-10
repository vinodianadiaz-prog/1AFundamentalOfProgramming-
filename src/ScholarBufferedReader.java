import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScholarBufferedReader {

    static double readPositive(BufferedReader br, String prompt) throws IOException {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(br.readLine().trim());
                if (value >= 0) {
                    return value;
                }
                System.out.println("Value cannot be negative. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double nsat = readPositive(br, "Enter NSAT score: ");
        double salary = readPositive(br, "Enter parents' monthly salary: ");
        double exam = readPositive(br, "Enter entrance exam score: ");

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