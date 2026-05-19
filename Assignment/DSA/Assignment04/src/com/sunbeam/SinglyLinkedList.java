package com.sunbeam;

import java.util.Scanner;

class SinglyLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert after given value
    public void insertAfterValue(int target, int newData) {
        Node temp = head;

        while (temp != null && temp.data != target) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found!");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete a node
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found!");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method (Menu)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert After Value");
            System.out.println("4. Delete");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    list.insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter target value: ");
                    int target = sc.nextInt();
                    System.out.print("Enter new data: ");
                    int newData = sc.nextInt();
                    list.insertAfterValue(target, newData);
                    break;

                case 4:
                    System.out.print("Enter value to delete: ");
                    list.delete(sc.nextInt());
                    break;

                case 5:
                    list.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
