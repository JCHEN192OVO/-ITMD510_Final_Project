package Views;

import Models.DBModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class RegisterController implements Initializable {

    @FXML private TextField account;
    @FXML private PasswordField password;
    private Views application;

    public void setApp(Views application){
        this.application = application;
    }
    @FXML
    private void Creat(ActionEvent event){

        DBModel cr = new DBModel();

        cr.creatAccount(account.getText(),password.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successfully");
        alert.setContentText("Successfully");
        alert.setHeaderText("You have created an account successfully.");
        alert.showAndWait();
    }
    @FXML
    private void Next(ActionEvent event) {
        application.gotoLogin();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
