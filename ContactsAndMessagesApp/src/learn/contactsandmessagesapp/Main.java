package learn.contactsandmessagesapp;

import java.util.*;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scan;
    private static int id = 0;

    public static void main(String[] args) {
        /* Simulator of phones contacts and messages apps */
        System.out.println("Hello!");

        contacts = new ArrayList<>();

        showOptions();
    }

    private static void showOptions() {
        System.out.print("\nChoose option: " +
                "\n-------------------------" +
                "\n\t1. Manage contacts" +
                "\n\t2. Messages" +
                "\n\t3. Quit" +
                "\n------------------------" +
                "\nEnter your choice: ");

        scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                manageContacts();
                break;
            }
            case 2: {
                manageMessages();
                break;
            }
            default:
                break;
        }
    }

    private static void manageContacts() {
        System.out.print("\nChoose contacts option: " +
                "\n-------------------------" +
                "\n\t1. Show all contacts" +
                "\n\t2. Add a new contact" +
                "\n\t3. Search for a contact" +
                "\n\t4. Delete a contact" +
                "\n\t5. Go back to previous menu" +
                "\n-------------------------" +
                "\nEnter your choice: ");

        int choiceContact = scan.nextInt();
        switch (choiceContact) {
            case 1 -> showAllContacts();
            case 2 -> addNewContact();
            case 3 -> searchContact();
            case 4 -> deleteContact();
            default -> showOptions();
        }
    }

    private static void showAllContacts() {
        if (contacts.size() > 0) {
            for (Contact c: contacts) {
                c.getDetails();
                System.out.println("**********************");
            }
        } else {
            System.out.println("You don't have any contact...");
        }

        showOptions();
    }

    private static void addNewContact() {
        System.out.print("Please enter a new contact's name: ");
        String name = scan.next();
        System.out.print("Please enter contact's phone number: ");
        String phone = scan.next();
        System.out.print("Please enter the contact's email: ");
        String email = scan.next();

        if (name.equals("") || phone.equals("") || email.equals("")) {
            System.out.println("Please enter all of the information...");
            addNewContact();
        } else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    break;
                }
            }

            if (doesExist) {
                System.out.println("The contact named " + name + " saved on this device");
                addNewContact();
            } else {
                Contact contact = new Contact(name, phone, email);
                contacts.add(contact);
                System.out.println("The new contact  named " + name + " was added successfully...");
            }
        }

        showOptions();
    }

    private static void searchContact() {
        System.out.print("Please enter the contact's name: ");
        String name = scan.next();
        if (name.equals("")) {
            System.out.print("Please enter a name: ");
            searchContact();
        } else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact");
            }
        showOptions();
        }
    }

    private static void deleteContact() {
        System.out.print("Please enter contact's name: ");
        String name = scan.next();
        if (name.equals("")) {
            System.out.print("Please enter the name: ");
            deleteContact();
        } else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    contacts.remove(c);
                    System.out.println("The contact was deleted...");
                }
            }

            if (!doesExist) {
                System.out.println("There is no such contact");
            }
        }

        showOptions();
    }

    private static void manageMessages() {
        System.out.print("\nChoose message option: " +
                "\n-------------------------" +
                "\n\t1. See the list of all messages" +
                "\n\t2. Send a new message" +
                "\n\t3. Go back to previous menu" +
                "\n-------------------------" +
                "\nEnter your choice: ");

        int choiceMessage = scan.nextInt();
        switch (choiceMessage) {
            case 1 -> showAllMessages();
            case 2 -> sendNewMessage();
            default -> showOptions();
        }
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contact c: contacts) {
            allMessages.addAll(c.getMessages());
        }

        if (allMessages.size() > 0) {
            for (Message m: allMessages) {
                m.getDetails();
                System.out.println("**********************");
            }
        } else {
            System.out.println("You don't have any message...");
        }

        showOptions();
    }

    private static void sendNewMessage() {
        System.out.println("Who are you going to send a message?");
        String name = scan.next();
        if (name.equals("")) {
            System.out.println("Please enter the name of the contact");
            sendNewMessage();
        } else {
            boolean doesExist = false;
            for (Contact c: contacts) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                    break;
                }
            }

            if (doesExist) {
                System.out.println("What are you going to say?");
                String text = scan.next();
                if (text.equals("")) {
                    System.out.println("Please enter some message");
                    sendNewMessage();
                } else {
                    id++;
                    Message newMessage = new Message(name, text, id);
                    for (Contact c: contacts) {
                        if (c.getName().equals(name)) {
                            ArrayList<Message> newMessages = new ArrayList<>();
                            newMessages.add(newMessage);
                            c.setMessages(newMessages);
                        }
                    }
                }
            } else {
                System.out.println("There is no such contact");
            }
        }

        showOptions();
    }

}
