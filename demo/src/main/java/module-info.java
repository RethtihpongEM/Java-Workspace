module com.MainApplication {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;

  exports com.MainApplication.Controller;
  opens com.MainApplication.Controller to javafx.fxml;
  exports com.ProductManagement;
  opens com.ProductManagement to javafx.fxml;
  exports com.UserManagement;
  opens com.UserManagement to javafx.fxml;
}