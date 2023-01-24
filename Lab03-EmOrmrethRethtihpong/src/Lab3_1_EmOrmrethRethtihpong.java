import java.util.*;
public class Lab3_1_EmOrmrethRethtihpong {
  static float a,b,c;
  static double delta, sqrtDelta;
  static double root1,root2;
  public static void main(String[] args) {
    System.out.println("Program for calculating roots of quadratic equation");
    System.out.println("ax^2 + bx + c = 0");
    Scanner input = new Scanner(System.in);
    System.out.print("Input value of a: ");
    a = input.nextInt();
    System.out.print("Input value of b: ");
    b = input.nextInt();
    System.out.print("Input value of c: ");
    c = input.nextInt();
    if (a == 0 && b == 0){
      System.exit(0);
    }
    delta = b*b - 4*a*c;
    if (delta>0){
      //Calculation the square root of delta and root
      sqrtDelta = Math.sqrt(delta);
      root1 = (-b + sqrtDelta)/(2*a);
      root2 = (-b - sqrtDelta)/(2*a);

      System.out.println("X1 = " + root1+", X2 = "+root2);

    } else if (delta==0){
      //Calculating the root
      root1 = -b/2*a;

      System.out.println("X1 = X2 = " +root1);
    }else{
      System.out.println("Equation roots are complex!");
    }
  }
}
