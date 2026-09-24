//exercise question 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        try {
            System.out.println("----- ATM -----");
            System.out.println("Available balance: " + balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new Exception("Withdrawal amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance.");
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: " + balance);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
/*output
----- ATM -----
Available balance: 10000.0
Enter withdrawal amount: 5600
Withdrawal successful.
Remaining balance: 4400.0*/

// exercise question 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("----- Online Shopping -----");

            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new Exception("Product quantity must be greater than zero.");
            }

            System.out.println("\nOrder placed successfully.");
            System.out.println("Product: " + product);
            System.out.println("Quantity: " + quantity);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
/*OUTPUT
----- Online Shopping -----
Enter product name: CHIPS
Enter product quantity: 2

Order placed successfully.
Product: CHIPS
Quantity: 2

*/

