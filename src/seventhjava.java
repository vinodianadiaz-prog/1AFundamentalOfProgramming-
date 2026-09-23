import javax.swing.JOptionPane;

public class seventhjava {
    public static void main (String [] args){

        String name = "";
        name = JOptionPane.showInputDialog("Please enter you name: ");

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
