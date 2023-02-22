import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadFromDatabase extends Database{
  ReadFromDatabase(String dbname, String user, String password, int port) throws Exception {
    super(dbname, user, password, port);
  }

  public ArrayList<User> fetchUser(){
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
  public void displayAllUser(){
    ArrayList <User> userArrayList = fetchUser();
    for(int i=0;i<userArrayList.size();i++){
      System.out.println(userArrayList.get(i).getUserName());
    }
  }
}
