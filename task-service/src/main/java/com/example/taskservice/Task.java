package com.example.taskservice;

public class Task {
    private String id;
    private String description;
    private boolean completed;

    public Task(String id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return completed; }

    public void markComplete() { this.completed = true; }

    @Override
    public String toString() {
        return String.format("Task{id='%s', desc='%s', completed=%s}", id, description, completed);
    }
}
