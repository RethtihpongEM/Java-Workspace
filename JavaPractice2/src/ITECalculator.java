import java.util.Scanner;
public class ITECalculator {

  void createMenu() {
    System.out.println("a. Arithmetic Operators");
    System.out.println("b. Trigonometry Operators");
    System.out.println("c. Bitwise Operators");
  }

  void arithmeticMenu() {
    System.out.println("a. Sum operator");
    System.out.println("b. Minus operator");
    System.out.println("c. Multiply operator");
    System.out.println("d. Divide operator");
    System.out.println("e. Modulo operator");
  }

  void trigonometryMenu() {
    System.out.println("a. Sin in Radian");
    System.out.println("b. Sin in Degree");
    System.out.println("c. Cos in Radian");
    System.out.println("d. Cos in Degree");
    System.out.println("e. Tan in Radian");
    System.out.println("f. Tan in Degree");
  }

  void bitwiseMenu(){
    System.out.println("a. OR Operator");
    System.out.println("b. AND Operator");
    System.out.println("c. XOR Operator");
    System.out.println("d. Bitwise inversion Operator");
    System.out.println("e. Left Shift");
    System.out.println("f. Right Shift");
  }

  public static void main(String[] args) {

    int a, b;
    float c;
    ITECalculator obj = new ITECalculator();
    obj.createMenu();

    Scanner input = new Scanner(System.in);
    System.out.print("Please select option: ");

    String userInput;
    userInput = input.nextLine();

    if (userInput.equals("a")) {
      obj.arithmeticMenu();
      System.out.print("Please select option: ");
      userInput = input.nextLine();
      if (userInput.equals("a") || userInput.equals("b") || userInput.equals("c") || userInput.equals("d") || userInput.equals("e")) {
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        if (userInput.equals("a")) {
          System.out.println("Result = " + Arithmetic.sum(a, b));
        } else if (userInput.equals("b")) {
          System.out.println("Result = " + Arithmetic.minus(a, b));
        } else if (userInput.equals("c")) {
          System.out.println("Result = " + Arithmetic.multiply(a, b));
        } else if (userInput.equals("d")) {
          System.out.println("Result = " + Arithmetic.divide(a, b));
        } else if (userInput.equals("e")) {
          System.out.println("Result = " + Arithmetic.modulo(a, b));
        }
      }else {
        System.out.println("Invalid Input");
      }
    }else if (userInput.equals("b")){
      obj.trigonometryMenu();
      System.out.print("Please select option: ");
      userInput = input.nextLine();
      if (userInput.equals("a") || userInput.equals("b") || userInput.equals("c") || userInput.equals("d") || userInput.equals("e") || userInput.equals("f")) {
        System.out.print("Input: ");
        c = input.nextFloat();
        if (userInput.equals("a")) {
          System.out.println("Result = " + Trigonometry.sin(c));
        } else if (userInput.equals("b")){
          System.out.println("Result = " + Trigonometry.sind((int)c));
        } else if (userInput.equals("c")) {
          System.out.println("Result = " + Trigonometry.cos(c));
        } else if (userInput.equals("d")) {
          System.out.println("Result = " + Trigonometry.cosd((int)c));
        } else if (userInput.equals("e")) {
          System.out.println("Result = " + Trigonometry.tan(c));
        } else if (userInput.equals("f")) {
        System.out.println("Result = " + Trigonometry.tand((int)c));
        }
      }else {
        System.out.println("Invalid Input");
      }
    }else if (userInput.equals("c")){
      obj.bitwiseMenu();
      Bitwise obj1 = new Bitwise();
      System.out.print("Please select option: ");
      userInput = input.nextLine();
      if (userInput.equals("a") || userInput.equals("b") || userInput.equals("c")) {
        System.out.print("Input a: ");
        a = input.nextInt();
        System.out.print("Input b: ");
        b = input.nextInt();
        if (userInput.equals("a")) {
          obj1.logicalOR(a,b);
        } else if (userInput.equals("b")) {
          obj1.logicalAND(a,b);
        } else if (userInput.equals("c")) {
          obj1.XOR(a,b);
        }
      } else if (userInput.equals("d") || userInput.equals("e") || userInput.equals("f")){
        System.out.print("Input: ");
        a = input.nextInt();
        if (userInput.equals("d")) {
          obj1.bitwiseInversion(a);
        } else if (userInput.equals("e")) {
          obj1.leftShift(a);
        } else if (userInput.equals("f")) {
          obj1.rightShift(a);
        }
      }else {
        System.out.println("Invalid Input");
      }
    }
  }
}
