//exercise question 1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUICalculator extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton addButton, subtractButton, clearButton;
    GUICalculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel num1Label = new JLabel("Enter First Number:");
        JLabel num2Label = new JLabel("Enter Second Number:");
        JLabel resultLabel = new JLabel("Result:");
        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        addButton = new JButton("Addition");
        subtractButton = new JButton("Subtraction");
        clearButton = new JButton("Clear");
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(new JLabel(""));
        add(clearButton);
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        clearButton.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            resultField.setText(String.valueOf(num1 + num2));
        }
        if (e.getSource() == subtractButton) {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            resultField.setText(String.valueOf(num1 - num2));
        }
        if (e.getSource() == clearButton) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
        }
    }
    public static void main(String[] args) {
        new GUICalculator();
    }
}
// exercise question 2
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BankBalanceCalculator extends JFrame implements ActionListener {
    JTextField balanceField, amountField, resultField;
    JButton depositButton, withdrawButton, clearButton;
    BankBalanceCalculator() {
        setTitle("Bank Balance Calculator");
        setSize(450, 320);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel balanceLabel = new JLabel("Initial Balance:");
        JLabel amountLabel = new JLabel("Transaction Amount:");
        JLabel resultLabel = new JLabel("Updated Balance:");
        balanceField = new JTextField();
        amountField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        clearButton = new JButton("Clear");
        add(balanceLabel);
        add(balanceField);
        add(amountLabel);
        add(amountField);
        add(resultLabel);
        add(resultField);
        add(depositButton);
        add(withdrawButton);
        add(new JLabel(""));
        add(clearButton);
        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        clearButton.addActionListener(this);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositButton) {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());
            double newBalance = balance + amount;
            resultField.setText(String.valueOf(newBalance));
        }

        if (e.getSource() == withdrawButton) {
            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());
            if (amount <= balance) {
                double newBalance = balance - amount;
                resultField.setText(String.valueOf(newBalance));
            } else {
                JOptionPane.showMessageDialog(this,
                    "Insufficient balance.");
            }
        }
        if (e.getSource() == clearButton) {
            balanceField.setText("");
            amountField.setText("");
            resultField.setText("");
        }
    }
    public static void main(String[] args) {
        new BankBalanceCalculator();
    }
}
