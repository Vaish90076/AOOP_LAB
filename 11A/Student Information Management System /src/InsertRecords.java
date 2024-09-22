import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
    public static void main(String[] args) {
        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection to the StudentDB database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");

            // 3. SQL query to insert records
            String sql = "INSERT INTO Registration (id, name, address, program) VALUES (?, ?, ?, ?)";

            // 4. Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // 5. Insert first record
            pstmt.setInt(1, 100);
            pstmt.setString(2, "John Doe");
            pstmt.setString(3, "123 Main St");
            pstmt.setString(4, "Computer Science");
            pstmt.executeUpdate();

            // 6. Insert second record
            pstmt.setInt(1, 101);
            pstmt.setString(2, "Jane Smith");
            pstmt.setString(3, "456 Park Ave");
            pstmt.setString(4, "Electrical Engineering");
            pstmt.executeUpdate();

            // 7. Insert third record
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Mark Johnson");
            pstmt.setString(3, "789 Elm St");
            pstmt.setString(4, "Mechanical Engineering");
            pstmt.executeUpdate();

            // 8. Insert fourth record
            pstmt.setInt(1, 103);
            pstmt.setString(2, "Emily Davis");
            pstmt.setString(3, "321 Oak St");
            pstmt.setString(4, "Business Administration");
            pstmt.executeUpdate();

            System.out.println("Records inserted successfully!");

            // 9. Close the connection
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
