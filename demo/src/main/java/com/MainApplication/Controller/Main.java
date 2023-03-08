package com.MainApplication.Controller;

<<<<<<< HEAD
import com.UserManagement.ManageEmployee;
import com.UserManagement.User;
import javafx.application.Application;
import javafx.event.EventHandler;
=======
import javafx.application.Application;
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
<<<<<<< HEAD
import javafx.stage.WindowEvent;
=======
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
  @Override
  public void start(Stage stage) throws IOException {
<<<<<<< HEAD
=======
//    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("product-view.fxml"));
//    Scene scene = new Scene(fxmlLoader.load(), 1366, 768);
//    scene.getStylesheets().add(getClass().getResource("Style/styles.css").toExternalForm());
//    stage.setTitle("POS System - Group 7");
//    stage.setScene(scene);
//    stage.setResizable(false);
//    stage.show();
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb
    try {
      Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login-view.fxml")));
      Scene scene = new Scene(root, 1366, 768);
      stage.setScene(scene);
      stage.show();
<<<<<<< HEAD
      stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
        @Override
        public void handle(WindowEvent windowEvent) {
          try {
            ManageEmployee manageEmployee = new ManageEmployee();
            User user = manageEmployee.getUserByActive();
            manageEmployee.editActive(user.getUserID(),0);
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
      });
=======
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) throws Exception {
<<<<<<< HEAD
=======
//    Cart cart = new Cart();
>>>>>>> 8e252276916278890926b7fe85a1b5bfd226a8eb
    launch();
  }
}