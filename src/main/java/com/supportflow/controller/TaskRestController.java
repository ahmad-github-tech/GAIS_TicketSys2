package com.supportflow.controller;

import com.supportflow.model.SupportTask;
import com.supportflow.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskRestController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<SupportTask> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public SupportTask createTask(@RequestBody SupportTask task) {
        return taskService.saveTask(task);
    }

    @PutMapping("/{id}")
    public SupportTask updateTask(@PathVariable Long id, @RequestBody SupportTask task) {
        task.setId(id);
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
