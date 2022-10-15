import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age? "));
        JOptionPane.showMessageDialog(null, "Your age is: "+age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height? "));
        JOptionPane.showMessageDialog(null, "Your height is: "+height);
        

    }
}
