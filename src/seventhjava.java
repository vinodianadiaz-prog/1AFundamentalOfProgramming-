import javax.swing.JOptionPane;

public class seventhjava {
    public static void main (String [] args){

        String name = "";
        name = JOptionPane.showInputDialog("Please enter you name: ");
        int age;
        String s1 = "";
        String s;
        age = Integer.parseInt (JOptionPane.showInputDialog("Please enter you age: "));

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
