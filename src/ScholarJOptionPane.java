import javax.swing.JOptionPane;

public class ScholarJOptionPane {

    static double readPositive(String prompt) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            if (input == null) {
                System.exit(0);
            }
            try {
                double value = Double.parseDouble(input.trim());
                if (value >= 0) {
                    return value;
                }
                JOptionPane.showMessageDialog(null, "Value cannot be negative.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }
    }

    public static void main(String[] args) {
        double nsat = readPositive("Enter NSAT score:");
        double salary = readPositive("Enter parents' monthly salary:");
        double exam = readPositive("Enter entrance exam score:");

        double average = (nsat + exam) / 2;
        String result;

        if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "REJECTED";
        } else if (salary <= 3500 && average >= 91) {
            result = "ACCEPTED";
        } else {
            result = "FOR FURTHER STUDY";
        }

        JOptionPane.showMessageDialog(null,
                "Average of NSAT and entrance exam: " + average
                        + "\nApplication status: " + result,
                "Scholarship Result", JOptionPane.INFORMATION_MESSAGE);
    }
}


