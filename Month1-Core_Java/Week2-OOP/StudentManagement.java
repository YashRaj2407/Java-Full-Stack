import java.util.*;

class Student {
    int rollNo;
    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    public void displayData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void exit() {
        System.out.println("Exiting the program.");
        sc.close();
    }
}

public class StudentManagement {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int choice, n;
        Student s[] = new Student[10];

        System.out.println("Welcome to Student Management System");
        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        s[i] = new Student();   // ✅ object creation
                        s[i].getData();
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        if (s[i] != null) {
                            s[i].displayData();
                        } else {
                            System.out.println("No data for student " + (i + 1));
                        }
                    }
                    break;

                case 3:
                    if (s[0] != null) s[0].exit();
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
        System.out.println("Thank you for using the Student Management System!");
    }
}
