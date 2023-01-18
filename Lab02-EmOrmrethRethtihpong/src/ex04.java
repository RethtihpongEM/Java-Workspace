//Exercise 4
import java.util.Scanner;
public class ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int second;
    int totalSecond;
    int hour = 0;
    int minute = 0;
    System.out.print("Input number of seconds: ");
    second = input.nextInt();
    totalSecond = second;
    while(second>60){
      if (second>=3600){
        hour = second/3600;
        second = second%3600;
      }else if (second>=60){
        minute = second/60;
        second = second%60;
      }
    }
    System.out.printf("Time corresponding to %d seconds is:: %02d :: %02d :: %02d", totalSecond, hour, minute, second);
  }
}
