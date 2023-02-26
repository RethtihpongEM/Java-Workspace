package com.application;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;

public class listEmployeeController implements Initializable {
  private Stage stage;
  private Scene scene;
  private Parent root;
  @FXML
  private TableView<User> table;
  @FXML
  private TableColumn<User, String> address;

  @FXML
  private TableColumn<User, Integer> age;

  @FXML
  private TableColumn<User, String> date;

  @FXML
  private TableColumn<User, String> email;

  @FXML
  private TableColumn<User, String> firstName;

  @FXML
  private TableColumn<User, String> gender;

  @FXML
  private TableColumn<User, Integer> id;

  @FXML
  private TableColumn<User, String> lastName;

  @FXML
  private TableColumn<User, String> password;

  @FXML
  private TableColumn<User, String> phone;

  @FXML
  private TableColumn<User, String> type;

  @FXML
  private TableColumn<User, String> userName;

  ObservableList<User> list;

  public listEmployeeController() throws Exception {
  }


  @FXML
  public void initialize(URL url, ResourceBundle rb) {
    userName.setCellValueFactory(new PropertyValueFactory<User,String>("userName"));
    firstName.setCellValueFactory(new PropertyValueFactory<User,String>("firstName"));
    lastName.setCellValueFactory(new PropertyValueFactory<User,String>("lastName"));
    phone.setCellValueFactory(new PropertyValueFactory<User,String>("phone"));
    gender.setCellValueFactory(new PropertyValueFactory<User,String>("gender"));
    type.setCellValueFactory(new PropertyValueFactory<User,String>("type"));
    password.setCellValueFactory(new PropertyValueFactory<User,String>("password"));
    email.setCellValueFactory(new PropertyValueFactory<User,String>("email"));
    address.setCellValueFactory(new PropertyValueFactory<User,String>("address"));
    date.setCellValueFactory(new PropertyValueFactory<User,String>("date"));
    age.setCellValueFactory(new PropertyValueFactory<User,Integer>("age"));
    id.setCellValueFactory(new PropertyValueFactory<User,Integer>("userID"));
    ManageEmployee manageEmployee = null;
    try {
      manageEmployee = new ManageEmployee();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    list = manageEmployee.fetchUser();
    table.setItems(list);
  }

  @FXML
  public void backBtn(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("adminMenu.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
