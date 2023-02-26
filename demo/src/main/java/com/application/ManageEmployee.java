package com.application;
import com.application.DBConnection;
import com.application.QueryFunction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ManageEmployee extends QueryFunction{
  DBConnection con = new DBConnection();
  private final Statement statement;
  private final User user = new User();
  public ManageEmployee() throws Exception {
    Connection connection = con.getConnection("jdbc:mysql://localhost:3306/possys", "root", "");
    this.statement = connection.createStatement();
  }


  public ObservableList<User> fetchUser(){
  ObservableList <User> userList = FXCollections.observableArrayList();
    try {
      String qry = "select * from users";
      ResultSet rs = statement.executeQuery(qry);
      while (rs.next()){
        User user = new User();
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


  public void displayAllEmployee(){
    System.out.println("OK");
  }
}
