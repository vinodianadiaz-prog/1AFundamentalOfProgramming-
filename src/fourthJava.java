import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthJava {
    public static void main(String[] args) {
        String filePath = "Vino.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter (filePath))) {
            writer.write("This is the first line of text: ");
            writer.newLine();
            writer.write("This is the second line of text: ");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("Data has successfully written to the file!");
        } catch (IOException e){
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

