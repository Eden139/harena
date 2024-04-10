package harena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionPostgres {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/harena";
    private static final String DB_USER = "eden";
    private static final String DB_PASSWORD = "123456";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

}
