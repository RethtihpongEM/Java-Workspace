import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;

public class Database extends User{
  String url;
  String qry = "";
  Connection con;
  Statement statement;
  ResultSet rs;
  PreparedStatement st;
  boolean searchFound = false;
  User user;

  Database(String dbname, String user,String password, int port) throws Exception {
    url = "jdbc:mysql://localhost:" + port + "/" + dbname + "?characterEncoding=utf8";
    con = DriverManager.getConnection(url,user,password);
    statement = con.createStatement();
  }
  public ArrayList<User> fetchFromTable(){
    ArrayList<User> userList = new ArrayList<>();
    try {
      qry = "select * from users";
      rs = statement.executeQuery(qry);
      while (rs.next()){
        user = new User();
        user.setUserID(rs.getInt("userID"));
        user.setFirstName(rs.getString("firstName"));
        user.setLastName(rs.getString("lastName"));
        user.setAge(rs.getInt("age"));
        user.setDate(rs.getString("dateOfBirth"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setPhone(rs.getString("phone"));
        user.setGender(rs.getString("gender"));
        user.setType(rs.getString("type"));
        user.setAddress(rs.getString("address"));
        user.setUserName(rs.getString("userName"));
        userList.add(user);
      }
    }catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return userList;
  }
  public void insertIntoUserTable(){
    user = new User();
    qry = "insert into users (firstName,lastName,age,dateOfBirth,email,phone,gender,type,address) values(?,?,?,?,?,?,?,?,?)";
  }
}