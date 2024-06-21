import java.util.ArrayList;
import java.util.Scanner;

// This is a simple, useless, ToDo list application.
// It is a simple console application that allows the user to add tasks, list tasks, mark tasks as completed, and remove tasks.
// The tasks are stored in an ArrayList of Task objects.
// And are LOST when the program is closed.
// The Task class is a simple class that represents a task with an ID, description, and completion status.

// The main method of the ToDoListApp class is the entry point of the application.

// You need to make this app useful by adding a backend storage mechanism to store tasks between sessions. (Session being a running of the program.)
// You can use a file, a database, or any other storage mechanism you prefer.
// You need to modify the application to load tasks from storage when it starts and save tasks to storage when it exits.
// You can use any serialization/deserialization mechanism you prefer.
// You can use any file format or database you prefer.

// You can also add more features to the application, such as editing tasks, sorting tasks, filtering tasks, etc.
// You can also improve the user interface by adding more options and better error handling.

public class ToDoListApp {
    private static ArrayList<Task> taskList = new ArrayList<>();
    private static int taskIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:
                    removeTask(scanner);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();
        Task task = new Task(taskIdCounter, description);
        taskList.add(task);
        taskIdCounter++;
        System.out.println("Task added successfully!");
    }

    private static void listTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }

    private static void markTaskAsCompleted(Scanner scanner) {
        System.out.print("Enter the task ID to mark as completed: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (Task task : taskList) {
            if (task.getId() == taskId) {
                task.setCompleted(true);
                System.out.println("Task marked as completed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    private static void removeTask(Scanner scanner) {
        System.out.print("Enter the task ID to remove: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (Task task : taskList) {
            if (task.getId() == taskId) {
                taskList.remove(task);
                System.out.println("Task removed.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}

class Task {
    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return id + ". [" + (completed ? "X" : " ") + "] " + description;
    }
}
