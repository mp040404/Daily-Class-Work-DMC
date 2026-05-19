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

class DoublyLinearLinkedList {
    private TaskNode head = null;

    // 1. Add Task at Position
    public void addTask(int id, String name, int pos) {
        TaskNode newNode = new TaskNode(id, name);

        if (head == null) {
            head = newNode;
            return;
        }

        int size = countTasks();
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid Position!");
            return;
        }

        if (pos == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            TaskNode temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null)
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

        if (pos == 1) {
            head = head.next;
            if (head != null)
                head.prev = null;
        } else {
            TaskNode temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }

            if (temp.next != null)
                temp.next.prev = temp.prev;

            temp.prev.next = temp.next;
        }
    }

    // 3. Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        TaskNode temp = head;
        while (temp != null) {
            System.out.println(temp.taskId + " - " + temp.taskName);
            temp = temp.next;
        }
    }

    // 4. Display Backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        TaskNode temp = head;

        // go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.println(temp.taskId + " - " + temp.taskName);
            temp = temp.prev;
        }
    }

    // 5. Search Task
    public TaskNode searchTask(int id) {
        TaskNode temp = head;

        while (temp != null) {
            if (temp.taskId == id)
                return temp;
            temp = temp.next;
        }

        return null;
    }

    // 6. Count Tasks
    public int countTasks() {
        int count = 0;
        TaskNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}

public class TaskSchedulerDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinearLinkedList list = new DoublyLinearLinkedList();

        int choice;
        do {
            System.out.println("\n--- Doubly Linear Task Scheduler ---");
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
