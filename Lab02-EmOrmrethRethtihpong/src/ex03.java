//Exercise 3
import java.util.Scanner;
public class ex03 {
  public static int i = 0;
  public static String[] answers = new String[8];
  public static void inputOpt(){
    Scanner input = new Scanner(System.in);
    answers[i] = input.nextLine();
    i++;
  }
  public static void main(String[] args) {
    System.out.println("==== Covid-19 Screen Health ====");
    System.out.print("Q1. Feeling feverish and/or having chills? ");
    inputOpt();
    System.out.print("Q2. Has there been any use of fever reducing medication within the last" +
            "24 hours not due to another health condition? ");
    inputOpt();
    System.out.print("Q3. A new cough that is not due to another health condition? ");
    inputOpt();
    System.out.print("Q4. New chills that are not due to another health condition? ");
    inputOpt();
    System.out.print("Q5. A new sore throat that is not due to another health condition? ");
    inputOpt();
    System.out.print("Q6. A new loss of taste or smell? ");
    inputOpt();
    System.out.print("Q7. Have you had a positive test for the virus that causes COVID-19" +
            "disease within the past 10 days? ");
    inputOpt();
    System.out.print("Q8. In the past 14 days, have you had close contact (within about 6 feet for 15" +
            "minutes or more) with someone with suspected or confirmed COVID-19? ");
    inputOpt();
    System.out.println("=================================");
    System.out.println("| Questions\t\t| Answers\t\t|");
    System.out.println("=================================");
    System.out.println("| Q1\t\t\t|" +" "+answers[0]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q2\t\t\t|" +" "+answers[1]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q3\t\t\t|" +" "+answers[2]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q4\t\t\t|" +" "+answers[3]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q5\t\t\t|" +" "+answers[4]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q6\t\t\t|" +" "+answers[5]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q7\t\t\t|" +" "+answers[6]+"\t\t\t|");
    System.out.println("---------------------------------");
    System.out.println("| Q8\t\t\t|" +" "+answers[7]+"\t\t\t|");
  }
}
