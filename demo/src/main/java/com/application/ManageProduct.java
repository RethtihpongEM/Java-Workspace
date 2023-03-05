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
public class ManageProduct extends QueryFunction{
  DBConnection con = new DBConnection();
  private final Statement statement;
  private final Product product = new Product();
  Connection connection;
  public ManageProduct() throws Exception{
    connection = con.getConnection("jdbc:mysql://localhost:3306/possys", "root", "");
    this.statement = connection.createStatement();
  }
  public ObservableList<Product> fetchProduct(){
    ObservableList<Product> productList = FXCollections.observableArrayList();
    try {
      String qry = "select * from product";
      ResultSet rs = statement.executeQuery(qry);
      while (rs.next()){
        Product product = new Product();
        product.setpID(rs.getInt("pid"));
        product.setpName(rs.getString("pName"));
        product.setpPrice(rs.getDouble("pPrice"));
        product.setpQty(rs.getInt("pQty"));
        productList.add(product);
      }
    }catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return productList;
  }
}
