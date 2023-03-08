<<<<<<<< HEAD:demo/src/main/java/com/DatabaseFunction/DBConnection.java
package com.DatabaseFunction;
========
package com.example.demo1;
>>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb:demo1/src/main/java/com/example/demo1/DBConnection.java
import java.sql.*;
public class DBConnection {
  public Connection getConnection(String url, String user, String password) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, user, password);
    return connection;
  }
}
  