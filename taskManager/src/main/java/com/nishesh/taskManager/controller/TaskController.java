package com.nishesh.taskManager.controller;

import com.nishesh.taskManager.model.Task;
import com.nishesh.taskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
   private TaskRepository taskRepository;

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @GetMapping
    public List<Task> getAllTasks(){
    return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable Long id){
        System.out.println("Task ID: " + id);
        return taskRepository.findById(id);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        System.out.println(task);
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task){
         task.setId(id);
         return taskRepository.save(task);
    }

}
