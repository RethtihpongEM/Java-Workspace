import java.util.Scanner;
public class Main {
  static int sum(int a, int b){
    return a+b;
  }
  static double divide(int a, int b){
    return a/b;
  }

  static int minus(int a, int b){
    return a-b;
  }

  static int multiply(int a, int b){
    return a*b;
  }

  static int modulo(int a, int b){
    return a%b;
  }
  public static void main(String[] args) {

    int a, b;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a: ");
    a = input.nextInt();

    System.out.print("Enter b: ");
    b = input.nextInt();

    System.out.println("Sum: "+sum(a,b));
    System.out.println("Divide: "+divide(a,b));
    System.out.println("Minus: "+minus(a,b));
    System.out.println("Multiply: "+multiply(a,b));
    System.out.println("Modulo: "+modulo(a,b));
  }

}