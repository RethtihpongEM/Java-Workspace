import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;

public class Database extends User{
  String url;
  String qry = "";
  Connection con;
  Statement statement;
  ResultSet rs;
  PreparedStatement pst;
  boolean searchFound = false;
  User user;

  Database(String dbname, String user,String password, int port) throws Exception {
    url = "jdbc:mysql://localhost:" + port + "/" + dbname + "?characterEncoding=utf8";
    con = DriverManager.getConnection(url,user,password);
    statement = con.createStatement();
  }
}