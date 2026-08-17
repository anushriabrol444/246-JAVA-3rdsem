//EXERCISE QUESTION 1
import java.util.Scanner;

class BankAccount {
    final int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, name, balance);

        account.display();

        sc.close();
    }
}
/*output
Enter account number: 12345
Enter account holder name: Anushri
Enter balance: 50000

--- Bank Account Details ---
Account Number: 12345
Account Holder: Anushri
Balance: 50000.0*/

//EXERCISE QUESTION 2
import java.util.Scanner;

class Book {
    final String ISBN;
    String title;
    String author;
    double price;

    Book(String ISBN, String title, String author, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String ISBN = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        Book book = new Book(ISBN, title, author, price);

        book.display();

        sc.close();
    }
}
/*OUTPUT
Enter ISBN: 9781234567890
Enter book title: Java Programming
Enter author name: James
Enter book price: 599

--- Book Details ---
ISBN: 9781234567890
Title: Java Programming
Author: James
Price: 599.0*/
