import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentDatabase {
    public static void main(String[] args) {
        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "password");

            // 3. Create a statement
            Statement stmt = conn.createStatement();

            // 4. Execute SQL to create a database
            String sql = "CREATE DATABASE StudentDB";
            stmt.executeUpdate(sql);
            System.out.println("Database 'StudentDB' created successfully!");

            // 5. Close the connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
