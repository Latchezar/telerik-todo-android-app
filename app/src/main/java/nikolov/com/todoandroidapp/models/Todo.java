package nikolov.com.todoandroidapp.models;

public class Todo {
    public String name;
    public String endDate;
    public Priority priority;
    public Status status;

    public Todo(){

    }

    public Todo(String name, String endDate, Priority priority, Status status){
        this.name = name;
        this.endDate = endDate;
        this.priority = priority;
        this.status = status;
    }
}
