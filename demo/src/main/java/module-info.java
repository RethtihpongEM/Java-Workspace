module com.application {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens com.application to javafx.fxml;
  exports com.application;
}