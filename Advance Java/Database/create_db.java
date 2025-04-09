
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class create_db {
    public static void main(String[] args) {
        // Database connection parameters
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        // Create connection, statement, and result set
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. Register the MySQL JDBC driver (if not done already)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish a connection to the database
            connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. Create a SQL statement
            statement = connection.createStatement();

            // 4. Execute a SQL query (for example, select data from a table)
            String sqlQuery = "SELECT * FROM your_table";
            resultSet = statement.executeQuery(sqlQuery);

            // 5. Process the results
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Add more columns as needed

                // Do something with the retrieved data (e.g., print it)
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6. Close resources in reverse order (result set, statement, connection)
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
