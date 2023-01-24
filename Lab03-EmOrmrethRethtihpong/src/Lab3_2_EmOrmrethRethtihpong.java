import java.util.*;
public class Lab3_2_EmOrmrethRethtihpong {
  public static void main(String[] args) {
    System.out.println("How many number to be input? ");
    System.out.print("Number of input: ");
    Scanner input = new Scanner(System.in);
    int SIZE = input.nextInt();
    int []arrNum = new int[SIZE];
    int sum = 0;
    for (int i=0;i<SIZE;i++){
      System.out.printf("Value #%d: ", i+1);
      arrNum[i] = input.nextInt();
      sum += arrNum[i];
    }

    int tmp;
    for (int i=0;i<SIZE;i++){
      for (int j=i+1;j<SIZE;j++){
        if (arrNum[i]>arrNum[j]){
          tmp = arrNum[i];
          arrNum[i] = arrNum[j];
          arrNum[j] = tmp;
        }
      }
    }
    float average = ((float)sum/SIZE);
    System.out.println();
    System.out.println("Max: " + arrNum[SIZE-1]);
    System.out.println("Min: " + arrNum[0]);
    System.out.printf("Average: %.2f\n", average);
    System.out.println("Sum: " + sum);

  }
}
