public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int num1 = 100;
        double num2 = num1; // int to double
        System.out.println("Implicit Type Casting (Widening): " + num2);

        // Explicit Type Casting (Narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Type Casting (Narrowing): " + num4);
    }
}
