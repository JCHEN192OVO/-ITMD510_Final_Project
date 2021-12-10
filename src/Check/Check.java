package Check;

import Models.DBModel;
import Views.MainController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Check {
    public static boolean checkReturn(String account,String password){
        boolean checkBool = false;
        DBModel flag = new DBModel();
        MainController setRn = new MainController();
        setRn.getRn(account);
        if(flag.checkPw(account,password)){
            if(account.equals("account")){
                checkBool = true;
            }else {
                checkBool = true;
            }

        }
        return checkBool;
    }
}
