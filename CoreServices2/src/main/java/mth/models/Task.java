package mth.models;

import jakarta.persistence.*;

@Entity
@Table(name = "task_master")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String todo;
    boolean completed;
    int userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
 
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}