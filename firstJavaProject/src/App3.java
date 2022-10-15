
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter side X: ");
    x = scanner.nextDouble();

    System.out.println("Enter side y: ");
    y = scanner.nextDouble();

    z = Math.sqrt((x*x)+(y*y));

    System.out.println("The hypotenuse is: "+z);
    scanner.close();
  }
}
