//Exercise 6
import java.util.Scanner;
public class ex06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number to check whether it is a prime number: ");
    int num = input.nextInt();
    int x;
    boolean checkPrime = false;
    for (x = 2;x<num;x++){
      if (num%x == 0){
        checkPrime = true;
        break;
      }
    }
    if (checkPrime){
      System.out.printf("%d is not a prime number, because it is divided by %d.", num, x);
    }else{
      System.out.println(num + " is a prime number.");
    }
  }
}
