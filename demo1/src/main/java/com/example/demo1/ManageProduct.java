package com.example.demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManageProduct extends QueryFunction {
  DBConnection con = new DBConnection();
  private final Statement statement;
  private Product product = new Product();
  Connection connection;

  public ManageProduct() throws Exception {
    connection = con.getConnection("jdbc:mysql://localhost:3306/possys", "root", "");
    this.statement = connection.createStatement();
  }
  public ObservableList<Product> fetchProduct(){
    ObservableList <Product> productsList = FXCollections.observableArrayList();
    try {
      String qry = "select * from products";
      ResultSet rs = statement.executeQuery(qry);
      while (rs.next()){
        Product product = new Product();
        product.setPid(rs.getInt("pID"));
        product.setPname(rs.getString("pName"));
        product.setPprice(rs.getDouble("pPrice"));
        product.setPqty(rs.getInt("pQty"));
        product.setPtype(rs.getString("pType"));
        productsList.add(product);
      }
    }catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return productsList;
  }
}
