package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
  @FXML
  public void login(ActionEvent e){
    System.out.println("Login");
  }
}