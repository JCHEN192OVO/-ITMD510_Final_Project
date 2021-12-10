package Views;

import Check.Check;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Views extends Application {
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("The CMP of the Hotel");
        gotoLogin();
        stage.show();
    }
    public void gotoLogin(){
        try {
            LoginController login = (LoginController) replaceSceneContent("/Resources/FxML_LOGIN.fxml");
            login.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Views.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gotoRegister(){
        try {
            RegisterController main = (RegisterController) replaceSceneContent("/Resources/FXML_Register.fxml");
            main.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Views.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void gotoMain(){
        try {
            MainController main = (MainController) replaceSceneContent("/Resources/FXML_MAIN.fxml");
            main.setApp(this);

        } catch (Exception ex) {
            Logger.getLogger(Views.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void gotoRoot(){
        try {
            rootRegisterController main = (rootRegisterController) replaceSceneContent("/Resources/FXML_rootRegister.fxml");
            main.setApp(this);
        } catch (Exception ex) {
            Logger.getLogger(Views.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void userLogin(String account,String password){
        if(Check.checkReturn(account,password)){
            if(account.equals("account")){
                gotoRoot();
            }else {
                gotoMain();
            }

        }
    }

    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = Views.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Views.class.getResource(fxml));
        AnchorPane page;
        try {
            page = (AnchorPane) loader.load(in);
        } finally {
            in.close();
        }
        Scene scene = new Scene(page, 800, 600);
        stage.setScene(scene);
        stage.sizeToScene();

        return (Initializable) loader.getController();
    }
    public static void main(String[] args) {
        launch(args);
    }
}