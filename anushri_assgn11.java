// EXERCISE QUESTION 1:
import java.util.Scanner;

interface Printable {
    void print();
}

class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Employee implements Printable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void print() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Details");
        System.out.print("Enter name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter Employee Details");
        System.out.print("Enter name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        Student s = new Student(studentName, rollNo);
        Employee e = new Employee(employeeName, id);

        s.print();
        e.print();

        sc.close();
    }
}
/*OUTPUT
Enter Student Details
Enter name: Anushri
Enter roll number: 21

Enter Employee Details
Enter name: Rahul
Enter employee ID: 105

--- Student Details ---
Name: Anushri
Roll No: 21

--- Employee Details ---
Name: Rahul
Employee ID: 105*/

// EXERCISE QUESTION 2
import java.util.Scanner;

interface Switchable {
    void turnOn();
}

class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is ON.");
    }
}

class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is ON.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light light = new Light();
        Fan fan = new Fan();

        System.out.println("Choose a device:");
        System.out.println("1. Light");
        System.out.println("2. Fan");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            light.turnOn();
        } 
        else if (choice == 2) {
            fan.turnOn();
        } 
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
/*OUTPUT
Choose a device:
1. Light
2. Fan
Enter your choice: 1
Light is ON.*/
