import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class labquiz1 {
    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.print("Enter your Birthyear:");
            String birthyearInput = datain.readLine();
            int birthyear = Integer.parseInt(birthyearInput);
            int convertyear = Calendar.getInstance().get(Calendar.YEAR);
            int result = (convertyear - birthyear);
            System.out.println(" You were born last " + birthyearInput + ".");
            System.out.println(" You are now " + result + ".");

        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}
