import java.util.*;

class Shape {

    void area(double radius) {
        double a = Math.PI * radius * radius;
        System.out.println("The area of Circle = " + a);
    }

    void area(double l, double b) {
        double a = l * b;
        System.out.println("The area of Rectangle = " + a);
    }

    void area(int side) {
        int a = side * side;
        System.out.println("The area of Square = " + a);
    }

    void area(double b, double h, boolean Triangle) {
        double a = 0.5 * b * h;
        System.out.println("The area of Triangle = " + a);
    }
}

public class ShapeArea {
    public static void main(String args[]) {
        Shape s = new Shape();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Square");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice = ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the Radius = ");
                    double r = sc.nextDouble();
                    s.area(r);
                    break;

                case 2:
                    System.out.print("Enter the Length = ");
                    double l = sc.nextDouble();
                    System.out.print("Enter the Breadth = ");
                    double b = sc.nextDouble();
                    s.area(l, b);
                    break;

                case 3:
                    System.out.print("Enter the Side = ");
                    int w = sc.nextInt();
                    s.area(w);
                    break;

                case 4:
                    System.out.print("Enter the Base = ");
                    double q = sc.nextDouble();
                    System.out.print("Enter the Height = ");
                    double h = sc.nextDouble();
                    s.area(q, h, true);
                    break;

                case 5:
                    System.out.println("Exiting Program... Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
                    break;
            }

        } while (ch != 5);

        sc.close();
    }
}
