import java.util.Scanner;

public class JediAdmissionScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        int height = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter citizenship code (C for citizen, N for non-citizen): ");
        String citizenship = scanner.nextLine().toUpperCase();

        System.out.print("Enter recommendee code (R for recommendee, N for non-recommendee): ");
        String recommendee = scanner.nextLine().toUpperCase();

        boolean accepted = isAccepted(height, age, citizenship, recommendee);
        System.out.println(accepted ? "Accepted" : "Rejected");

        scanner.close();
    }

    public static boolean isAccepted(int height, int age, String citizenship, String recommendee) {
        if (recommendee.equals("R")) {
            return true;
        }
        return height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C");
    }
}
