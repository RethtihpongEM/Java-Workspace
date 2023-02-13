import java.util.Scanner;

class AbstractMath{
  int reverseNumber(int number){
    return 0;
  }
  int roundedNumber(double num){
    return 0;
  }
  int countDistinct(int [] values){
    return 0;
  }
  int decimalToBinary(int decimal){
    return 0;
  }
}
class MATH extends AbstractMath{
  int reverseNumber(int number){
    int reverse = 0;
    while(number!= 0){
      reverse = (reverse*10) + (number%10);
      number = number/10;
    }
    return reverse;
  }
  int roundedNumber(double num){
    int number = (int)num;
    double decimalPart = num - number;
    if (decimalPart >= 0.5){
      num = num+1;
    }
    return (int)(num);
  }
  int countDistinct(int[] values){
    int count=0;
    for(int i=0;i<values.length;i++){
      int j;
      for (j=0;j< values.length;j++){
        if (values[i] == values[j]){
          break;
        }
      }
      if(j==i){
        count++;
      }
    }

    return count;
  }
  int decimalToBinary(int decimal){
    int binary=0;
    int power = 1;
    while(decimal>0){
      binary += (decimal%2) * power;
      decimal /= 2;
      power = power*10;
    }
    return binary;
  }
}
public class Lab06_1_EmOrmrethRethtihpong {
  static void mainMenu(){
    System.out.println("==== Menu ====");
    System.out.println("1. Reverse a number");
    System.out.println("2. Rounded number");
    System.out.println("3. Count distinct number");
    System.out.println("4. Decimal to Binary");
    System.out.println("5. Quit");
    System.out.print("Choose an opt: ");
  }
  static boolean askIfContinue(){
    System.out.print("Do you want to continue(y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }
  static void reverseANumber(){
    Scanner scanner = new Scanner(System.in);
    MATH math = new MATH();
    System.out.println("::: Reverse a number :::");
    System.out.print("Input number: ");
    int input = scanner.nextInt();
    System.out.println("Output: " + math.reverseNumber(input));
  }
  static void roundedNumber(){
    Scanner scanner = new Scanner(System.in);
    MATH math = new MATH();
    System.out.println("::: Rounded number :::");
    System.out.print("Input number: ");
    double input = scanner.nextDouble();
    System.out.println("Output: " + math.roundedNumber(input));
  }

  static void countDistinctNumber(){
    Scanner scanner = new Scanner(System.in);
    MATH math = new MATH();
    System.out.println("::: Count Distinct number :::");
    System.out.print("How many number do you want to input? : ");
    int size = scanner.nextInt();
    int [] input = new int[size];
    for (int i=0;i<size;i++){
    System.out.print("Input number: ");
    input[i] = scanner.nextInt();
    }
    System.out.print("Array: { ");
    for(int i=0;i<size;i++){
      System.out.print(input[i]+" ");
    }
    System.out.println("} -> " + math.countDistinct(input));
  }
  static void decimalToBinary(){
    Scanner scanner = new Scanner(System.in);
    MATH math = new MATH();
    System.out.println("::: Decimal to Binary :::");
    System.out.print("Decimal: ");
    int input = scanner.nextInt();
    System.out.println("Binary: " + math.decimalToBinary(input));
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input;
    do {
      mainMenu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          do {
            reverseANumber();
          }while (askIfContinue());
          break;
        case 2:
          do {
            roundedNumber();
          }while (askIfContinue());
          break;
        case 3:
          do {
            countDistinctNumber();
          }while (askIfContinue());
          break;
        case 4:
          do {
            decimalToBinary();
          }while (askIfContinue());
          break;
        case 5:
          System.exit(0);
      }
    }while (true);
  }
}
