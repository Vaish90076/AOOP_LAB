import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecords {
    public static void main(String[] args) {
        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection to the StudentDB database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");

            // 3. SQL query to update records
            String sql = "UPDATE Registration SET program = ? WHERE id = ?";

            // 4. Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // 5. Update program for student with id 100
            pstmt.setString(1, "Information Technology");
            pstmt.setInt(2, 100);
            pstmt.executeUpdate();

            // 6. Update program for student with id 101
            pstmt.setString(1, "Civil Engineering");
            pstmt.setInt(2, 101);
            pstmt.executeUpdate();

            System.out.println("Records updated successfully!");

            // 7. Close the connection
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
