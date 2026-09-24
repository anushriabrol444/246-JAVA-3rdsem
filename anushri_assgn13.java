// exercise question 1

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("employee.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter employee id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee department: ");
            String department = sc.nextLine();

            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();

            bw.write("Employee ID: " + id);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Department: " + department);
            bw.newLine();
            bw.write("Salary: " + salary);
            bw.newLine();

            bw.close();

            System.out.println("\nEmployee details written to file.");

            BufferedReader br = new BufferedReader(
                new FileReader("employee.txt")
            );

            String line;
            System.out.println("\nEmployee Details:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}

/*OUTPUT
Enter employee id: 2342
Enter employee name: ANUSHRI
Enter employee department: CSW
Enter employee salary: 123213

Employee details written to file.

Employee Details:
Employee ID: 2342
Name: ANUSHRI
Department: CSW
Salary: 123213.0*/

// exercise question 2

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("patient.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter diagnosis: ");
            String diagnosis = sc.nextLine();

            bw.write("Patient ID: " + id);
            bw.newLine();
            bw.write("Name: " + name);
            bw.newLine();
            bw.write("Age: " + age);
            bw.newLine();
            bw.write("Diagnosis: " + diagnosis);
            bw.newLine();

            bw.close();

            System.out.println("\nPatient details written to file.");

            BufferedReader br = new BufferedReader(
                new FileReader("patient.txt")
            );

            String line;
            System.out.println("\nPatient Details:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}

/*OUTPUT
Enter patient ID: 4545
Enter patient name: ANUSHRI
Enter patient age: 21
Enter diagnosis: gastritis

Patient details written to file.

Patient Details:
Patient ID: 4545
Name: ANUSHRI
Age: 21
Diagnosis: gastritis
*/
