//Exercise 2
import java.util.Scanner;
public class ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Program for converting money in Riels to Dollars.");
    System.out.print("Please Input Conversion rate of 1 dollar in Riels: ");
    float exchangeRate = input.nextFloat();
    System.out.print("Please Input money to exchange in Riels: ");
    float amount = input.nextFloat();
    float result = amount/exchangeRate;
    System.out.printf("%.0f Riels = %.2f USD",amount, result);
  }
}
