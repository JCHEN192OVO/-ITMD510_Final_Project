package Views;

import Models.DBModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.text.Document;
import java.net.URL;
import java.util.ResourceBundle;


public class rootRegisterController implements Initializable {

    @FXML private TextField account;
    @FXML private PasswordField password;
    private Views application;

    public void setApp(Views application){
        this.application = application;
    }
    @FXML
    private void Search(ActionEvent event){

        DBModel cr = new DBModel();
        cr.searchAccount(account.getText());



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("The Password of the account");
        alert.setContentText("account:"+account.getText());
        alert.setHeaderText(cr.searchAccount(account.getText()));
        alert.showAndWait();


    }
    @FXML
    private void Delete(ActionEvent event){

        DBModel cr = new DBModel();
        cr.deleteAccount(account.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successfully");
        alert.setContentText("Successfully");
        alert.setHeaderText("You have delete an account successfully.");
        alert.showAndWait();
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
    private void Change(ActionEvent event){

        DBModel cr = new DBModel();
        cr.changeAccount(account.getText(),password.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Successfully");
        alert.setContentText("Successfully");
        alert.setHeaderText("You have change an account successfully.");
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
