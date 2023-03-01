package com.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
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

  public static void main(String[] args){
    launch();
  }
}
