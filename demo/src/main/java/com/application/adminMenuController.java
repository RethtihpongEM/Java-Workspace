package com.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class adminMenuController {
  private Stage stage;
  private Scene scene;
  private Parent root;
  @FXML
  public void listAllEmployee(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("list-employee-view.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}