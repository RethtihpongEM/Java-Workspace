package com.application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class ManageProduct extends QueryFunction{
  DBConnection con = new DBConnection();
  private final Statement statement;
  private final Product product = new Product();
  Connection connection;
  public ManageProduct() throws Exception {
    connection = con.getConnection("jdbc:mysql://localhost:3306/possys", "root", "");
    this.statement = connection.createStatement();
  }


  public ObservableList<Product> fetchProduct(){
  ObservableList <Product> productList = FXCollections.observableArrayList();
    try {
      String qry = "SELECT * FROM products";
      ResultSet rs = statement.executeQuery(qry);
      while (rs.next()){
        Product product = new Product();
        product.setpID(rs.getInt("pID"));
        product.setpName(rs.getString("pName"));
        product.setpPrice(rs.getDouble("pPrice"));
        product.setpQty(rs.getInt("pQty"));
        product.setpType(rs.getString("pType"));
        productList.add(product);
      }
    }catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return productList;
  }

//  public void insertEmployee(String firstName,String lastName,int age,String date,
//                             String address,String telephone,String email,String password,String userName,String types,String gender)
//  {
//      Date date1 = Date.valueOf(date);
//    try {
//      String qry = "INSERT into users (firstName,lastName,age,dateOfBirth,email,password,phone,gender,type,address,userName)"
//              + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
//      PreparedStatement psmt = connection.prepareStatement(qry);
//      psmt.setString(1,firstName);
//      psmt.setString(2,lastName);
//      psmt.setInt(3,age);
//      psmt.setDate(4,date1);
//      psmt.setString(5,email);
//      psmt.setString(6,password);
//      psmt.setString(7,telephone);
//      psmt.setString(8,gender);
//      psmt.setString(9,types);
//      psmt.setString(10,address);
//      psmt.setString(11,userName);
//      psmt.execute();
//    }catch (Exception e){
//      System.out.println(e);
//    }
//  }
}
