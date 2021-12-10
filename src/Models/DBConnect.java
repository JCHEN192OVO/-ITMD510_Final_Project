package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    // Code database URL
    static final String DB_URL =
            "jdbc:mysql://127.0.0.1:3306/Final_Project";
    // Database credentials
    static final String USER = "root", PASS = "jchen192";
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
