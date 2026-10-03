//exercise question 1
import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            System.out.println("================================");
            System.out.println("       DATABASE CONNECTION      ");
            System.out.println("================================");
            System.out.println("JDBC Driver loaded successfully.");
            System.out.println("Database connection established.");
            System.out.println("Connection Status: CONNECTED");
            System.out.println("================================");

            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}

//exercise question 2
import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            Statement stmt = con.createStatement();

            System.out.println("======================================");
            System.out.println("       STUDENT DATABASE SYSTEM         ");
            System.out.println("======================================");
            System.out.println("JDBC Driver loaded successfully.");
            System.out.println("Connection established successfully.");
            System.out.println("Student database connected successfully.");
            System.out.println("Connection Status: CONNECTED");
            System.out.println("======================================");

            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Student database connection failed.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
