class Calculator {
    // Static variable
    static int count = 0;
    // Overloaded method for two integers
    int add(int a, int b) {
        count++;
        return a + b;
    }
    // Overloaded metod for three integers
    int add(int a, int b, int c) {
        count++;
        return a + b + c;
    }
    // Overloaded method for decimal numbers
    double add(double a, double b) {
        count++;
        return a + b;
    }
    // Static method
    static void showCount() {
        System.out.println("Total Calculations: " + count);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition of 2 Integers: " + c.add(10, 20));
        System.out.println("Addition of 3 Integers: " + c.add(10, 20, 30));
        System.out.println("Addition of Decimals: " + c.add(10.5, 20.5));
        Calculator.showCount();
    }
}
/*OUTPUT
Addition of 2 Integers: 30
Addition of 3 Integers: 60
Addition of Decimals: 31.0
Total Calculations: 3*/

//RESTAURANT BILLING APPLICATION, QUESTION TWO
import java.util.Scanner;
class Restaurant {
    static int totalOrders = 0;
    double calculateBill(double amount) {
        totalOrders++;
        return amount;
    }
    double calculateBill(double amount, double packingCharge) {
        totalOrders++;
        return amount + packingCharge;
    }
    double calculateBill(double amount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return amount + packingCharge + deliveryCharge;
    }
    static void showOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant r = new Restaurant();
        System.out.println("1. Dine-In");
        System.out.println("2. Takeaway");
        System.out.println("3. Delivery");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter Food Amount: ");
        double amount = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Total Bill = " + r.calculateBill(amount));
                break;
            case 2:
                System.out.print("Enter Packing Charge: ");
                double packing = sc.nextDouble();
                System.out.println("Total Bill = " + r.calculateBill(amount, packing));
                break;
            case 3:
                System.out.print("Enter Packing Charge: ");
                packing = sc.nextDouble();
                System.out.print("Enter Delivery Charge: ");
                double delivery = sc.nextDouble();
                System.out.println("Total Bill = " + r.calculateBill(amount, packing, delivery));
                break;
            default:
                System.out.println("Invalid Choice");
        }
        Restaurant.showOrders();
        sc.close();
    }
}
/*OUTPUT
Dine-in Bill: 500.0
Takeaway Bill: 530.0
Delivery Bill: 580.0
Total Orders: 3*/
