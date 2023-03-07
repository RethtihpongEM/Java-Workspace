package com.example.demo1;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

  @FXML
  private TableColumn<Product, Integer> pID;

  @FXML
  private TableColumn<Product, String> pName;

  @FXML
  private TableColumn<Product, Double> pPrice;

  @FXML
  private TableColumn<Product, Integer> pQty;
  @FXML
  private TableColumn<Product,String> pType;

  @FXML
  private TableView<Product> pTable;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    try {
      ManageProduct manageProduct = new ManageProduct();
      ObservableList<Product> products = manageProduct.fetchProduct();
      System.out.println(products.get(0).getPid());
      System.out.println("Fetch Success");
      pID.setCellValueFactory(new PropertyValueFactory<Product, Integer>("pid"));
      pName.setCellValueFactory(new PropertyValueFactory<Product,String>("pname"));
      pPrice.setCellValueFactory(new PropertyValueFactory<Product,Double>("pprice"));
      pQty.setCellValueFactory(new PropertyValueFactory<Product,Integer>("pqty"));
      pType.setCellValueFactory(new PropertyValueFactory<Product,String>("ptype"));
      pTable.setItems(products);
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
  }
}