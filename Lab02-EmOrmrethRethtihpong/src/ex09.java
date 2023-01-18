//Exercise 9
import java.util.Scanner;
public class ex09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String inputChar;
    int []arr = new int[100];
    int tmp;
    int count=0;
    while(true){
      System.out.printf("Input value in Array at index %d: ", count);
      arr[count] = input.nextInt();
      System.out.print("Do you want to add more (y/n)?: ");
      inputChar = input.next();
      inputChar = inputChar.toLowerCase();
      if (inputChar.equals("n")){
        break;
      }
      count++;
    }
    for (int i=0;i<count;i++){
      for (int j=i+1;j<count;j++){
        if (arr[i] < arr[j]){
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
    System.out.println("The biggest number among in Array is: "+arr[0]);
  }
}
