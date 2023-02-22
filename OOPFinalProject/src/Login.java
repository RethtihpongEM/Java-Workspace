import java.sql.SQLException;

public class Login{
  public boolean authentication(Database database,String value,String password){
    boolean login = false;
    try{
      database.qry = "select * from users where userName = \"" + value + "\" || " +
              "email = \"" + value + "\"";
      database.pst =database.con.prepareStatement(database.qry);
      database.rs = database.pst.executeQuery();
      if(database.rs.next() == false){
        System.out.println("User not found");
      }else{
        User user = new User();
        user.setPassword(database.rs.getString("password"));
        if(password.equals(user.getPassword())){
          login = true;
        }
      }
    } catch (
            SQLException e) {
      throw new RuntimeException(e);
    }
    return login;
  }
}
