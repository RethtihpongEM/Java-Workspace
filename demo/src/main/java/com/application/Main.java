package com.application;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Main extends Application{

  @Override
  public void start(Stage stage) {
    try {
      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
      Scene scene = new Scene(root, 1366, 768);
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) throws Exception {
    launch();
//    ManageEmployee manageEmployee = new ManageEmployee();
//    ManageProduct manageProduct = new ManageProduct();
//    ObservableList<User> user = manageEmployee.fetchUser();
//    ArrayList<Product> products = manageProduct.fetchProduct();
//    for(int i =0;i<user.size();i++){
//      System.out.println(user.get(i).getUserName());
//    }
//    for(int i=0;i<products.size();i++){
//      System.out.println(products.get(i).getpName());
//    }
  }
}
