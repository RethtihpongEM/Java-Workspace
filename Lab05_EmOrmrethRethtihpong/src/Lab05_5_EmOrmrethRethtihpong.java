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
}
class Students extends Human{
  String major;
  int year;
  Human human = new Human();
}
class SecurityGuard extends Human{
  String place;
  Human human = new Human();
}
public class Lab05_5_EmOrmrethRethtihpong {
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

  static void saveToTeacherFile(String fileName,String firstName, String lastName, String sex, String email, String subject, float salary) throws Exception{
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

  static void saveToStudentFile(String fileName,String firstName, String lastName, String sex, String email, String major, int year) throws Exception{
    FileWriter filewriter = new FileWriter(fileName, true);
    PrintWriter printWriter = new PrintWriter(filewriter);
    printWriter.println(firstName);
    printWriter.println(lastName);
    printWriter.println(sex);
    printWriter.println(email);
    printWriter.println(year);
    printWriter.println(major);
    printWriter.println();
    printWriter.close();
    filewriter.close();
  }
  static void saveToSecurityFile(String fileName,String firstName, String lastName, String sex, String email, String place) throws Exception{
    FileWriter filewriter = new FileWriter(fileName, true);
    PrintWriter printWriter = new PrintWriter(filewriter);
    printWriter.println(firstName);
    printWriter.println(lastName);
    printWriter.println(sex);
    printWriter.println(email);
    printWriter.println(place);
    printWriter.println();
    printWriter.close();
    filewriter.close();
  }
  static void readFromFile(String fileName) throws Exception{
    Scanner scanner = new Scanner(new File(fileName));
    String file = fileName.toUpperCase();
    System.out.println("==== " + file + " ====");
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
        saveToTeacherFile("teacher.txt", teacher.firstName, teacher.lastName, teacher.sex, teacher.email, teacher.subject, teacher.salary);
        break;
      case 2:
        Students students = new Students();
        System.out.print("First name: ");
        scanf.nextLine();
        students.firstName = scanf.nextLine();
        System.out.print("Last name: ");
        students.lastName = scanf.nextLine();
        System.out.print("Sex: ");
        students.sex = scanf.nextLine();
        System.out.print("Email: ");
        students.email = scanf.nextLine();
        System.out.print("Year: ");
        students.year = scanf.nextInt();
        System.out.print("Salary: ");
        scanf.nextLine();
        students.major = scanf.nextLine();
        saveToStudentFile("student.txt",students.firstName, students.lastName, students.sex, students.email, students.major, students.year);
        break;
      case 3:
        SecurityGuard securityGuard = new SecurityGuard();
        System.out.print("First name: ");
        scanf.nextLine();
        securityGuard.firstName = scanf.nextLine();
        System.out.print("Last name: ");
        securityGuard.lastName = scanf.nextLine();
        System.out.print("Sex: ");
        securityGuard.sex = scanf.nextLine();
        System.out.print("Email: ");
        securityGuard.email = scanf.nextLine();
        System.out.print("Position: ");
        securityGuard.place= scanf.nextLine();
        saveToSecurityFile("securityguard.txt", securityGuard.firstName, securityGuard.lastName, securityGuard.sex, securityGuard.email, securityGuard.place);
        break;
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
          System.out.println();
          readFromFile("student.txt");
          System.out.println();
          readFromFile("securityguard.txt");
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
