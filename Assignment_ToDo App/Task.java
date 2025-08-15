import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task
 {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String priority;
    private boolean completed; 

    public Task(String title, String description, LocalDate dueDate, String priority)
    {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.completed = false;
    }

    // Getters & Setters
    public String getTitle() 
    { 
        return title; 
    }
    public void setTitle(String title) 
    {
         this.title = title; 
    }

    public String getDescription() 
    {
         return description; 
    }
    public void setDescription(String description) 
    {
         this.description = description; 
    }

    public LocalDate getDueDate() 
    
{
     return dueDate; 
}
    public void setDueDate(LocalDate dueDate) 
    { 
    this.dueDate = dueDate; 
    }

    public String getPriority() 
    { 
        return priority; 
    }
    public void setPriority(String priority) 
    {
         this.priority = priority; 
    }

    public boolean isCompleted() 
    { 
        return completed; 
    }
    public void setCompleted(boolean completed) 
    {
         this.completed = completed; 
    }

    @Override
    public String toString() 
    {
        return (completed ? "[Completed ]" : "[Pending ]") + " " + title +
               " | Due: " + dueDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) +
               " | Priority: " + priority +
               " | " + description;
    }

    public String toFileString() 
    {
        return title + ";" + description + ";" + dueDate + ";" + priority + ";" + completed;
    }

    public static Task fromFileString(String line) 
    {
        String[] parts = line.split(";");
        Task task = new Task(parts[0], parts[1], LocalDate.parse(parts[2]), parts[3]);
        task.setCompleted(Boolean.parseBoolean(parts[4]));
        return task;
    }
}
