package com.application;
import com.application.DBConnection;
import com.application.QueryFunction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.Date;

import java.sql.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class ManageEmployee extends QueryFunction{
  DBConnection con = new DBConnection();
  private final Statement statement;
  private final User user = new User();
  Connection connection;
  public ManageEmployee() throws Exception {
    connection = con.getConnection("jdbc:mysql://localhost:3306/possys", "root", "");
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

  public void insertEmployee(String firstName,String lastName,int age,String date,
                             String address,String telephone,String email,String password,String userName,String types,String gender)
  {
      Date date1 = Date.valueOf(date);
    try {
      String qry = "INSERT into users (firstName,lastName,age,dateOfBirth,email,password,phone,gender,type,address,userName)"
              + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      PreparedStatement psmt = connection.prepareStatement(qry);
      psmt.setString(1,firstName);
      psmt.setString(2,lastName);
      psmt.setInt(3,age);
      psmt.setDate(4,date1);
      psmt.setString(5,email);
      psmt.setString(6,password);
      psmt.setString(7,telephone);
      psmt.setString(8,gender);
      psmt.setString(9,types);
      psmt.setString(10,address);
      psmt.setString(11,userName);
      psmt.execute();
    }catch (Exception e){
      System.out.println(e);
    }
  }
}
