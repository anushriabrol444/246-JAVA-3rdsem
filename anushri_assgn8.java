//EXERCISE QUESTION 1
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);   // calls parent constructor
        this.department = department;
    }

    void displayManager() {
        super.display();       // calls parent method
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter manager name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        Manager m = new Manager(name, salary, department);

        System.out.println("\n--- Manager Details ---");
        m.displayManager();

        sc.close();
    }
}
/*OUTPUT
Enter manager name: Anushri
Enter salary: 60000
Enter department: IT

--- Manager Details ---
Employee Name: Anushri
Salary: 60000.0
Department: IT*/

// EXERCISE QUESTION 2
import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String vehicleType;

    Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class VehicleInsurance extends Vehicle {
    String ownerName;
    double insuranceAmount;

    VehicleInsurance(String vehicleNumber, String vehicleType,
                     String ownerName, double insuranceAmount) {

        super(vehicleNumber, vehicleType);  // calls parent constructor
        this.ownerName = ownerName;
        this.insuranceAmount = insuranceAmount;
    }

    void displayInsurance() {
        super.displayVehicle();             // calls parent method
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Insurance Amount: " + insuranceAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        System.out.print("Enter vehicle type: ");
        String type = sc.nextLine();

        System.out.print("Enter owner name: ");
        String owner = sc.nextLine();

        System.out.print("Enter insurance amount: ");
        double amount = sc.nextDouble();

        VehicleInsurance v = new VehicleInsurance(
                number, type, owner, amount
        );

        System.out.println("\n--- Vehicle Insurance Details ---");
        v.displayInsurance();

        sc.close();
    }
}
/*OUTPUT
Enter vehicle number: MH12AB1234
Enter vehicle type: Car
Enter owner name: Anushri
Enter insurance amount: 25000

--- Vehicle Insurance Details ---
Vehicle Number: MH12AB1234
Vehicle Type: Car
Owner Name: Anushri
Insurance Amount: 25000.0*/
