import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n-=-=-=-=Contact List-=-=-=-=-");
            System.out.print("[1] - Add contacts\n" +
                    "[2] - Remove contact\n" +
                    "[3] - Search contact\n" +
                    "[4] - View contact list\n" +
                    "[5] - Exit\n" +
                    "Choose an option:");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Contact name: ");
                    String name = scanner.nextLine();
                    contacts.add(name);
                    System.out.println("Added contact!");
                    break;
                case 2:
                    System.out.print("Name of the contact to be removed: ");
                    String removeName = scanner.nextLine();
                    boolean removed = contacts.remove(removeName);
                    if (removed) {
                        System.out.println("Contact removed!");
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;
                case 3:
                    System.out.print("Name you want to search: ");
                    String searchName = scanner.nextLine();
                    boolean findName = contacts.contains(searchName);
                    if (findName) {
                        System.out.println("Contact found!");
                        System.out.println(contacts);
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;
                case 4:
                    if (contacts.isEmpty()) {
                        System.out.println("Empty contact list!");
                    } else {
                        System.out.println("Contact list:");
                        for (String contact : contacts) {
                            System.out.println(contacts);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Closing...");
                    return;
                default:
                    System.out.println("Wrong option!");
            }
        }
    }
}
