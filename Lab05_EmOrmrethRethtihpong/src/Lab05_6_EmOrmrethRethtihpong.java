import java.io.*;
import java.util.Scanner;

class User{
  String firstName;
  String lastName;
  String userName;
  String email;
  String password;
}
public class Lab05_6_EmOrmrethRethtihpong {
  static void menu(){
   System.out.println("==== Menu ====");
   System.out.println("1. Login");
   System.out.println("2. Register");
   System.out.println("3. Quit");
   System.out.print("Choose an option: ");
  }
  static void register(String firstName, String lastName, String username, String email, String password) throws IOException {
    FileWriter filewriter = new FileWriter("user.txt", true);
    PrintWriter printWriter = new PrintWriter(filewriter);
    printWriter.println(firstName);
    printWriter.println(lastName);
    printWriter.println(username);
    printWriter.println(email);
    printWriter.println(password);
    printWriter.println();
    printWriter.close();
    filewriter.close();
  }
  static void login(String email, String password) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("user.txt"));
    String []tempArr = new String[10];
    int line = 0;
    boolean checkFound = false;
    while (scanner.hasNextLine()){
      String currentLine = scanner.nextLine();
      tempArr[line] = currentLine;
      if(currentLine.isEmpty()){
        if((email.equals(tempArr[3]) && password.equals(tempArr[4]) || (email.equals(tempArr[2]) && password.equals(tempArr[4])))){
          System.out.println("Login successful");
          checkFound = true;
          break;
        }else{
          line = 0;
        }
      }else{
        line++;
      }
    }
    if(checkFound){
      System.out.println("===== User Info =====");
      System.out.println("Hi " + tempArr[0] + " " + tempArr[1]);
      System.out.println("Your username is: " + tempArr[2]);
      System.out.println("Your email is: " + tempArr[3]);
    }else{
      System.out.println("User not found. Please try again");
    }
  }
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int input;
    do {
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          String email;
          String password;
          System.out.print("Email or Username: ");
          scanner.nextLine();
          email = scanner.nextLine();
          System.out.print("Password: ");
          password = scanner.nextLine();
          login(email, password);
          break;
        case 2:
          User user = new User();
          System.out.println("==== Register a new user ====");
          System.out.print("First name: ");
          scanner.nextLine();
          user.firstName = scanner.nextLine();
          System.out.print("Last name: ");
          user.lastName = scanner.nextLine();
          System.out.print("Username: ");
          user.userName = scanner.nextLine();
          System.out.print("Email: ");
          user.email = scanner.nextLine();
          System.out.print("Password: ");
          user.password = scanner.nextLine();
          register(user.firstName, user.lastName, user.userName, user.email, user.password);
          break;
        case 3:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid option...");
          break;
      }
    }while (true);
  }
}
