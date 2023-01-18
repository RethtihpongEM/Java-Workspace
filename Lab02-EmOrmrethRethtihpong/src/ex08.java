//Exercise 8
import java.util.Scanner;
public class ex08 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int []arr = new int[5];
    int tmp;
    System.out.print("Input value of A: ");
    arr[0] = input.nextInt();
    System.out.print("Input value of B: ");
    arr[1] = input.nextInt();
    System.out.print("Input value of C: ");
    arr[2] = input.nextInt();
    System.out.print("Input value of D: ");
    arr[3] = input.nextInt();
    System.out.print("Input value of E: ");
    arr[4] = input.nextInt();
    for (int i=0;i<5;i++){
      for (int j=i+1;j<5;j++){
        if (arr[i] > arr[j]){
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
    System.out.println("The smallest number among A,B,C,D and E is: "+arr[0]);
  }
}
