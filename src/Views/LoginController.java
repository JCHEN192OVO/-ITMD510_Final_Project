package Views;

import java.net.URL;
import java.util.ResourceBundle;

import Models.DBModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import jdk.jfr.internal.tool.Main;


public class LoginController implements Initializable {
    @FXML public TextField account;
    @FXML private PasswordField password;

    private Views application;

    public LoginController() {
    }

    public void setApp(Views application){
        this.application = application;
    }
    @FXML
    public void LOGIN_M(ActionEvent event) {
        application.userLogin(account.getText(), password.getText());
        DBModel logH = new DBModel();
        logH.loginHistory(account.getText());
    }
    @FXML
    private void Register_M(ActionEvent event) {

        application.gotoRegister();
    }
    @FXML
    private void OUT_M(ActionEvent event) {
        application.gotoLogin();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}