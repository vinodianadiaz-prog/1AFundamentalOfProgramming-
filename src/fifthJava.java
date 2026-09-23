import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class fifthJava {
    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        try {
            //Read an integer
            System.out.print("Enter your age:");
            String ageInput = datain.readLine();
            int age = Integer.parseInt(ageInput);

            System.out.print("Enter your exact height in meters:");
            String heightInput = datain.readLine();
            double height = Double.parseDouble(heightInput);
            System.out.println("Your are" + age + "years old and " + height + "m tall.");
        } catch (IOException e) {
            System.err.println("Error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
}}
