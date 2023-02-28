import com.mysql.jdbc.log.Log;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//  static void showAllUserPage(Database database){
//    JFrame f = new JFrame("POS SYSTEM");
//
//    ArrayList<User> userArrayList = database.fetchFromTable();
//    DefaultTableModel header = new DefaultTableModel();
//    header.addColumn("ID");
//    header.addColumn("Username");
//    header.addColumn("First name");
//    header.addColumn("Last name");
//    header.addColumn("Age");
//    header.addColumn("Gender");
//    header.addColumn("Date of Birth");
//    header.addColumn("Address");
//    header.addColumn("Email");
//    header.addColumn("Password");
//    header.addColumn("Phone Number");
//
//    JTable userTable = new JTable(header);
//    DefaultTableModel model = (DefaultTableModel) userTable.getModel();
//    for(int i=0;i<userArrayList.size();i++){
//      model.addRow(new Object[]{
//              userArrayList.get(i).getUserID(),
//              userArrayList.get(i).getUserName(),
//              userArrayList.get(i).getFirstName(),
//              userArrayList.get(i).getLastName(),
//              userArrayList.get(i).getAge(),
//              userArrayList.get(i).getGender(),
//              userArrayList.get(i).getDate(),
//              userArrayList.get(i).getAddress(),
//              userArrayList.get(i).getEmail(),
//              userArrayList.get(i).getPassword(),
//              userArrayList.get(i).getPhone()
//      });
//    }
//    JScrollPane sp = new JScrollPane(userTable);
//    f.add(sp);
//    f.setExtendedState(JFrame.MAXIMIZED_BOTH);
//    f.setVisible(true);
//    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//  }
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
//    Database database = new Database("possystem","root","",3306);
//    loginPage(database);
//    Login login = new Login();
//    if (login.authentication(database,"admin@domain.com","admin")){
//      System.out.println("Successful");
//    }else{
//      System.out.println("Failed");
//    }
    ReadFromDatabase readFromDatabase = new ReadFromDatabase("possystem","root","",3306);
    readFromDatabase.displayAllUser();
  }
//  private static void loginPage(Database database){
//
//  }
}