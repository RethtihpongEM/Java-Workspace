//Exercise 5
import java.util.Scanner;
public class ex05 {
  public static Scanner input = new Scanner(System.in);
  static float x,y,z;
  public static void main(String[] args) {
    System.out.println("Program for calculating equation 1/x = 1/y + 1/z to find value of x");
    System.out.print("Please input y: ");
    y = input.nextFloat();
    System.out.print("Please input z: ");
    z = input.nextFloat();
    x = (z*y)/(z+y);
    System.out.printf("Result x = %f", x);
  }
}
