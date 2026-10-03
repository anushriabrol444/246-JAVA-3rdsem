// exercise question 1
import java.sql.*;
import java.util.Scanner;
public class EmployeeCRUD {
    static String url = "jdbc:mysql://localhost:3306/company";
    static String username = "root";
    static String password = "root";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully.");
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            // CREATE / INSERT
            String insertQuery =
                    "INSERT INTO employees VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setDouble(4, salary);
            ps.executeUpdate();
            System.out.println("\nEmployee record inserted successfully.");
            // READ
            System.out.println("\n========== EMPLOYEE RECORDS ==========");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    " | Name: " + rs.getString("name") +
                    " | Department: " + rs.getString("department") +
                    " | Salary: " + rs.getDouble("salary")
                );
            }
            // UPDATE
            System.out.print("\nEnter new salary for Employee ID " + id + ": ");
            double newSalary = sc.nextDouble();
            String updateQuery =
                    "UPDATE employees SET salary = ? WHERE id = ?";
            ps = con.prepareStatement(updateQuery);
            ps.setDouble(1, newSalary);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Employee record updated successfully.");
            // DELETE
            System.out.print("\nDo you want to delete this employee? (yes/no): ");
            sc.nextLine();
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                String deleteQuery =
                        "DELETE FROM employees WHERE id = ?";
                ps = con.prepareStatement(deleteQuery);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Employee record deleted successfully.");
            }
            rs.close();
            stmt.close();
            ps.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
        sc.close();
    }
}

//exercise question 2
import java.sql.*;
import java.util.Scanner;
public class StudentCRUD {
    static String url = "jdbc:mysql://localhost:3306/college";
    static String username = "root";
    static String password = "root";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully.");
            // CREATE / INSERT
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            String insertQuery =
                    "INSERT INTO students VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);
            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setDouble(4, marks);
            ps.executeUpdate();
            System.out.println("\nStudent record inserted successfully.");
            // READ
            System.out.println("\n========== STUDENT RECORDS ==========");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(
                    "Roll No: " + rs.getInt("roll_no") +
                    " | Name: " + rs.getString("name") +
                    " | Course: " + rs.getString("course") +
                    " | Marks: " + rs.getDouble("marks")
                );
            }
            // UPDATE
            System.out.print("\nEnter new marks for Roll Number " + roll + ": ");
            double newMarks = sc.nextDouble();
            String updateQuery =
                    "UPDATE students SET marks = ? WHERE roll_no = ?";
            ps = con.prepareStatement(updateQuery);
            ps.setDouble(1, newMarks);
            ps.setInt(2, roll);
            ps.executeUpdate();
            System.out.println("Student record updated successfully.");
            // DELETE
            System.out.print("\nDo you want to delete this student? (yes/no): ");
            sc.nextLine();
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                String deleteQuery =
                        "DELETE FROM students WHERE roll_no = ?";

                ps = con.prepareStatement(deleteQuery);

                ps.setInt(1, roll);

                ps.executeUpdate();

                System.out.println("Student record deleted successfully.");
            }

            rs.close();
            stmt.close();
            ps.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        sc.close();
    }
}
