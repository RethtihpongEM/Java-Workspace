import java.sql.*;

public class Main {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaApp"
              ,"root","");
      Statement statement = con.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from student");
      while (resultSet.next()){
        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
      }
      statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      ResultSet resultSet1 = statement.executeQuery("select * from student");
      resultSet1.moveToInsertRow();
      resultSet1.updateInt(1,1003);
      resultSet1.updateString(2,"Panha");
      resultSet1.updateInt(3,21);
      resultSet1.insertRow();
      resultSet1.moveToCurrentRow();
      con.close();
    }catch (Exception e){System.out.println(e);}

  }
}