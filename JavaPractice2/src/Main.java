import java.util.Scanner;
public class Main {
  public static void main(String [] args){
    int a, b;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a: ");
    a = input.nextInt();

    System.out.print("Enter b: ");
    b = input.nextInt();

    System.out.println("2 + 4 = "+ Arithmetic.sum(2,4));
    System.out.println("8 / 2 = "+ Arithmetic.divide(8,2));
    System.out.println("2 - 4 = "+ Arithmetic.minus(2,4));
    System.out.println("3 * 3 = "+ Arithmetic.multiply(3,3));
    System.out.println("7 mod 12 = "+ Arithmetic.modulo(7,12));

    System.out.println("Sin of rad360 = "+ Trigonometry.sin(360));
    System.out.println("Sin of 45 degree = "+ Trigonometry.sind(45));
    System.out.println("Cos of rad180 "+ Trigonometry.cos(0));
    System.out.println("Cos of 45 degree "+ Trigonometry.cosd(45));
    System.out.println("Tan of rad1 "+ Trigonometry.tan(1));
    System.out.println("Tan of 45 degree "+ Trigonometry.tand(45));
    System.out.println("6 power of 2 = "+ Trigonometry.square2(6));
    System.out.println("2 power of 3 = "+ Trigonometry.square3(2));
    System.out.println("1 deg to rad = "+ Trigonometry.degree2Radian(1));
    System.out.println("1 rad to deg = "+ Trigonometry.radian2degree(1));

//    Bitwise obj = new Bitwise();
//    obj.logicalAND(a,b);
  }
}
