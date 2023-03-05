package com.application;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;

public class adminMenuController implements Initializable{
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
  @FXML
  private TextField searchFilter;



  ObservableList<User> list;



  @FXML
  public void initialize(URL url, ResourceBundle resourceBundle) {
    userName.setCellValueFactory(new PropertyValueFactory<User, String>("userName"));
    firstName.setCellValueFactory(new PropertyValueFactory<User, String>("firstName"));
    lastName.setCellValueFactory(new PropertyValueFactory<User, String>("lastName"));
    phone.setCellValueFactory(new PropertyValueFactory<User, String>("phone"));
    gender.setCellValueFactory(new PropertyValueFactory<User, String>("gender"));
    type.setCellValueFactory(new PropertyValueFactory<User, String>("type"));
    password.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
    email.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
    address.setCellValueFactory(new PropertyValueFactory<User, String>("address"));
    date.setCellValueFactory(new PropertyValueFactory<User, String>("date"));
    age.setCellValueFactory(new PropertyValueFactory<User, Integer>("age"));
    id.setCellValueFactory(new PropertyValueFactory<User, Integer>("userID"));
    ManageEmployee manageEmployee;
    try {
      manageEmployee = new ManageEmployee();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    list = manageEmployee.fetchUser();
    table.setItems(list);
    FilteredList<User> filteredList = new FilteredList<>(list, b -> true);
    searchFilter.textProperty().addListener((observable, oldValue, newValue) -> {
      filteredList.setPredicate(user -> {
        if (newValue == null || newValue.isEmpty()) {
          return true;
        }
        String lowercasefilter = newValue.toLowerCase();
        if (user.getUserName().toLowerCase().indexOf(lowercasefilter) != -1) {
          return true;
        } else
          return false;
      });
    });
    table.setItems(filteredList);
  }


  @FXML
  private Button employeeBtn;

  @FXML
  private Button logoutBtn;

  @FXML
  private Button productBtn;

  @FXML
  private Button salesBtn;

  @FXML
  private Button settingBtn;
  @FXML
  private AnchorPane panelEmployee;

  @FXML
  private AnchorPane panelProduct;

  @FXML
  private AnchorPane panelSales;

  @FXML
  private AnchorPane panelSetting;
  @FXML
  private TextField addressField;
  @FXML
  private TextField ageField;
  @FXML
  private TextField emailField;
  @FXML
  private TextField firstnameField;

  @FXML
  private TextField genderField;

  @FXML
  private TextField lastnameField;

  @FXML
  private TextField telephoneField;
  @FXML
  private TextField dateField;
  @FXML
  private TextField usernameField;

  public adminMenuController() throws Exception {
  }

  public void addEmployee(ActionEvent event) throws Exception {
    ManageEmployee manageEmployee = new ManageEmployee();
    User user = new User();
    user.setFirstName(firstnameField.getText());
    user.setLastName(lastnameField.getText());
    user.setAge(Integer.parseInt(ageField.getText()));
    user.setDate(dateField.getText());
    user.setAddress(addressField.getText());
    user.setPhone(telephoneField.getText());
    user.setEmail(emailField.getText());
    user.setUserName(usernameField.getText());
    user.setPassword(user.getUserName());
    user.setType("Employee");
    user.setGender(genderField.getText());
    manageEmployee.insertEmployee(user.getFirstName(),user.getLastName(),user.getAge(),user.getDate(),user.getAddress(),user.getPhone(),user.getEmail()
            ,user.getPassword(),user.getUserName(),user.getType(),user.getGender());
    initialize(null,null);
  }
  public void handleClicks(ActionEvent event) throws IOException {
    if (event.getSource() == employeeBtn) {
      panelEmployee.toFront();
    } else if (event.getSource() == productBtn) {
      panelProduct.toFront();
    } else if (event.getSource() == salesBtn) {
      panelSales.toFront();
    } else if (event.getSource() == settingBtn) {
      panelSetting.toFront();
    } else if (event.getSource() == logoutBtn) {
      root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
      stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
  }

}
