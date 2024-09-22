import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {

    public static void main(String[] args) {
        // JDBC URL for PostgreSQL (Replace the database name, user, and password)
        String jdbcUrl = "jdbc:postgresql://localhost:5432/test"; // test is the database name
        String username = "yourUsername"; // Replace with your PostgreSQL username
        String password = "yourPassword"; // Replace with your PostgreSQL password

        // Connection object
        Connection conn = null;

        try {
            // Load the PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Try to connect to the database
            conn = DriverManager.getConnection(jdbcUrl, username, password);

            // If connection is successful, display the message
            System.out.println("Connected to the database");

        } catch (SQLException e) {
            // Check if the error is due to incorrect username or password
            if (e.getSQLState().equals("28000")) { // SQL state 28000 indicates invalid authorization
                System.out.println("Invalid username or password");
            } else {
                e.printStackTrace(); // For any other SQL errors, print the stack trace
            }
        } catch (ClassNotFoundException e) {
            // Handle case where PostgreSQL JDBC Driver is not found
            System.out.println("PostgreSQL JDBC Driver not found. Add the driver to your project.");
            e.printStackTrace();
        } finally {
            // Close the connection if it was established
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
