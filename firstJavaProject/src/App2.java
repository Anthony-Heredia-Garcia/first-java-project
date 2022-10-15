import javax.swing.JOptionPane;

public class App2 {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog(null, "What is the magic word?");
    JOptionPane.showMessageDialog(null, "Your magic word is " +name);
  }
}
