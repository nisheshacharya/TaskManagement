package com.nishesh.taskManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private int priority;
    private boolean completed;

    public Task() {}

    public Task(String name, String description, int priority, boolean completed) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    // Getters and setters...
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    @Override
    public String toString() {
        String output = "ID:" + getId() +
                "Name:" +getName()+
                "Description:" +getDescription()+
                "Priority:" +getPriority()+
                "Completed:" +isCompleted();
        return output;
    }
}