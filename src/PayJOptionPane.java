import javax.swing.JOptionPane;

public class PayJOptionPane {
    public static void main(String[] args) {
        double rate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hourly pay rate: "));
        double hours = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hours worked: "));

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

        double tax = gross / percent;
        double net = gross - tax;

        gross = Math.round(gross * 100) / 100.0;
        tax = Math.round(tax * 100) / 100.0;
        net = Math.round(net * 100) / 100.0;

        String result = "Gross Pay: Php " + gross
                + "Withholding Tax (" + percent + "percent): Php" + tax
                + "Net pa: Php" + net;

        JOptionPane.showMessageDialog(null, result, "Pay Summary",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
