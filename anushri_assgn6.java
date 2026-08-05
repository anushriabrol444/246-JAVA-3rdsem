//class code
import java.util.Scanner;
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    // Inner class
    class AnimalInfo {
        void display() {
            System.out.println("\nAnimal Name: " + name);
        }
    }
}
interface Sound {
    void makeSound();
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        String name = sc.nextLine();
        Animal animal = new Animal(name);
        // Create object of inner class
        Animal.AnimalInfo info = animal.new AnimalInfo();
        info.display();
        // Anonymous class
        Sound sound = new Sound() {
            public void makeSound() {
                if (name.equalsIgnoreCase("Dog"))
                    System.out.println("Dog says: Bark!");
                else if (name.equalsIgnoreCase("Cat"))
                    System.out.println("Cat says: Meow!");
                else if (name.equalsIgnoreCase("Cow"))
                    System.out.println("Cow says: Moo!");
                else if (name.equalsIgnoreCase("Lion"))
                    System.out.println("Lion says: Roar!");
                else
                    System.out.println("Sound not available.");
            }
        };

        sound.makeSound();
        sc.close();
    }
}
/*OUTPUT
Enter animal name: dog
Animal Name: dog
Dog says: Bark!*/

// EXERCISE QUESTION 1
import java.util.Scanner;
class Vehicle {
    String name;
    String number;
    Vehicle(String name, String number) {
        this.name = name;
        this.number = number;
    }
    // Inner clas
    class VehicleDetails {
        void display() {
            System.out.println("\nVehicle Details");
            System.out.println("Vehicle Name : " + name);
            System.out.println("Vehicle Number : " + number);
        }
    }
}
interface Action {
    void perform();
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle name: ");
        String name = sc.nextLine();
        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();
        Vehicle vehicle = new Vehicle(name, number);
        // Using inner class
        Vehicle.VehicleDetails details = vehicle.new VehicleDetails();
        details.display();
        // Anonymous class
        Action action = new Action() {
            public void perform() {
                System.out.println("Vehicle is starting...");
            }
        };
        action.perform();
        sc.close();
    }
}
/*OUTPUT
Enter vehicle name: toyota
Enter vehicle number: 5678
Vehicle Details
Vehicle Name : toyota
Vehicle Number : 5678
Vehicle is starting...*/

//SECOND EXERCISE QUESTION
import java.util.Scanner;
class FoodOrder {
    String customer;
    String item;
    FoodOrder(String customer, String item) {
        this.customer = customer;
        this.item = item;
    }
    // Inner class
    class OrderDetails {
        void display() {
            System.out.println("\nOrder Details");
            System.out.println("Customer Name : " + customer);
            System.out.println("Food Item : " + item);
        }
    }
}
interface DeliveryStatus {
    void update();
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customer = sc.nextLine();
        System.out.print("Enter food item: ");
        String item = sc.nextLine();
        FoodOrder order = new FoodOrder(customer, item);
        // Using inner class
        FoodOrder.OrderDetails details = order.new OrderDetails();
        details.display();
        // Anonymous class
        DeliveryStatus status = new DeliveryStatus() {
            public void update() {
                System.out.println("Order is out for delivery.");
            }
        };
        status.update();
        sc.close();
    }
}
/*PUTPUT
Enter customer name: Anushri
Enter food item: Pizza
Order Details
Customer Name : Anushri
Food Item : Pizza
Order is out for delivery.*/
