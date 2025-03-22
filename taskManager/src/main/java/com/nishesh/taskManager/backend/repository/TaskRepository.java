package com.nishesh.taskManager.backend.repository;

import com.nishesh.taskManager.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {


}
