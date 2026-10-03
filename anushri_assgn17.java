//exercise question 1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentRegistrationForm extends JFrame implements ActionListener {
    JTextField nameField, rollField, emailField;
    JComboBox<String> courseBox;
    JButton submitButton, clearButton;
    StudentRegistrationForm() {
        setTitle("Student Registration Form");
        setSize(450, 350);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel nameLabel = new JLabel("Student Name:");
        JLabel rollLabel = new JLabel("Roll Number:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel courseLabel = new JLabel("Course:");
        nameField = new JTextField();
        rollField = new JTextField();
        emailField = new JTextField();
        String[] courses = {
            "B.Tech CSE",
            "B.Tech IT",
            "B.Tech ECE",
            "B.Tech Mechanical"
        };
        courseBox = new JComboBox<>(courses);
        submitButton = new JButton("Register");
        clearButton = new JButton("Clear");
        add(nameLabel);
        add(nameField);
        add(rollLabel);
        add(rollField);
        add(emailLabel);
        add(emailField);
        add(courseLabel);
        add(courseBox);
        add(submitButton);
        add(clearButton);
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String roll = rollField.getText();
            String email = emailField.getText();
            String course = (String) courseBox.getSelectedItem();

            if (name.isEmpty() || roll.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Please enter all the details.");
            } else {
                String details = "Student Registered Successfully!\n\n"
                        + "Name: " + name + "\n"
                        + "Roll Number: " + roll + "\n"
                        + "Email: " + email + "\n"
                        + "Course: " + course;

                JOptionPane.showMessageDialog(this, details);
            }
        }
        if (e.getSource() == clearButton) {
            nameField.setText("");
            rollField.setText("");
            emailField.setText("");
            courseBox.setSelectedIndex(0);
        }
    }
    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}

// exercise question 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EmployeeRegistrationForm extends JFrame implements ActionListener {
    JTextField idField, nameField, departmentField, salaryField;
    JButton submitButton, clearButton;
    EmployeeRegistrationForm() {
        setTitle("Employee Registration Form");
        setSize(450, 320);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel idLabel = new JLabel("Employee ID:");
        JLabel nameLabel = new JLabel("Employee Name:");
        JLabel deptLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");
        idField = new JTextField();
        nameField = new JTextField();
        departmentField = new JTextField();
        salaryField = new JTextField();
        submitButton = new JButton("Register");
        clearButton = new JButton("Clear");
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(deptLabel);
        add(departmentField);
        add(salaryLabel);
        add(salaryField);
        add(submitButton);
        add(clearButton);
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String id = idField.getText();
            String name = nameField.getText();
            String department = departmentField.getText();
            String salary = salaryField.getText();
            if (id.isEmpty() || name.isEmpty() ||
                department.isEmpty() || salary.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "Please enter all employee details.");
            } else {
                String details = "Employee Registered Successfully!\n\n"
                        + "Employee ID: " + id + "\n"
                        + "Name: " + name + "\n"
                        + "Department: " + department + "\n"
                        + "Salary: " + salary;
                JOptionPane.showMessageDialog(this, details);
            }
        }
        if (e.getSource() == clearButton) {
            idField.setText("");
            nameField.setText("");
            departmentField.setText("");
            salaryField.setText("");
        }
    }
    public static void main(String[] args) {
        new EmployeeRegistrationForm();
    }
}
