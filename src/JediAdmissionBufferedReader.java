import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JediAdmissionBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        int height = Integer.parseInt(reader.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter citizenship code (C for citizen, N for non-citizen): ");
        String citizenship = reader.readLine().toUpperCase();

        System.out.print("Enter recommendee code (R for recommendee, N for non-recommendee): ");
        String recommendee = reader.readLine().toUpperCase();

        boolean accepted = isAccepted(height, age, citizenship, recommendee);
        System.out.println(accepted ? "Accepted" : "Rejected");
    }

    public static boolean isAccepted(int height, int age, String citizenship, String recommendee) {
        if (recommendee.equals("R")) {
            return true;
        }
        return height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C");
    }
}

