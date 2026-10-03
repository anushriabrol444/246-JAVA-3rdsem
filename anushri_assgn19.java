// exercise question 1
import java.sql.*;
public class StudentRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";
        String query = "SELECT * FROM students";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("========== STUDENT RECORDS ==========");
            System.out.printf("%-10s %-20s %-15s %-10s%n",
                    "ID", "NAME", "COURSE", "AGE");
            System.out.println("----------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String course = rs.getString("course");
                int age = rs.getInt("age");

                System.out.printf("%-10d %-20s %-15s %-10d%n",
                        id, name, course, age);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
// exercise question 2
import java.sql.*;
public class ProductDetails {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shop";
        String username = "root";
        String password = "root";
        String query = "SELECT product_id, product_name, quantity, price FROM products";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("============= PRODUCT DETAILS =============");
            System.out.printf("%-12s %-20s %-12s %-10s%n",
                    "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "PRICE");
            System.out.println("-------------------------------------------------------");
            while (rs.next()) {
                int id = rs.getInt("product_id");
                String name = rs.getString("product_name");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                System.out.printf("%-12d %-20s %-12d %.2f%n",
                        id, name, quantity, price);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
