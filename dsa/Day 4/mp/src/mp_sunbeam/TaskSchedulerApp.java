package mp_sunbeam;

import java.util.Scanner;

class TaskNode {
    int taskId;
    String taskName;
    TaskNode next, prev;

    public TaskNode(int id, String name) {
        this.taskId = id;
        this.taskName = name;
        next = prev = null;
    }
}



class DoublyCircularLinkedList {
    private TaskNode head = null;

    // 1. Add Task at Position
    public void addTask(int id, String name, int pos) {
        TaskNode newNode = new TaskNode(id, name);

        if (head == null) {
            head = newNode;
            head.next = head.prev = head;
            return;
        }

        int size = countTasks();
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid Position!");
            return;
        }

        if (pos == 1) {
            TaskNode tail = head.prev;

            newNode.next = head;
            newNode.prev = tail;
            tail.next = head.prev = newNode;
            head = newNode;
        } else {
            TaskNode temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // 2. Delete Task at Position
    public void deleteTask(int pos) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        int size = countTasks();
        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position!");
            return;
        }

        if (size == 1) {
            head = null;
            return;
        }

        if (pos == 1) {
            TaskNode tail = head.prev;
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else {
            TaskNode temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // 3. Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        TaskNode temp = head;
        do {
           System.out.println("id " + temp.taskId + "  name : " + temp.taskName) ;
            temp = temp.next;
        } while (temp != head);
    }

    // 4. Display Backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        TaskNode temp = head.prev;
        TaskNode last = temp;

        do {
            System.out.println(temp.taskId + " - " + temp.taskName);
            temp = temp.prev;
        } while (temp != last);
    }

    // 5. Search Task by ID
    public TaskNode searchTask(int id) {
        if (head == null) return null;

        TaskNode temp = head;
        do {
            if (temp.taskId == id)
                return temp;
            temp = temp.next;
        } while (temp != head);

        return null;
    }

    // 6. Count Total Tasks
    public int countTasks() {
        if (head == null) return 0;

        int count = 0;
        TaskNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();

        int choice;
        do {
            System.out.println("\n--- Task Scheduler Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Forward");
            System.out.println("4. Display Backward");
            System.out.println("5. Search Task");
            System.out.println("6. Count Tasks");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    list.addTask(id, name, pos);
                    break;

                case 2:
                    System.out.print("Enter Position to delete: ");
                    int dpos = sc.nextInt();
                    list.deleteTask(dpos);
                    break;

                case 3:
                    list.displayForward();
                    break;

                case 4:
                    list.displayBackward();
                    break;

                case 5:
                    System.out.print("Enter Task ID to search: ");
                    int sid = sc.nextInt();
                    TaskNode result = list.searchTask(sid);
                    if (result != null)
                        System.out.println("Found: " + result.taskId + " - " + result.taskName);
                    else
                        System.out.println("Task not found!");
                    break;

                case 6:
                    System.out.println("Total Tasks: " + list.countTasks());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}