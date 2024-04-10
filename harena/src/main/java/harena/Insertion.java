package harena;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertion {
	  public static void insert(String type, String description, int amount) throws SQLException, ClassNotFoundException {

	        String sql = "INSERT INTO transactions (type, description, amount, date) VALUES ( ?, ?, ?, ?)";

	        try (Connection conn = ConnectionPostgres.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setString(1, type);
	            pstmt.setString(2, description);
	            pstmt.setInt(3, amount);
	            pstmt.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
	            pstmt.executeUpdate();
	     }

	  }
}
