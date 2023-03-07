package com.example.demo1;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch();
//    ManageProduct manageProduct = new ManageProduct();
//    ObservableList<Product> products = manageProduct.fetchProduct();
//    for(int i=0;i<products.size();i++){
//      System.out.println(products.get(i).getpID());
//      System.out.println(products.get(i).getpName());
//      System.out.println(products.get(i).getpPrice());
//      System.out.println(products.get(i).getpQty());
//      System.out.println(products.get(i).getpType());
//    }
  }
}