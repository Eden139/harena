package harena;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreator {

	  private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS transactions (" +
	            "id SERIAL PRIMARY KEY," +
	            "type VARCHAR(10) NOT NULL," +
	            "description VARCHAR(255) NOT NULL," +
	            "amount INT NOT NULL," +
	            "date DATE NOT NULL" +
	            ");";

	    public void createTableIfNotExists(Connection connection) throws SQLException {
	        try (Statement statement = connection.createStatement()) {
	            statement.execute(CREATE_TABLE_SQL);
	       }
	 }
}
