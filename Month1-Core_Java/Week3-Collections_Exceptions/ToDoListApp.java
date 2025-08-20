import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = -1;

        System.out.println("===== To-Do List Application =====");

        while (choice != 4) {
            try {
                System.out.println("\n1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Remove Task");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter task: ");
                        String task = sc.nextLine();
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                        break;

                    case 2:
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks available.");
                        } else {
                            System.out.println("Your Tasks:");
                            for (int i = 0; i < tasks.size(); i++) {
                                System.out.println((i + 1) + ". " + tasks.get(i));
                            }
                        }
                        break;

                    case 3:
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks to remove.");
                        } else {
                            System.out.print("Enter task number to remove: ");
                            int index = sc.nextInt();
                            if (index <= 0 || index > tasks.size()) {
                                throw new IndexOutOfBoundsException("Invalid task number!");
                            }
                            String removed = tasks.remove(index - 1);
                            System.out.println("Removed task: " + removed);
                        }
                        break;

                    case 4:
                        System.out.println("Exiting To-Do List. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select 1–4.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number!");
                sc.nextLine(); // clear invalid input
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}


