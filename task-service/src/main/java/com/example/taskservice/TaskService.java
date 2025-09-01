package com.example.taskservice;

import java.util.*;

public class TaskService {
    private final Map<String, Task> tasks = new HashMap<>();

    public void addTask(String id, String description) {
        tasks.put(id, new Task(id, description));
    }

    public Task getTask(String id) {
        return tasks.get(id);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public void completeTask(String id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.markComplete();
        }
    }
}
