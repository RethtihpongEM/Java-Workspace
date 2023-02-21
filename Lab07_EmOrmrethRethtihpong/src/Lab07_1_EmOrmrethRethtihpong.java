import java.awt.geom.Area;
import java.util.Arrays;
import java.util.Scanner;

abstract class ShapeArea{
  abstract double calculateRectangleArea(double width,double height);
  abstract double calculateCircleArea(double radius);
  abstract double calculateTriangleArea(double a,double b,double c);
  abstract double calculateTriangleArea(double base,double height);
  abstract double calculateSemicircleArea(double radius);
  abstract double calculateSectorArea(double radius,double angle);
}
class AreaShape extends ShapeArea{
   final double PI = 3.141592653589793238;

  @Override
  double calculateRectangleArea(double width, double height) {
    return width*height;
  }

  @Override
  double calculateCircleArea(double radius) {
    return radius*radius*PI;
  }

  @Override
  double calculateTriangleArea(double a, double b, double c) {
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }

  @Override
  double calculateTriangleArea(double base, double height) {
    return (base*height)/2;
  }

  @Override
  double calculateSemicircleArea(double radius) {
    return calculateCircleArea(radius)/2;
  }

  @Override
  double calculateSectorArea(double radius, double angle) {
    return (radius*radius*angle)/2;
  }
}
public class Lab07_1_EmOrmrethRethtihpong {
  static boolean askIfContinue(){
    System.out.print("Do you want to continue(y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }
  static void menu(){
    System.out.println("==== Shape Area Calculation ====");
    System.out.println("1. Rectangle");
    System.out.println("2. Circle");
    System.out.println("3. Triangle (three sides)");
    System.out.println("4. Triangle (base and height)");
    System.out.println("5. Semi circle");
    System.out.println("6. Sector");
    System.out.println("7. Quit");
    System.out.print("Choose an opt: ");
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AreaShape areaShape = new AreaShape();
    double a,b,c;
    double width,height,base,radius,angle;
    int input;
    do {
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          do {
            System.out.println(":::Rectangle:::");
            System.out.print("Width: ");
            width = scanner.nextDouble();
            System.out.print("Height: ");
            height = scanner.nextDouble();
            System.out.printf("Result: %.2f\n",areaShape.calculateRectangleArea(width,height));
          }while (askIfContinue());
          break;
        case 2:
          do {
            System.out.println(":::Circle:::");
            System.out.print("Radius: ");
            radius = scanner.nextDouble();
            System.out.printf("Result: %.2f\n",areaShape.calculateCircleArea(radius));
          }while (askIfContinue());
          break;
        case 3:
          do {
            System.out.println(":::Triangle (three sides):::");
            System.out.print("Input a: ");
            a = scanner.nextDouble();
            System.out.print("Input b: ");
            b = scanner.nextDouble();
            System.out.print("Input c: ");
            c = scanner.nextDouble();
            System.out.printf("Result: %.2f\n",areaShape.calculateTriangleArea(a,b,c));
          }while (askIfContinue());
          break;
        case 4:
          do {
            System.out.println(":::Triangle (base and height):::");
            System.out.print("Base: ");
            base = scanner.nextDouble();
            System.out.print("Height: ");
            height = scanner.nextDouble();
            System.out.printf("Result: %.2f\n",areaShape.calculateTriangleArea(base,height));
          }while (askIfContinue());
          break;
        case 5:
          do {
            System.out.println(":::Semi circle:::");
            System.out.print("Radius: ");
            radius = scanner.nextDouble();
            System.out.printf("Result: %.2f\n",areaShape.calculateSemicircleArea(radius));
          }while (askIfContinue());
          break;
        case 6:
          do {
            System.out.println(":::Semi circle:::");
            System.out.print("Radius: ");
            radius = scanner.nextDouble();
            System.out.print("Angle: ");
            angle = scanner.nextDouble();
            System.out.printf("Result: %.2f\n",areaShape.calculateSectorArea(radius,angle));
          }while (askIfContinue());
          break;
        case 7:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid input....");
          break;
      }
    }while (true);
  }
}
