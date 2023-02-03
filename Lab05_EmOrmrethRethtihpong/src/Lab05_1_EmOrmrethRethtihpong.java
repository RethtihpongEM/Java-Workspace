import java.util.*;
import java.io.*;

class Human{
  String firstName;
  String lastName;
  String sex;
  String email;
}
class Teacher extends Human{
  String subject;
  float salary;
  Human human = new Human();
  void setValue(String firstName, String lastName, String sex, String email, String subject, float salary)
  {
    human.firstName = firstName;
    human.lastName = lastName;
    human.sex = sex;
    human.email = email;
    this.subject = subject;
    this.salary = salary;
  }
  void display(int i){
    System.out.printf("%d [%-20s] [%-20s] [%-4s] [%-30s] [%-30s] [%-8f]\n",(i+1), human.firstName,human.lastName, human.sex, human.email, subject, salary);
  }
}
public class Lab05_1_EmOrmrethRethtihpong {
  static void mainMenu(){
    System.out.println("==== Menu ====");
    System.out.println("1. View all");
    System.out.println("2. Add new");
    System.out.println("3. Quit");
    System.out.print("Choose an option: ");
  }

  static boolean askIfContinue(String keyword){
    Scanner input = new Scanner(System.in);
    System.out.print("Do you want to " + keyword + " (y/n): " );
    String userInput = input.next();
    userInput = userInput.toLowerCase();
    return !userInput.equals("n");
  }

  static void addNewMenu(){
    System.out.println("1. Teacher");
    System.out.println("2. Student");
    System.out.println("3. Security guard");
    System.out.print("Choose an option: ");
  }

  static void addNew() throws Exception{
    Scanner scanf = new Scanner(System.in);
    addNewMenu();
    int inputInt;
    String inputString;
    inputInt = scanf.nextInt();
    switch (inputInt){
      case 1:
        Teacher teacher = new Teacher();
        FileWriter filewriter = new FileWriter("teacher.txt", true);
        PrintWriter printWriter = new PrintWriter(filewriter);
        System.out.print("First name: ");
        scanf.nextLine();
        teacher.firstName = scanf.nextLine();
        printWriter.println(teacher.firstName);
        System.out.print("Last name: ");
        teacher.lastName = scanf.nextLine();
        printWriter.println(teacher.lastName);
        System.out.print("Sex: ");
        teacher.sex = scanf.nextLine();
        printWriter.println(teacher.sex);
        System.out.print("Email: ");
        teacher.email = scanf.nextLine();
        printWriter.println(teacher.email);
        System.out.print("Subject: ");
        teacher.subject = scanf.nextLine();
        printWriter.println(teacher.subject);
        System.out.print("Salary: ");
        teacher.salary = scanf.nextFloat();
        printWriter.println(teacher.salary);
        printWriter.println();
        printWriter.close();
        filewriter.close();
    }
  }

  public static void main(String[] args) throws Exception{
    Scanner scanf = new Scanner(System.in);
    int inputInt;
    do {
      mainMenu();
      inputInt = scanf.nextInt();
      switch (inputInt){
        case 1:
          addNew();
          break;
        case 2:
          do {
          }while (askIfContinue("continue"));
          break;
        case 3:
          if(askIfContinue("exit")){
            System.exit(0);
          }
        default:

      }
    }while (true);
  }
}
