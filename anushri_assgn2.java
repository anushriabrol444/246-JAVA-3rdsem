class Account {
    int num;
    String name;
    double balance;

    // Default Constructor
    Account() {
        num = 0;
        name = "Unknown";
        balance = 0.0;
    }

    // Parameterized Constructor
    Account(int a, String n, double b) {
        num = a;
        name = n;
        balance = b;
    }

    // Copy Constructor
    Account(Account acc) {
        num = acc.num;
        name = acc.name;
        balance = acc.balance;
    }

    void showDetails() {
        System.out.println("Account No: " + num);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        Account acc1 = new Account();

        Account acc2 = new Account(1001, "Anushri", 6500);

        Account acc3 = new Account(acc2);

        System.out.println("Default Constructor:");
        acc1.showDetails();

        System.out.println("Parameterized Constructor:");
        acc2.showDetails();

        System.out.println("Copy Constructor:");
        acc3.showDetails();
    }
}
/*OUTPUT
Default Constructor:
Account No: 0
Name: Unknown
Balance: 0.0

Parameterized Constructor:
Account No: 1001
Name: Anushri
Balance: 6500.0

Copy Constructor:
Account No: 1001
Name: Anushri
Balance: 6500.0*/
