// EXERCISE QUESTION 1
package student;

public class Student {
    String name;
    int rollNo;
    String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
package faculty;

public class Faculty {
    String name;
    int id;
    String subject;

    public Faculty(String name, int id, String subject) {
        this.name = name;
        this.id = id;
        this.subject = subject;
    }

    public void display() {
        System.out.println("\n--- Faculty Details ---");
        System.out.println("Name: " + name);
        System.out.println("Faculty ID: " + id);
        System.out.println("Subject: " + subject);
    }
}
import java.util.Scanner;
import student.Student;
import faculty.Faculty;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Details");
        System.out.print("Enter name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        System.out.println("\nEnter Faculty Details");
        System.out.print("Enter name: ");
        String facultyName = sc.nextLine();

        System.out.print("Enter faculty ID: ");
        int facultyId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter subject: ");
        String subject = sc.nextLine();

        Student s = new Student(studentName, rollNo, course);
        Faculty f = new Faculty(facultyName, facultyId, subject);

        s.display();
        f.display();

        sc.close();
    }
}
/*OUTPUT
Enter Student Details
Enter name: Anushri
Enter roll number: 21
Enter course: CSE

Enter Faculty Details
Enter name: Rahul
Enter faculty ID: 105
Enter subject: Java

--- Student Details ---
Name: Anushri
Roll Number: 21
Course: CSE

--- Faculty Details ---
Name: Rahul
Faculty ID: 105
Subject: Java*/

// EXERCISE QUESTION 2
package library;

public class Book {
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
    }
}import java.util.Scanner;
import library.Book;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Details");

        System.out.print("Enter Book ID: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Book b = new Book(bookId, title, author, price);

        b.display();

        sc.close();
    }
}
/*OUTPUT
Enter Book Details
Enter Book ID: 101
Enter Book Title: Java Programming
Enter Author Name: James
Enter Price: 550

--- Book Details ---
Book ID: 101
Title: Java Programming
Author: James
Price: Rs. 550.0*/
