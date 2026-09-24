// exercise question 1
import java.util.Scanner;

public class Main {

    static void login(String enteredPassword, String registeredPassword)
            throws Exception {

        if (!enteredPassword.equals(registeredPassword)) {
            throw new Exception("Invalid password!");
        }

        System.out.println("Login successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username;
        String password;

        System.out.println("===== USER REGISTRATION =====");

        System.out.print("Create username: ");
        username = sc.nextLine();

        System.out.print("Create password: ");
        password = sc.nextLine();

        System.out.println("\nRegistration successful!");

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Register Again");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("\n===== LOGIN =====");

                System.out.print("Enter username: ");
                String enteredUsername = sc.nextLine();

                System.out.print("Enter password: ");
                String enteredPassword = sc.nextLine();

                try {
                    if (!enteredUsername.equals(username)) {
                        throw new Exception("Invalid username!");
                    }

                    login(enteredPassword, password);
                }
                catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                finally {
                    System.out.println("Login verification process completed.");
                }

            }
            else if (choice == 2) {

                System.out.println("\n===== REGISTER AGAIN =====");

                System.out.print("Enter new username: ");
                username = sc.nextLine();

                System.out.print("Enter new password: ");
                password = sc.nextLine();

                System.out.println("Registration updated successfully.");
            }
            else if (choice == 3) {
                System.out.println("Thank you for using the system.");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}

/*OUTPUT
===== USER REGISTRATION =====
Create username: anushri
Create password: yuyuyuyu

Registration successful!

===== MENU =====
1. Login
2. Register Again
3. Exit
Enter your choice: 1

===== LOGIN =====
Enter username: anushri
Enter password: qwqw
ERROR!
Error: Invalid password!
Login verification process completed.

===== MENU =====
1. Login
2. Register Again
3. Exit
Enter your choice: 1

===== LOGIN =====
Enter username: anushri
Enter password: yuyuyuyu
Login successful.
Login verification process completed.

===== MENU =====
1. Login
2. Register Again
3. Exit
Enter your choice: 3
Thank you for using the system.
*/

// question 2

import java.util.Scanner;

public class Main {

    static void verifyPin(int enteredPin, int registeredPin) throws Exception {

        if (enteredPin != registeredPin) {
            throw new Exception("Invalid PIN entered!");
        }

        System.out.println("PIN verified successfully.");
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM PIN REGISTRATION =====");

        System.out.print("Create your 4-digit PIN: ");
        int pin = sc.nextInt();

        System.out.println("PIN registered successfully!");

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Verify PIN");
            System.out.println("2. Change PIN");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("\n===== PIN VERIFICATION =====");

                System.out.print("Enter your PIN: ");
                int enteredPin = sc.nextInt();

                try {
                    verifyPin(enteredPin, pin);
                }
                catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                finally {
                    System.out.println(
                        "PIN verification process completed."
                    );
                }

            }
            else if (choice == 2) {

                System.out.println("\n===== CHANGE PIN =====");

                System.out.print("Enter new PIN: ");
                pin = sc.nextInt();

                System.out.println("PIN changed successfully.");
            }
            else if (choice == 3) {
                System.out.println("Thank you for using the ATM.");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}
/*OUTPUT
===== ATM PIN REGISTRATION =====
Create your 4-digit PIN: 1234
PIN registered successfully!

===== ATM MENU =====
1. Verify PIN
2. Change PIN
3. Exit
Enter your choice: 2

===== CHANGE PIN =====
Enter new PIN: 3534
PIN changed successfully.

===== ATM MENU =====
1. Verify PIN
2. Change PIN
3. Exit
Enter your choice: 3
Thank you for using the ATM.

*/
