//exercise question 1
import java.util.Scanner;

abstract class Payment {
    abstract void makePayment(double amount);
}

class CreditCard extends Payment {
    void makePayment(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using Credit Card.");
    }
}

class UPI extends Payment {
    void makePayment(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using UPI.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nChoose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCard();
        } else {
            payment = new UPI();
        }

        payment.makePayment(amount);

        sc.close();
    }
}
/*OUTPUT
Enter payment amount: 1500
Choose payment method:
1. Credit Card
2. UPI
Enter choice: 2
Payment of Rs. 1500.0 made using UPI.*/

//EXERCISE QUESTION 2
import java.util.Scanner;

abstract class FoodOrder {
    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + (amount * 0.05);
        System.out.println("Food Amount: Rs. " + amount);
        System.out.println("Service Charge: 5%");
        System.out.println("Total Bill: Rs. " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    void calculateBill() {
        double total = amount + (amount * 0.02);
        System.out.println("Food Amount: Rs. " + amount);
        System.out.println("Packaging Charge: 2%");
        System.out.println("Total Bill: Rs. " + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food order amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nChoose order type:");
        System.out.println("1. Dine-In");
        System.out.println("2. Takeaway");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        FoodOrder order;

        if (choice == 1) {
            order = new DineInOrder(amount);
        } else {
            order = new TakeAwayOrder(amount);
        }

        System.out.println("\n--- Bill Details ---");
        order.calculateBill();

        sc.close();
    }
}
/*OUTPUT
Enter food order amount: 1000

Choose order type:
1. Dine-In
2. Takeaway
Enter choice: 1

--- Bill Details ---
Food Amount: Rs. 1000.0
Service Charge: 5%
Total Bill: Rs. 1050.0*/
