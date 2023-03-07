package com.MainApplication.Controller;

import com.UserManagement.LoginAuthentication;
import com.UserManagement.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
  @FXML
  private TextField emailTF;
  @FXML
  private PasswordField passwordField;
  private Stage stage;
  private Scene scene;
  private Parent root;
  private AnchorPane scenePane;
  LoginAuthentication loginAuthentication;
  public void LoginBtn(ActionEvent event) throws Exception {
    String email = emailTF.getText();
    String password = passwordField.getText();
    try {
      loginAuthentication = new LoginAuthentication();
      if (loginAuthentication.authentication(email,password)){
        User user = loginAuthentication.getUser();
        if(user.getType().equals("Admin") || user.getType().equals("admin")){
          System.out.println("Logged in as Admin");
          root = FXMLLoader.load(getClass().getResource("adminMenu.fxml"));
          stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
          scene = new Scene(root);
          stage.setScene(scene);
          stage.show();
        }else {
          System.out.println("Logged in as Employee");
          root = FXMLLoader.load(getClass().getResource("product-view.fxml"));
          stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
          scene = new Scene(root);
          stage.setScene(scene);
          stage.show();
        }
      }else {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Failed");
        alert.setHeaderText("Incorrect username or password");
        alert.setContentText("Please try again");
        if(alert.showAndWait().get() == ButtonType.OK){
          stage = (Stage) scenePane.getScene().getWindow();
          stage.close();
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}