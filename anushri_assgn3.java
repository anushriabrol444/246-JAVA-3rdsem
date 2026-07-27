class Calculator {
    // Static variable
    static int count = 0;
    // Method Overloading
    int add(int a, int b) {
        count++;
        return a + b;
    }
    int add(int a, int b, int c) {
        count++;
        return a + b + c;
    }
    double add(double a, double b) {
        count++;
        return a + b;
    }
    // Static Method
    static void showCount() {
        System.out.println("Total Calculations Performed: " + count);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition of 2 integers: " + c.add(10, 20));
        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Addition of 2 decimal numbers: " + c.add(10.5, 20.5));
        Calculator.showCount();
    }
}
/*OUTPUT
Addition of 2 integers: 30
Addition of 3 integers: 60
Addition of 2 decimal numbers: 31.0
Total Calculations Performed: 3
*/
