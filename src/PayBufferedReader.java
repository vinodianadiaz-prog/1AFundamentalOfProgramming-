import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayBufferedReader {

    // Keeps asking until the user enters a valid, non-negative number
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

    double rate = readPositive(br, "Enter hourly pay rate: ");
    double hours = readPositive(br, "Enter hours worked: ");

    double gross = hours * rate;
    int percent;

    if (gross <= 2000) {
        percent = 10;
    } else if (gross <= 4000) {
        percent = 12;
    } else if (gross <= 10000) {
        percent = 15;
    } else {
        percent = 20;
    }

    double tax = gross * percent / 100;
    double net = gross - tax;

    // round to 2 decimal places
    gross = Math.round(gross * 100) / 100.0;
    tax = Math.round(tax * 100) / 100.0;
    net = Math.round(net * 100) / 100.0;

    System.out.println();
    System.out.println("Gross Pay: Php " + gross);
    System.out.println("Withholding Tax (" + percent + " percent): Php " + tax);
    System.out.println("Net Pay: Php " + net);

    br.close();
}
}

