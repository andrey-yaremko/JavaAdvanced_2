package ua.lviv.lgs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    private static String user = "root";
    private static String password = "Karnaval3e";
    private static String URL = "jdbc:mysql://localhost/users";

    public static Connection openConection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        return DriverManager.getConnection(URL, user, password);
    }
}
