import java.util.Scanner;

public class PayScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

        double gross = hours * rate;
        double percent;

        if (gross <= 2000) {
            percent = 0.10;
        } else if (gross <= 4000) {
            percent = 0.12;
        } else if (gross <= 10000) {
            percent = 0.15;
        } else {
            percent = 0.20;
        }

        double tax = gross * percent / 100;
        double net = gross * tax;

        gross = Math.round(gross * 100) / 100.0;
        tax = Math.round(tax * 100) / 100.0;
        net = Math.round(net * 100) / 100.0;

        System.out.println();
        System.out.println("Gross Pay: Php " + gross);
        System.out.println("Withholding Tax (" + percent + "percent): Php " + tax);
        System.out.println("Net Pay: Php " + net);

        sc.close();

    }
}
