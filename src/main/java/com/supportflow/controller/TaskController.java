package com.supportflow.controller;

import com.supportflow.entity.SupportTask;
import com.supportflow.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<SupportTask> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public SupportTask createTask(@RequestBody SupportTask task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public SupportTask updateTask(@PathVariable Long id, @RequestBody SupportTask taskDetails) {
        SupportTask task = taskRepository.findById(id).orElseThrow();
        task.setStatus(taskDetails.getStatus());
        task.setSolution(taskDetails.getSolution());
        task.setRemarks(taskDetails.getRemarks());
        return taskRepository.save(task);
    }
}
