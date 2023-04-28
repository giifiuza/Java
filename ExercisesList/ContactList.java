import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> contacts = new ArrayList<>();
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
                    System.out.print("Contact number: ");
                    int number = scanner.nextInt();
                    contacts.add(number);
                    System.out.println("Added contact!");
                    break;
                case 2:
                    System.out.println("Which contact do you want remove: ");
                    System.out.println(contacts);
                    System.out.print("Number of the index contact to be removed: ");
                    int index = scanner.nextInt() -1;
                    contacts.remove(index);
                    System.out.println("Contact removed!");

                    break;
                case 3:
                    System.out.print("What number do you want to search: ");
                    int searchNumber = scanner.nextInt();
                    if(contacts.contains(searchNumber)){
                        System.out.println("Contact found");
                        System.out.println(contacts);
                    }else{
                        System.out.println("Contact not found");
                    }
                    break;
                case 4:
                    if (contacts.isEmpty()) {
                        System.out.println("Empty contact list!");
                    } else {
                        System.out.println("Contact list:");
                        for (int contact : contacts) {
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
