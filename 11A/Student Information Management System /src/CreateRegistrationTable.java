import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateRegistrationTable {
    public static void main(String[] args) {
        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection to the StudentDB database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");

            // 3. Create a statement
            Statement stmt = conn.createStatement();

            // 4. SQL query to create the Registration table
            String sql = "CREATE TABLE Registration (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "address VARCHAR(100), " +
                         "program VARCHAR(50))";

            stmt.executeUpdate(sql);
            System.out.println("Table 'Registration' created successfully!");

            // 5. Close the connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
