//first problem statement
import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        String m1 = sc.nextLine();
        System.out.print("Enter marks of Subject 2: ");
        String m2 = sc.nextLine();
        System.out.print("Enter marks of Subject 3: ");
        String m3 = sc.nextLine();
        // Convert String to Integer
        Integer mark1 = Integer.parseInt(m1);
        Integer mark2 = Integer.parseInt(m2);
        Integer mark3 = Integer.parseInt(m3);
        int total = mark1 + mark2 + mark3;
        System.out.println("\nTotal Marks = " + total);
        sc.close();
    }
}
/*OUTPUT
Enter marks of Subject 1: 80
Enter marks of Subject 2: 75
Enter marks of Subject 3: 90*/

// SECOND PROBLEM STATEMENT
import java.util.Scanner;
public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        String salary = sc.nextLine();
        System.out.print("Enter Bonus Amount: ");
        String bonus = sc.nextLine();
        // Convert String to Wrapper Objects
        Integer empId = Integer.valueOf(id);
        Double basicSalary = Double.valueOf(salary);
        Double bonusAmount = Double.valueOf(bonus);
        // Validation
        if (basicSalary < 0 || bonusAmount < 0) {
            System.out.println("Invalid Salary or Bonus Amount.");
        } else {
            double netSalary = basicSalary + bonusAmount;
            System.out.println("\nEmployee ID : " + empId);
            System.out.println("Basic Salary : " + basicSalary);
            System.out.println("Bonus : " + bonusAmount);
            System.out.println("Net Salary : " + netSalary);
        }
        sc.close();
    }
}
/*OUTPUT
Employee ID : 101
Basic Salary : 35000.0
Bonus : 5000.0
Net Salary : 40000.0*/
