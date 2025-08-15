import java.time.LocalDate;
import java.util.Scanner;

public class TodoApp {
    private TaskManager taskManager;
    private Scanner sc;

    public TodoApp() 
    {
        taskManager = new TaskManager();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) 
    {
        TodoApp app = new TodoApp();
        app.taskManager.loadTasks();
        app.run();
    }

    private void run() 
    {
        while (true) {
            showMenu();
            int choice = getInt("Choose an option: ");
            switch (choice) 
            {
                case 1 -> addTask();
                case 2 -> taskManager.viewTasks();
                case 3 -> markTaskCompleted();
                case 4 -> deleteTask();
                case 5 -> editTask(); 
                case 6 -> sortTasks();
                case 7 -> taskManager.saveTasks();
                case 0 -> { taskManager.saveTasks(); System.out.println("Exit");
                 return; 
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void showMenu() 
    {
        System.out.println("\n=== To-Do List ===");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Mark Task Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Edit Task");
        System.out.println("6. Sort Tasks");
        System.out.println("7. Save Tasks");
        System.out.println("0. Exit");
    }

    private void addTask() 
    {
        System.out.print("Title: ");
        String title = sc.nextLine();
        if (title.isEmpty()) {
            System.out.println("Title cannot be empty.");
            return;
        }

        System.out.print("Provide the Description: ");
        String desc = sc.nextLine();
        LocalDate dueDate = readDate("Due date (yyyy-MM-dd): ");
        System.out.print("Select The Priority (High/Medium/Low): ");
        String priority = sc.nextLine();

        taskManager.addTask(new Task(title, desc, dueDate, priority));
        System.out.println("Task added successfully.");
    }

    private void markTaskCompleted() 
    {
        taskManager.viewTasks();
        int index = getInt("Enter task number to mark completed: ") - 1;
        taskManager.markCompleted(index);
    }

    private void deleteTask() 
    {
        taskManager.viewTasks();
        int index = getInt("Enter task number to delete: ") - 1;
        taskManager.deleteTask(index);
    }

    // Edit task feature
    private void editTask() 
    {
        taskManager.viewTasks();
        int index = getInt("Enter task number to edit: ") - 1;

        System.out.print("New Title: ");
        String title = sc.nextLine();
        System.out.print("New Description: ");
        String desc = sc.nextLine();
        LocalDate dueDate = readDate("New Due date (yyyy-MM-dd): ");
        System.out.print("New Priority (High/Medium/Low): ");
        String priority = sc.nextLine();

        taskManager.editTask(index, title, desc, dueDate, priority);
    }

    // Sort tasks feature
    private void sortTasks() 
    {
        System.out.println("1. Sort by Due Date");
        System.out.println("2. Sort by Priority");
        int choice = getInt("Choose sorting option: ");
        if (choice == 1) {
            taskManager.sortByDueDate();
        } else if (choice == 2) {
            taskManager.sortByPriority();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private int getInt(String prompt) 
    {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid number.");
            }
        }
    }

    private LocalDate readDate(String prompt) 
    {
        while (true) {
            try {
                System.out.print(prompt);
                return LocalDate.parse(sc.nextLine());
            } catch (Exception e) 
            {
                System.out.println("Invalid date format. Use yyyy-MM-dd.");
            }
        }
    }
}
