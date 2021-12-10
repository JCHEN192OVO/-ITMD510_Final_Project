package Models;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBModel {
    String ac;
    String pw;
    DBConnect conn = null;
    Statement stmt = null;
    public DBModel(){
        conn = new DBConnect();
    }
    public boolean checkPw(String account, String password) {
        boolean flag = false;
        try {
            String passWord = "";
            stmt = conn.connect().createStatement();
            String sql = "SELECT PASSWORD FROM  Final_Project_Login WHERE ACCOUNT = '" + account + "';";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                passWord = rs.getString("password");
            }

            if (passWord.equals(password)){
                flag = true;
            }
            conn.connect().close(); //close db connection

        } catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();
        }
        return flag;

    }
    public void changeAccount(String account, String password){
        ac = account;
        pw = password;
        try {
            stmt = conn.connect().createStatement();
            String sql = "UPDATE Final_Project_login set password =  '"+pw+"' where account = '"+ac+"';";
            stmt.executeUpdate(sql);
        } catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();

        }
    }
    public void deleteAccount(String account){
        ac = account;
        try {


                stmt = conn.connect().createStatement();
                String sql = "delete from Final_Project_login where account = '" + ac + "';";
                stmt.executeUpdate(sql);
                sql = "drop table final_project_" + ac + ";";
                stmt.executeUpdate(sql);
                sql = "drop table final_project_" + ac + "_inventory;";
                stmt.executeUpdate(sql);


        } catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();

        }
    }
    public String searchAccount(String account){
        ac = account;

        try {
            stmt = conn.connect().createStatement();
            String sql = "select password from Final_Project_login where account = '"+ac+"';";
            ResultSet rs1 = stmt.executeQuery(sql);
            while (rs1.next()){
                pw = rs1.getString("password");
            }


        } catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();

        }
        return pw;
    }

    public void creatAccount(String account, String password){
        ac = account;
        pw = password;
        try {
            if (ac.equals("account")){
                stmt = conn.connect().createStatement();
                String sql = "create table final_project_login(id int auto_increment primary key,account  char(255) not null,password char(255) not null);";
                stmt.executeUpdate(sql);
                sql ="create table Final_Project_loginHistory(id int auto_increment primary key,ac char(255) not null);";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO  Final_Project_Login (Account, Password) VALUES('"+
                        ac+"',  '"+pw+"');";
                stmt.executeUpdate(sql);
            }else {stmt = conn.connect().createStatement();
                stmt = conn.connect().createStatement();
                String sql = "create table final_project_"+account +
                        "(" +
                        "    id        int auto_increment," +
                        "    standard  int null," +
                        "    business  int null," +
                        "    luxury  int null," +
                        "    constraint final_project_"+account+"_pk" +
                        "        primary key (id)" +
                        ");";
                stmt.executeUpdate(sql);
                sql = "create table final_project_"+account +
                        "_inventory (" +
                        "    id        int auto_increment," +
                        "    flag  int null," +
                        "    rn  int null," +
                        "    constraint final_project_"+account+"_pk" +
                        "        primary key (id)" +
                        ");";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO  Final_Project_Login (Account, Password) VALUES('"+
                        ac+"',  '"+pw+"');";
                stmt.executeUpdate(sql);
                sql = "INSERT INTO  Final_Project_"+account+" (standard, business, luxury) VALUES('10', '10','8');";
                stmt.executeUpdate(sql);
                for (int j = 101; j <= 110; j++){
                    sql = "INSERT INTO  Final_Project_"+ ac +"_inventory (rn, flag) VALUES('"+
                            j+"',  '1');";
                    stmt.executeUpdate(sql);
                }
                for (int j = 201; j <= 210; j++){
                    sql = "INSERT INTO  Final_Project_"+ ac +"_inventory (rn, flag) VALUES('"+
                            j+"',  '1');";
                    stmt.executeUpdate(sql);
                }
                for (int j = 301; j <= 308; j++){
                    sql = "INSERT INTO  Final_Project_"+ ac +"_inventory (rn, flag) VALUES('"+
                            j+"',  '1');";
                    stmt.executeUpdate(sql);
                }


                conn.connect().close(); //close db connection
            }
        } catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();
        }
    }
    public void loginHistory(String ac){
        try{
            stmt = conn.connect().createStatement();
            String sql = "INSERT INTO  Final_Project_loginHistory (ac) VALUES('"+ac+"');";
            stmt.executeUpdate(sql);
        }catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();
        }
    }
    public void book(String rn,int bookNum) {
        ac = rn;

        try {
            stmt = conn.connect().createStatement();
            String sql = "select ac from final_project_loginhistory where id = (select max(id) from final_project_loginhistory);";

            ResultSet rs1 = stmt.executeQuery(sql);
            while (rs1.next()){
                ac = rs1.getString("ac");
            }
            stmt = conn.connect().createStatement();
            sql = "SELECT flag from FINAL_PROJECT_"+ac+"_inventory WHERE rn = "+bookNum+";";

            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
            while (rs.next()){
                i = rs.getInt("flag");
            }
            i = i*-1;
            sql = "UPdate  Final_Project_"+ ac +"_inventory set flag =  "+i+" where rn = "+bookNum+";";

            stmt.executeUpdate(sql);
            conn.connect().close(); //close db connection

        } catch (SQLException se) { // Handle errors for JDBC
            se.printStackTrace();
        }
    }
}
