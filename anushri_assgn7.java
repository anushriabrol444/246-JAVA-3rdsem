// code in class
class Animal {
    void eat(){
        System.out.println("this animal eats food.");
    }
}
class Dog extends Animal{
    void bark (){
        System.out.println("dog barks");
    }
}
class Cat extends Animal{
    void meow (){
        System.out.println("cat meows");
    }
}
public class Hierarchicalinheritance{
    public static void main(String[] args){
    Dog d= new Dog();
    d.eat();
    d.bark();
    Cat c = new Cat();
    c.eat();
    c.meow();
    }
}

// Exercise question 1:
class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}
/*OUTPUT
Area of Circle: 78.5
Area of Rectangle: 50
*/

// exercise question 2
interface Product {
    void displayDetails();
}

class ProductInfo {
    String name;
    double price;

    ProductInfo(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronics extends ProductInfo implements Product {

    Electronics(String name, double price) {
        super(name, price);
    }

    public void displayDetails() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: " + price);
    }
}

class Clothing extends ProductInfo implements Product {

    Clothing(String name, double price) {
        super(name, price);
    }

    public void displayDetails() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: " + price);
    }
}

class Grocery extends ProductInfo implements Product {

    Grocery(String name, double price) {
        super(name, price);
    }

    public void displayDetails() {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Electronics e = new Electronics("Laptop", 50000);
        Clothing c = new Clothing("T-Shirt", 800);
        Grocery g = new Grocery("Rice", 1000);

        e.displayDetails();
        c.displayDetails();
        g.displayDetails();
    }
}
/*OUTPUT
Electronic Product: Laptop
Price: 50000.0

Clothing Product: T-Shirt
Price: 800.0

Grocery Product: Rice
Price: 1000.0*/
