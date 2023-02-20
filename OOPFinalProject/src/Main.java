import javax.swing.plaf.nimbus.State;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {
  static void menu(){
    System.out.println("==== CRUD OPERATION ====");
    System.out.println("1. Create user");
    System.out.println("2. Read user");
    System.out.println("3. Update user");
    System.out.println("4. Delete user");
    System.out.print("Enter a choice");
  }
  static void readUserMenu(){
    System.out.println("==== Read user ====");
    System.out.println("1. Search by ID");
    System.out.println("2. Display all user");
    System.out.print("Enter a choice");
  }
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int input;
    Class.forName("com.mysql.jdbc.Driver");
    Database database = new Database("POSuser", "root", "", 3306);
    String inputString;
    User POSuser;
    while (true){
      menu();
      input = scanner.nextInt();
      switch (input){
        case 1:
          POSuser = new User();
          System.out.println("1. Insert New Data");
          System.out.print("Enter ID: ");
          POSuser.setID(scanner.nextInt());
          System.out.print("Enter Name : ");
          scanner.nextLine();
          POSuser.setUsername(scanner.nextLine());
          System.out.print("Enter Password : ");
          POSuser.setPassword(scanner.nextLine());
          database.insertToDatabase(POSuser.getID(), POSuser.getUsername(), POSuser.getPassword());
          System.out.println("Data Insert Success");
          break;
        case 2:
          POSuser = new User();
          System.out.print("Input ID: ");
          POSuser.setID(scanner.nextInt());
          database.searchFromDatabase(POSuser.getID());
      }
    }
  }
}