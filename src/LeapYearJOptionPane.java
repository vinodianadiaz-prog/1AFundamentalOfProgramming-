import javax.swing.JOptionPane;

public class LeapYearJOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter year:");
        int year = Integer.parseInt(input);
        String message;
        if (isLeapYear(year)) {
            message = year + " is a leap year.";
        } else {
            message = year + " is not a leap year.";
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
