import java.util.Scanner;

class Math2{
  int sum(int a, int b){
    return a+b;
  }
  int sum(int a,int b, int c){
    return a+b+c;
  }
  int sum(int []values){
    int result = 0;
    for(int i=0;i<values.length;i++){
      result += values[i];
    }
    return result;
  }
  int multiply(int a, int b){
    return a*b;
  }
  int multiply(int a,int b,int c){
    return a*b*c;
  }
  int multiply(int []values){
    int result = 1;
    for(int i=0;i<values.length;i++){
      result *= values[i];
    }
    return result;
  }
  int max(int a,int b,int c){
    return Math.max(Math.max(a,b),c);
  }
  int max(int a,int b,int c,  int d){
    return Math.max(Math.max(Math.max(a,b),c),d);
  }
  int max(int []values){
    int temp;
    for(int i =0;i<values.length;i++){
      for(int j=0;j< values.length;j++){
        if (values[i] < values[j]){
          temp = values[i];
          values[i] = values[j];
          values[j] = temp;
        }
      }
    }
    return values[values.length-1];
  }
  int min(int a, int b, int c){
    return Math.min(Math.min(a,b),c);
  }
  int min(int a, int b, int c, int d){
    return Math.min(Math.min(Math.min(a,b),c),d);
  }
  int min(int []values){
    int temp;
    for(int i =0;i<values.length;i++){
      for(int j=0;j< values.length;j++){
        if (values[i] < values[j]){
          temp = values[i];
          values[i] = values[j];
          values[j] = temp;
        }
      }
    }
    return values[0];
  }
  double average(int a, int b, int c){
    return (double)((a+b+c)/3);
  }
  double average(int a, int b,int c, int d){
    return (double)((a+b+c+d)/4);
  }
  double average(int []values){
    int sum=0;
    for (int i=0;i<values.length;i++){
      sum+=values[i];
    }
  return (double)(sum/values.length);
  }
}
public class Lab06_2_EmOrmrethRethtihpong {
  static void menu(){
    System.out.println("==== Menu ====");
    System.out.println("1. Sum of two values");
    System.out.println("2. Sum of three values");
    System.out.println("3. Sum of many values");
    System.out.println("4. Multiply of two values");
    System.out.println("5. Multiply of three values");
    System.out.println("6. Multiply of many values");
    System.out.println("7. Max of three values");
    System.out.println("8. Max of four values");
    System.out.println("9. Max of many values");
    System.out.println("10. Min of three values");
    System.out.println("11. Min of four values");
    System.out.println("12. Min of many values");
    System.out.println("13. Average of three values");
    System.out.println("14. Average of four values");
    System.out.println("15. Average of many values");
    System.out.println("16. Quit");
    System.out.print("Choose an opt: ");
  }
  static int[] inputArray(){
    Scanner scanner = new Scanner(System.in);
    int [] input;
    System.out.print("How many number do you wan to input? : ");
    int size = scanner.nextInt();
    input = new int[size];
    for(int i=0;i<size;i++){
      System.out.print("Input: ");
      input[i] = scanner.nextInt();
    }
    return input;
  }
  static int inputA(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input A: ");
    int input = scanner.nextInt();
    return input;
  }
  static int inputB(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input B: ");
    int input = scanner.nextInt();
    return input;
  }
  static int inputC(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input C: ");
    int input = scanner.nextInt();
    return input;
  }
  static int inputD(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input D: ");
    int input = scanner.nextInt();
    return input;
  }
  static boolean askIfContinue(){
    System.out.print("Do you want to continue(y/n)?: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    input = input.toLowerCase();
    return input.equals("y") || input.equals("yes");
  }
  public static void main(String[] args) {
    Math2 math2 = new Math2();
    Scanner scanner = new Scanner(System.in);
    int input;
    do {
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          do {
            System.out.println("::: Sum of two values :::");
            System.out.println("Result: " + math2.sum(inputA(),inputB()));
          }while (askIfContinue());
          break;
        case 2:
          do {
            System.out.println("::: Sum of three values :::");
            System.out.println("Result: " + math2.sum(inputA(),inputB(), inputC()));
          }while (askIfContinue());
          break;
        case 3:
          do {
            System.out.println("::: Sum of many values :::");
            System.out.println("Result: " + math2.sum(inputArray()));
          }while (askIfContinue());
          break;
        case 4:
          do {
            System.out.println("::: Multiplu of two values :::");
            System.out.println("Result: " + math2.multiply(inputA(),inputB()));
          }while (askIfContinue());
          break;
        case 5:
          do {
            System.out.println("::: Multiplu of three values :::");
            System.out.println("Result: " + math2.multiply(inputA(),inputB(), inputC()));
          }while (askIfContinue());
          break;
        case 6:
          do {
            System.out.println("::: Multiplu of many values :::");
            System.out.println("Result: " + math2.multiply(inputArray()));
          }while (askIfContinue());
          break;
        case 7:
          do {
            System.out.println("::: Max of three values :::");
            System.out.println("Result: " + math2.max(inputA(),inputB(),inputC()));
          }while (askIfContinue());
          break;
        case 8:
          do {
            System.out.println("::: Max of four values :::");
            System.out.println("Result: " + math2.max(inputA(),inputB(), inputC(),inputD()));
          }while (askIfContinue());
          break;
        case 9:
          do {
            System.out.println("::: Max of many values :::");
            System.out.println("Result: " + math2.max(inputArray()));
          }while (askIfContinue());
          break;
        case 10:
          do {
            System.out.println("::: Min of three values :::");
            System.out.println("Result: " + math2.min (inputA(),inputB(),inputC()));
          }while (askIfContinue());
          break;
        case 11:
          do {
            System.out.println("::: Min of four values :::");
            System.out.println("Result: " + math2.min (inputA(),inputB(), inputC(),inputD()));
          }while (askIfContinue());
          break;
        case 12:
          do {
            System.out.println("::: Min of many values :::");
            System.out.println("Result: " + math2.min (inputArray()));
          }while (askIfContinue());
          break;
        case 13:
          do {
            System.out.println("::: Average of three values :::");
            System.out.println("Result: " + math2.average(inputA(),inputB(),inputC()));
          }while (askIfContinue());
          break;
        case 14:
          do {
            System.out.println("::: Average of four values :::");
            System.out.println("Result: " + math2.average(inputA(),inputB(), inputC(),inputD()));
          }while (askIfContinue());
          break;
        case 15:
          do {
            System.out.println("::: Average of many values :::");
            System.out.println("Result: " + math2.average(inputArray()));
          }while (askIfContinue());
          break;
        case 16:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid input....");
          break;
      }
    }while (true);
  }
}
