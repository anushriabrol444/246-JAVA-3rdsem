//exercise question 1
import java.util.Scanner;
public class VotingSystem {
    // User-defined exception
    static class UnderAgeException extends Exception {
        UnderAgeException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new UnderAgeException(
                    "You are not eligible to vote. Minimum age is 18."
                );
            }
            System.out.println("You are eligible to vote.");
        }
        catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
/* output
Enter your age: 24
You are eligible to vote. */

//exercise question 2
import java.util.Scanner;
public class DrivingLicense {
    // User-defined exception
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException(
                    "You are not eligible for a driving license. Minimum age is 18."
                );
            }
            System.out.println("You are eligible for a driving license.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
/*output
Enter your age: 23
You are eligible for a driving license.
*/
