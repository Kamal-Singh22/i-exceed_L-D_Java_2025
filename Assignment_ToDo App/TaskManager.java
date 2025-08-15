import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class  TaskManager
{
    private static final String FILE_NAME = "tasks.txt";
    private List<Task> tasks = new ArrayList<>();

    // Add task
    public void addTask(Task task) 
    {
        tasks.add(task);
    }

    // View tasks
    public void viewTasks() 
    {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++)
         {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Mark task completed
    public void markCompleted(int index)
     {
        if (index >= 0 && index < tasks.size()) 
        {
            tasks.get(index).setCompleted(true);
            System.out.println("Task marked as completed.");
        } else
         {
            System.out.println("Invalid task number.");
        }
    }

    // Delete task
    public void deleteTask(int index) 
    {
        if (index >= 0 && index < tasks.size()) 
        {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            
            System.out.println("Invalid task number.");
        }
    }

    // Edit existing task
    public void editTask(int index, String title, String desc, LocalDate dueDate, String priority) 
    {
        if (index >= 0 && index < tasks.size()) 
        {
            Task task = tasks.get(index);
            task.setTitle(title);
            task.setDescription(desc);
            task.setDueDate(dueDate);
            task.setPriority(priority);
            System.out.println("Task updated successfully.");
        } else 
        {
            System.out.println("Invalid task number.");
        }
    }

    // Sort tasks by due date
    public void sortByDueDate() 
    {
        tasks.sort(Comparator.comparing(Task::getDueDate));
        System.out.println("Tasks sorted by due date.");
    }

    // Sort tasks by priority (High → Medium → Low)
    public void sortByPriority() 
    {
        Map<String, Integer> priorityMap = Map.of("High", 1, "Medium", 2, "Low", 3);
        tasks.sort(Comparator.comparingInt(t -> priorityMap.getOrDefault(t.getPriority(), 4)));
        System.out.println("Tasks sorted by priority.");
    }

    // Save tasks to file
   public void saveTasks() {
    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(FILE_NAME))) {
        for (Task task : tasks) {
            String line = task.toFileString() + System.lineSeparator();
            bos.write(line.getBytes()); // Convert string to bytes
        }
        System.out.println("Tasks saved successfully.");
    } catch (IOException e) {
        System.out.println("Error saving tasks: " + e.getMessage());
    }
}


    // Load tasks from file
    public void loadTasks() 
    {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner fileScanner = new Scanner(file)) 
        {
            while (fileScanner.hasNextLine()) 
            {
                tasks.add(Task.fromFileString(fileScanner.nextLine()));
            }
        } catch (IOException e) 
        {
            System.out.println("Error loading tasks: " + e.getMessage());
        }
    }
}


