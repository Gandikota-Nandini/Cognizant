public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result); // Output will be 610

        result = (a + b) * c; // Parentheses change the order of evaluation
        System.out.println("Result of (a + b) * c: " + result); // Output will be 900

        result = a + (b - c) * a; // Subtraction and multiplication
        System.out.println("Result of a + (b - c) * a: " + result); // Output will be -100
    }
}
