import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection to the StudentDB database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");

            // 3. SQL query to delete a record
            String sql = "DELETE FROM Registration WHERE id = ?";

            // 4. Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // 5. Delete student with id 101
            pstmt.setInt(1, 101);
            pstmt.executeUpdate();

            System.out.println("Record deleted successfully!");

            // 6. Close the connection
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
