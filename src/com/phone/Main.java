package com.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Contacts> contacts;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {

        contacts = new ArrayList<>();
        System.out.println("Welcome to my first mobile application");
        showInitialOption();
    }

    private static void showInitialOption() {
        System.out.println("Please select one " +
                "\n\t1. Manage Contact" +
                "\n\t2. Messages" +
                "\n\t3. Quit");
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showManageContact();
                break;
            case 2:
                showMessages();
                break;
            default:
                break;
        }
    }

    private static void showMessages() {
        System.out.println("Please select one" +
                "\n\t1. Show all messages" +
                "\n\t2. Send a new message" +
                "\n\t3. Go back");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            case 3:
                showInitialOption();
                break;
        }
    }

    private static void sendNewMessage() {
        System.out.println("Who do you want to send a message?");
        String name = scanner.next();
//        scanner.nextLine();

        if (name.equals("")) {
            System.out.println("Please enter a name");
            sendNewMessage();
        } else {
            boolean doesExist = false;
            for (Contacts c : contacts) {
                if (c.getName().equalsIgnoreCase(name)) {
                    doesExist = true;
                }
            }

            if (doesExist) {
                System.out.println("What do you want to say?");
                String text = scanner.next();
//                scanner.nextLine();

                if (text.equals("")) {
                    System.out.println("Please enter a message");
                    sendNewMessage();
                } else {
                    id++;
                    Message newMessage = new Message(name, text, id);
                    for (Contacts c : contacts) {
                        if (c.getName().equalsIgnoreCase(name)) {
                            ArrayList<Message> allMessages = c.getMessages();
                            allMessages.add(newMessage);
                            c.setMessages(allMessages);
                        }
                    }
                }
            } else {
                System.out.println("There is no such contact");
            }
        }
        showInitialOption();
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages = new ArrayList<>();
        for (Contacts c : contacts) {
            allMessages.addAll(c.getMessages());
        }

        if (allMessages.size() > 0) {
            for (Message m : allMessages) {
                m.getDetails();
                System.out.println("************************************");
            }
        } else {
            System.out.println("There are no messages");
        }
        showInitialOption();
    }

    private static void showManageContact() {
        System.out.println("Please select one" +
                "\n\t1. Show all contact" +
                "\n\t2. Search for a contact" +
                "\n\t3. Add contact" +
                "\n\t4. Delete a contact" +
                "\n\t5. Go back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContact();
                break;
            case 2:
                searchContact();
                break;
            case 3:
                AddNewContact();
                break;
            case 4:
                showDeleteContact();
                break;
            default:
                showInitialOption();
                break;
        }
    }

    private static void showDeleteContact() {
        System.out.println("Enter contact name to delete");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("Please fill the empty field");
            showDeleteContact();
        } else {
            boolean doesExist = false;
            for (Contacts c : contacts) {
                if (c.getName().equalsIgnoreCase(name)) {
                    doesExist = true;
                    contacts.remove(c);
                }
            }
            if (!doesExist) {
                System.out.println("There is no such contact.");
            }
        }
        showInitialOption();
    }

    private static void AddNewContact() {
        System.out.print("Adding new contact..." +
                "\nName: ");
        String name = scanner.next();
//        scanner.nextLine();
        System.out.print("Number: ");
        String number = scanner.next();
//        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
//        scanner.nextLine();

        if (name.equals("") || number.equals("") || email.equals("")) {
            System.out.println("Please don't leave the field blank!");
            AddNewContact();
        } else {
            boolean doesExist = false;
            for (Contacts c : contacts) {
                if (name.equalsIgnoreCase(c.getName())) {
                    doesExist = true;
                }
            }
            if (doesExist) {
                System.out.println("The name " + name + " already exist on this device.");
                AddNewContact();
            } else {
                Contacts contact = new Contacts(name, number, email);
                contacts.add(contact);
                System.out.println("Contact has been added successfully");
            }
        }
        showInitialOption();
    }

    private static void showAllContact() {
        if (contacts.size() > 0) {
            for (Contacts c : contacts) {
                c.getDetails();
                System.out.println("*********************************");
            }
        } else {
            System.out.println("You do not have any contact");
        }
        showInitialOption();
    }

    private static void searchContact() {
        System.out.print("Enter the contact name: ");
        String name = scanner.next();

        if (name.equals("")) {
            System.out.println("Please enter the contact name");
            searchContact();
        } else {
            boolean doesExist = false;
            for (Contacts c : contacts) {
                if (name.equalsIgnoreCase(c.getName())) {
                    doesExist = true;
                    c.getDetails();
                }
            }
            if (!doesExist) {
                System.out.println("There is no such contact.");
            }
        }
        showInitialOption();
    }

}
