import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecords {
    public static void main(String[] args) {
        try {
            // 1. Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection to the StudentDB database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "password");

            // 3. Create a statement
            Statement stmt = conn.createStatement();

            // 4. Execute SQL query to fetch records
            String sql = "SELECT * FROM Registration";
            ResultSet rs = stmt.executeQuery(sql);

            // 5. Display the records
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String program = rs.getString("program");

                System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", Program: " + program);
            }

            // 6. Close the connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
