package com.motheo.taskapi.repository;

import com.motheo.taskapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}