package com.motheo.taskapi.repository;

import com.motheo.taskapi.model.Task;
import com.motheo.taskapi.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}