import javax.swing.JOptionPane;

public class JediAdmissionJOptionPane {
    public static void main(String[] args) {
        String heightStr = JOptionPane.showInputDialog("Enter height (cm):");
        int height = Integer.parseInt(heightStr);

        String ageStr = JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(ageStr);

        String citizenship = JOptionPane.showInputDialog("Enter citizenship code (C for citizen, N for non-citizen):").toUpperCase();

        String recommendee = JOptionPane.showInputDialog("Enter recommendee code (R for recommendee, N for non-recommendee):").toUpperCase();

        boolean accepted = isAccepted(height, age, citizenship, recommendee);
        String message = accepted ? "Accepted" : "Rejected";

        JOptionPane.showMessageDialog(null, message);
    }

    public static boolean isAccepted(int height, int age, String citizenship, String recommendee) {
        if (recommendee.equals("R")) {
            return true;
        }
        return height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C");
    }
}

