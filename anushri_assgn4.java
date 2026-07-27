class WrapperDemo {
    public static void main(String[] args) {
        // Primitive variables
        int num1 = 20;
        double num2 = 15.5;
        // Autoboxing (Primitive to Wrapper Object)
        Integer obj1 = num1;
        Double obj2 = num2;
        System.out.println("After Autoboxing:");
        System.out.println("Integer Object: " + obj1);
        System.out.println("Double Object: " + obj2);
        // Unboxing (Wrapper Object to Primitive)
        int a = obj1;
        double b = obj2;

        // Basic Operations
        int sum = a + 30;
        double product = b * 2;
        System.out.println("\nAfter Unboxing:");
        System.out.println("Integer Value: " + a);
        System.out.println("Double Value: " + b);
        System.out.println("\nBasic Operations:");
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}
/*OUTPUT
After Autoboxing:
Integer Object: 20
Double Object: 15.5

After Unboxing:
Integer Value: 20
Double Value: 15.5

Basic Operations:
Sum = 50
Product = 31.0*/
