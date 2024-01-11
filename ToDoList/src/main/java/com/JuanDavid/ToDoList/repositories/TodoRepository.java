package com.JuanDavid.ToDoList.repositories;

import com.JuanDavid.ToDoList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
