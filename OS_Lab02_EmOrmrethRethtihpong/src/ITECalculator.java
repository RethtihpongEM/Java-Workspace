import java.util.Scanner;
public class ITECalculator {

  void createMenu() {
    System.out.println("1. Arithmetic Operators");
    System.out.println("2. Trigonometry Operators");
    System.out.println("3. Bitwise Operators");
    System.out.println("4. Storage Converter");
  }

  void arithmeticMenu() {
    System.out.println("1. Sum operator");
    System.out.println("2. Minus operator");
    System.out.println("3. Multiply operator");
    System.out.println("4. Divide operator");
    System.out.println("5. Modulo operator");
  }

  void trigonometryMenu() {
    System.out.println("1. Sin in Radian");
    System.out.println("2. Sin in Degree");
    System.out.println("3. Cos in Radian");
    System.out.println("4. Cos in Degree");
    System.out.println("5. Tan in Radian");
    System.out.println("6. Tan in Degree");
  }

  void bitwiseMenu(){
    System.out.println("1. OR Operator");
    System.out.println("2. AND Operator");
    System.out.println("3. XOR Operator");
    System.out.println("4. Bitwise inversion Operator");
    System.out.println("5. Left Shift");
    System.out.println("6. Right Shift");
  }

  void storageConverterMenu(){
    System.out.println("1. Byte");
    System.out.println("2. Kilobyte");
    System.out.println("3. Megabyte");
    System.out.println("4. Gigabyte");
    System.out.println("5. Terabyte");
    System.out.println("6. Petabyte");
  }

  public static void main(String[] args) {

    int a, b;
    float c;
    long d;
    ITECalculator obj = new ITECalculator();
    obj.createMenu();

    Scanner input = new Scanner(System.in);
    System.out.print("Please select option: ");

    int userInput;
    userInput = input.nextInt();

    if (userInput == 1) {
      obj.arithmeticMenu();
      System.out.print("Please select option: ");
      userInput = input.nextInt();
      if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5) {
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        if (userInput == 1) {
          System.out.println("Result = " + Arithmetic.sum(a, b));
        } else if (userInput == 2) {
          System.out.println("Result = " + Arithmetic.minus(a, b));
        } else if (userInput == 3) {
          System.out.println("Result = " + Arithmetic.multiply(a, b));
        } else if (userInput == 4) {
          System.out.println("Result = " + Arithmetic.divide(a, b));
        } else if (userInput == 5) {
          System.out.println("Result = " + Arithmetic.modulo(a, b));
        }
      }else {
        System.out.println("Invalid Input");
      }
    }else if (userInput == 2){
      obj.trigonometryMenu();
      System.out.print("Please select option: ");
      userInput = input.nextInt();
      if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5 || userInput == 6) {
        System.out.print("Input: ");
        c = input.nextFloat();
        if (userInput == 1) {
          System.out.println("Result = " + Trigonometry.sin(c));
        } else if (userInput == 2){
          System.out.println("Result = " + Trigonometry.sind((int)c));
        } else if (userInput == 3) {
          System.out.println("Result = " + Trigonometry.cos(c));
        } else if (userInput == 4) {
          System.out.println("Result = " + Trigonometry.cosd((int)c));
        } else if (userInput == 5) {
          System.out.println("Result = " + Trigonometry.tan(c));
        } else if (userInput == 6) {
          System.out.println("Result = " + Trigonometry.tand((int)c));
        }
      }else {
        System.out.println("Invalid Input");
      }
    }else if (userInput == 3){
      obj.bitwiseMenu();
      Bitwise obj1 = new Bitwise();
      System.out.print("Please select option: ");
      userInput = input.nextInt();
      if (userInput == 1 || userInput == 2 || userInput == 3) {
        System.out.print("Input a: ");
        a = input.nextInt();
        System.out.print("Input b: ");
        b = input.nextInt();
        if (userInput == 1) {
          obj1.logicalOR(a,b);
        } else if (userInput == 2) {
          obj1.logicalAND(a,b);
        } else if (userInput == 3) {
          obj1.XOR(a,b);
        }
      } else if (userInput == 4 || userInput == 5 || userInput == 6){
        System.out.print("Input: ");
        a = input.nextInt();
        if (userInput == 4) {
          obj1.bitwiseInversion(a);
        } else if (userInput == 5) {
          obj1.leftShift(a);
        } else if (userInput == 6) {
          obj1.rightShift(a);
        }
      }else {
        System.out.println("Invalid Input");
      }
    }else if (userInput == 4){
      obj.storageConverterMenu();
      System.out.print("Please select option: ");
      userInput = input.nextInt();
      if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5 || userInput == 6) {
        if (userInput == 1) {
          System.out.print("Enter byte: ");
          d = input.nextLong();
          System.out.println("Result = " + StorageConverter.byte2KB(d) + " Kilobyte");
          System.out.println("Result = " + StorageConverter.byte2MB(d) + " Megabyte");
          System.out.println("Result = " + StorageConverter.byte2GB(d) + " Gigabyte");
          System.out.println("Result = " + StorageConverter.byte2TB(d) + " Terabyte");
          System.out.println("Result = " + StorageConverter.byte2PB(d) + " Petabyte");
        } else if (userInput == 2) {
          System.out.print("Enter kilobyte: ");
          d = input.nextLong();
          System.out.println("Result = " + StorageConverter.kb2Byte(d) + " Byte");
          System.out.println("Result = " + StorageConverter.kb2MB(d) + " Megabyte");
          System.out.println("Result = " + StorageConverter.kb2GB(d) + " Gigabyte");
          System.out.println("Result = " + StorageConverter.kb2TB(d) + " Terabyte");
          System.out.println("Result = " + StorageConverter.kb2PB(d) + " Petabyte");
        } else if (userInput == 3) {
          System.out.print("Enter Megabyte: ");
          d = input.nextLong();
          System.out.println("Result = " + StorageConverter.mb2Byte(d) + " Byte");
          System.out.println("Result = " + StorageConverter.mb2KB(d) + " Kilobyte");
          System.out.println("Result = " + StorageConverter.mb2GB(d) + " Gigabyte");
          System.out.println("Result = " + StorageConverter.mb2TB(d) + " Terabyte");
          System.out.println("Result = " + StorageConverter.mb2PB(d) + " Petabyte");
        } else if (userInput == 4) {
          System.out.print("Enter Gigabyte: ");
          d = input.nextLong();
          System.out.println("Result = " + StorageConverter.gb2Byte(d) + " Byte");
          System.out.println("Result = " + StorageConverter.gb2KB(d) + " Kilobyte");
          System.out.println("Result = " + StorageConverter.gb2MB(d) + " Megabyte");
          System.out.println("Result = " + StorageConverter.gb2TB(d) + " Terabyte");
          System.out.println("Result = " + StorageConverter.gb2PB(d) + " Petabyte");
        } else if (userInput == 5) {
          System.out.print("Enter Terabyte: ");
          d = input.nextLong();
          System.out.println("Result = " + StorageConverter.tb2Byte(d) + " Byte");
          System.out.println("Result = " + StorageConverter.tb2KB(d) + " Kilobyte");
          System.out.println("Result = " + StorageConverter.tb2MB(d) + " Megabyte");
          System.out.println("Result = " + StorageConverter.tb2GB(d) + " Gigabyte");
          System.out.println("Result = " + StorageConverter.tb2PB(d) + " Petabyte");
        } else if (userInput == 6){
          System.out.print("Enter Petabyte: ");
          d = input.nextLong();
          System.out.println("Result = " + StorageConverter.pb2Byte(d) + " Byte");
          System.out.println("Result = " + StorageConverter.pb2KB(d) + " Kilobyte");
          System.out.println("Result = " + StorageConverter.pb2MB(d) + " Megabyte");
          System.out.println("Result = " + StorageConverter.pb2GB(d) + " Gigabyte");
          System.out.println("Result = " + StorageConverter.pb2TB(d) + " Terabyte");
        }
      }else {
        System.out.println("Invalid Input");
      }
    }
  }
}
