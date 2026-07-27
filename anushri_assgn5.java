/*first question*/
import java.util.ArrayList;
public class ToDoList {
    public static void main(String[] args) {
        // ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks
        tasks.add("Complete Java Assignment");
        tasks.add("Study for DBMS");
        tasks.add("Attend Lab");
        // Removing a task
        tasks.remove("Study for DBMS");
        // Display tasks using StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append("To-Do List\n");
        sb.append("-----------------\n");
        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }
        System.out.println(sb);
    }
}
/*OUTPUT
To-Do List
-----------------
1. Complete Java Assignment
2. Attend Lab*/

/*second question*/
import java.util.ArrayList;
public class CourseRegistration {
    public static void main(String[] args) {
        // ArrayList to store courses
        ArrayList<String> courses = new ArrayList<>();
        // Adding courses
        courses.add("Java");
        courses.add("DBMS");
        courses.add("Operating System");
        // Removing a course
        courses.remove("DBMS");
        // Displaying registered courses
        StringBuffer sb = new StringBuffer();
        sb.append("Registered Courses\n");
        sb.append("-----------------------\n");
        for (int i = 0; i < courses.size(); i++) {
            sb.append((i + 1) + ". " + courses.get(i) + "\n");
        }
        System.out.println(sb);
    }
}
/*OUTPUT
Registered Courses
-----------------------
1. Java
2. Operating System*/

//VECTOR
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> students = new Vector<>();
        // Add elements
        students.add("Anushri");
        students.add("Rahul");
        students.add("anushka");
        // Remove an element
        students.remove("Rahul");
        // Display all elements
        System.out.println("Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
    }
}

//output
//Student List:
//1. Anushri
//2. anushka
