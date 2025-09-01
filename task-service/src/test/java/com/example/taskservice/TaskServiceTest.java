package com.example.taskservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    void testAddAndGetTask() {
        TaskService service = new TaskService();
        service.addTask("1", "Test task");
        Task task = service.getTask("1");

        assertNotNull(task);
        assertEquals("Test task", task.getDescription());
        assertFalse(task.isCompleted());
    }

    @Test
    void testCompleteTask() {
        TaskService service = new TaskService();
        service.addTask("1", "Complete me");
        service.completeTask("1");

        assertTrue(service.getTask("1").isCompleted());
    }
}
