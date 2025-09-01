package com.example.taskservice;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        service.addTask("1", "Write project setup");
        service.addTask("2", "Test the task service");

        System.out.println("All Tasks:");
        for (Task task : service.getAllTasks()) {
            System.out.println(task);
        }

        service.completeTask("1");
        System.out.println("\nAfter completing Task 1:");
        for (Task task : service.getAllTasks()) {
            System.out.println(task);
        }
    }
}
