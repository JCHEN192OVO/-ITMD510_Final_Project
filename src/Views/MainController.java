package Views;

import java.net.URL;
import java.util.ResourceBundle;

import Models.DBModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;



public class MainController implements Initializable{
    private Views application;
    public String rn;

    public void getRn(String str){
        rn = str;
        System.out.println(rn);
    }
    public void setApp(Views application){
        this.application = application;
    }

    @FXML
    private void Book_101(ActionEvent event){
        DBModel book = new DBModel();
        int bookNum = 101;
        book.book(rn,bookNum);

    }
    @FXML
    private void Book_102(ActionEvent event){DBModel book = new DBModel();

        int bookNum = 102;
        book.book(rn, bookNum);}
    @FXML
    private void Book_103(ActionEvent event){DBModel book = new DBModel();
        int bookNum = 103;
        book.book(rn, bookNum);}
    @FXML
    private void Book_104(ActionEvent event){DBModel book = new DBModel();
        int bookNum = 104;
        book.book(rn,bookNum);}
    @FXML
    private void Book_105(ActionEvent event){DBModel book = new DBModel();
        int bookNum = 105;
        book.book(rn,bookNum);}
    @FXML
    private void Book_106(ActionEvent event){DBModel book = new DBModel();
        int bookNum = 106;
        book.book(rn,bookNum);}
    @FXML
    private void Book_107(ActionEvent event){DBModel book = new DBModel();
        int bookNum = 107;
        book.book(rn,bookNum);}
    @FXML
    private void Book_108(ActionEvent event){DBModel book = new DBModel();
        int bookNum = 108;
        book.book(rn,bookNum);}
    @FXML
    private void Book_109(ActionEvent event){DBModel book = new DBModel();int bookNum=109;book.book(rn,bookNum);}
    @FXML
    private void Book_110(ActionEvent event){DBModel book = new DBModel();int bookNum=110;book.book(rn,bookNum);}
    @FXML
    private void Book_201(ActionEvent event){DBModel book = new DBModel();int bookNum=201;book.book(rn,bookNum);}
    @FXML
    private void Book_202(ActionEvent event){DBModel book = new DBModel();int bookNum=202;book.book(rn,bookNum);}
    @FXML
    private void Book_203(ActionEvent event){DBModel book = new DBModel();int bookNum=203;book.book(rn,bookNum);}
    @FXML
    private void Book_204(ActionEvent event){DBModel book = new DBModel();int bookNum=204;book.book(rn,bookNum);}
    @FXML
    private void Book_205(ActionEvent event){DBModel book = new DBModel();int bookNum=205;book.book(rn,bookNum);}
    @FXML
    private void Book_206(ActionEvent event){DBModel book = new DBModel();int bookNum=206;book.book(rn,bookNum);}
    @FXML
    private void Book_207(ActionEvent event){DBModel book = new DBModel();int bookNum=207;book.book(rn,bookNum);}
    @FXML
    private void Book_208(ActionEvent event){DBModel book = new DBModel();int bookNum=208;book.book(rn,bookNum);}
    @FXML
    private void Book_209(ActionEvent event){DBModel book = new DBModel();int bookNum=209;book.book(rn,bookNum);}
    @FXML
    private void Book_210(ActionEvent event){DBModel book = new DBModel();int bookNum=210;book.book(rn,bookNum);}
    @FXML
    private void Book_301(ActionEvent event){DBModel book = new DBModel();int bookNum=301;book.book(rn,bookNum);}
    @FXML
    private void Book_302(ActionEvent event){DBModel book = new DBModel();int bookNum=302;book.book(rn,bookNum);}
    @FXML
    private void Book_303(ActionEvent event){DBModel book = new DBModel();int bookNum=303;book.book(rn,bookNum);}
    @FXML
    private void Book_304(ActionEvent event){DBModel book = new DBModel();int bookNum=304;book.book(rn,bookNum);}
    @FXML
    private void Book_305(ActionEvent event){DBModel book = new DBModel();int bookNum=305;book.book(rn,bookNum);}
    @FXML
    private void Book_306(ActionEvent event){DBModel book = new DBModel();int bookNum=306;book.book(rn,bookNum);}
    @FXML
    private void Book_307(ActionEvent event){DBModel book = new DBModel();int bookNum=307;book.book(rn,bookNum);}
    @FXML
    private void Book_308(ActionEvent event){DBModel book = new DBModel();int bookNum=308;book.book(rn,bookNum);}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
