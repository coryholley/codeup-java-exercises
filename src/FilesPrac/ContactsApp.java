package FilesPrac;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ContactsApp {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String directoryName = "Contacts_Manager_App";
        String fileName = "contacts.txt";
        Boolean toStartAgain;
        Boolean toKeepAdding;

        Path dataFilePath = ContactsFile.createDirectoryAndFile(directoryName, fileName);


        try {
            System.out.println("\n"+"Welcome to your contacts manager. What would you like to do?"+"\n");
            do {
                ContactsFile.printMenu();
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        ContactsFile.printFileContents(dataFilePath);
                        break;
                    case 2:
                        do {
                            ContactsFile contact = new ContactsFile();
                            contact.addContacts(dataFilePath);
                            toKeepAdding = ContactsFile.yesNo("Would you like to add another?");
                        }while(toKeepAdding);
                        break;
                    case 3:
                        ContactsFile.searchContact(dataFilePath);
                        break;
                    case 4:
                        ContactsFile.deleteContact(dataFilePath);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
                toStartAgain = ContactsFile.yesNo("Would you like to see the menu again?");
            } while (toStartAgain);
        } catch (IOException ioex) {
            System.out.println("Error");
        }

    }

}