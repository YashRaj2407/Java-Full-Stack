import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("Choose operation: + - * /");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+': System.out.println("Result: " + (a + b)); break;
                case '-': System.out.println("Result: " + (a - b)); break;
                case '*': System.out.println("Result: " + (a * b)); break;
                case '/': 
                    if (b == 0) throw new ArithmeticException("Division by zero!");
                    System.out.println("Result: " + (a / b));
                    break;
                default: System.out.println("Invalid operation!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
