//Exercise 10
import java.util.Scanner;
public class ex10 {
  public static int a,b, inp;
  public static String str;
  public static Scanner input = new Scanner(System.in);
  public static void getInput(){
    System.out.print("Please input value A: ");
    a = input.nextInt();
    System.out.print("Please input value B: ");
    b = input.nextInt();
  }
  public static void menu(){
    System.out.println("==== Math Menu ====");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (x)");
    System.out.println("4. Division (/)");
    System.out.println("5. Quit");
    System.out.print("\n");
  }

  public static void checkIfGotoMenu(String[] args){
    System.out.print("\n");
    System.out.println("Do you want to continue? If no go to Menu.");
    System.out.print("Input your answer(y/n): ");
    System.out.print("Do you want to add more (y/n)?: ");
    str = input.next();
    str = str.toLowerCase();
    if (str.equals("n")){
      main(args);
    }
  }
  public static int addition(int a, int b){
    return a+b;
  }

  public static int subtraction(int a, int b){
    return a-b;
  }
  public static int multiplication(int a, int b){
    return a*b;
  }
  public static int division(int a, int b){
    return a/b;
  }

  public static void main(String[] args) {
    menu();
    System.out.print("Please choose and option: ");
    inp = input.nextInt();
    switch (inp){
      case 1:
        while(true) {
          getInput();
          System.out.println("Answer of A + B = " + addition(a, b));
          checkIfGotoMenu(args);
        }
      case 2:
        while(true){
          getInput();
          System.out.println("Answer of A - B = " + subtraction(a,b));
          checkIfGotoMenu(args);
        }
      case 3:
        while(true){
          getInput();
          System.out.println("Answer of A x B = " + multiplication(a,b));
          checkIfGotoMenu(args);
        }
      case 4:
        while(true){
          getInput();
          System.out.println("Answer of A / B = " + division(a,b));
          checkIfGotoMenu(args);
        }
      case 5:
        System.exit(0);
      default:
        System.out.println("Please choose an option again.");
        main(args);
    }
  }
}
