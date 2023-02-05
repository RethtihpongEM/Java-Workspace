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

  static void saveToFile(String fileName,String firstName, String lastName, String sex, String email, String subject, float salary) throws Exception{
    FileWriter filewriter = new FileWriter(fileName, true);
    PrintWriter printWriter = new PrintWriter(filewriter);
    printWriter.println(firstName);
    printWriter.println(lastName);
    printWriter.println(sex);
    printWriter.println(email);
    printWriter.println(subject);
    printWriter.println(salary);
    printWriter.println();
    printWriter.close();
    filewriter.close();
  }
  static void readFromFile(String fileName) throws Exception{
    Scanner scanner = new Scanner(new File(fileName));
    System.out.println("=== " + fileName + " ===");
    while (scanner.hasNextLine()){
      String line = scanner.nextLine();
      if (line.isEmpty()){
        System.out.println();
      }else{
      System.out.print("[" + line + "]");
      }
    }
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
        System.out.print("First name: ");
        scanf.nextLine();
        teacher.firstName = scanf.nextLine();
        System.out.print("Last name: ");
        teacher.lastName = scanf.nextLine();
        System.out.print("Sex: ");
        teacher.sex = scanf.nextLine();
        System.out.print("Email: ");
        teacher.email = scanf.nextLine();
        System.out.print("Subject: ");
        teacher.subject = scanf.nextLine();
        System.out.print("Salary: ");
        teacher.salary = scanf.nextFloat();
        saveToFile("teacher.txt", teacher.firstName, teacher.lastName, teacher.sex, teacher.email, teacher.subject, teacher.salary);
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
          readFromFile("teacher.txt");
          break;
        case 2:
          do {
            addNew();
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
