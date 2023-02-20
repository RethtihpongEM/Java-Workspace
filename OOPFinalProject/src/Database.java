import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class Database{
  String url;
  String qry = "";
  Connection con;
  Statement statement;
  ResultSet rs;
  PreparedStatement st;
  boolean searchFound = false;

  Database(String dbname, String user,String password, int port) throws Exception {
    url = "jdbc:mysql://localhost:" + port + "/" + dbname;
    con = DriverManager.getConnection(url,user,password);
    statement = con.createStatement();
  }
  void insertToDatabase(int ID, String username, String password){

    try{
      qry = "insert into users (id,username,password) values(?,?,?)";
      st = con.prepareStatement(qry);
      st.setInt(1, ID);
      st.setString(2, username);
      st.setString(3, password);
      st.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  void searchFromDatabase(int ID)  {
    try {
      qry = "select id,username,password from users where id=?";
      st = con.prepareStatement(qry);
      st.setInt(1,ID);
      rs = st.executeQuery();
      if(rs.next() == false){
        System.out.println("Sorry user not found");
      }else{
        System.out.println(rs.getString("username"));
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
