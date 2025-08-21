import java.util.ArrayList;
import java.util.*;

public class ContactBook {
    public static void main(String args[]) {
        ArrayList<String> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. ADD CONTACT");
            System.out.println("2. DISPLAY CONTACTS");
            System.out.println("3. FIND CONTACT");
            System.out.println("4. EXIT");

            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Contact Number: ");
                    String no = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    contacts.add(no + " - " + name);
                    System.out.println("Contact Added!");
                    break;

                case 2:
                    System.out.println("Contacts: " + contacts);
                    break;

                case 3:
                    System.out.print("Enter Name to Find: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (String c : contacts) {
                        if (c.contains(search)) {
                            System.out.println("Contact Found: " + c);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Contact Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Exited from Contact Book...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }
}
