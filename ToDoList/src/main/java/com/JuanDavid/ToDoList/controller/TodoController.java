package com.JuanDavid.ToDoList.controller;

import com.JuanDavid.ToDoList.model.Task;
import com.JuanDavid.ToDoList.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired //instanciar el repositorio en la clase
    private TodoRepository todoRepository;

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }

    @PostMapping(value = "/saveTask")
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "saveTask";
    }

    @PutMapping(value="/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){

        Task updateTask = todoRepository.findById(id).get();
        updateTask.setTitle(task.getTitle());
        updateTask.setDescription(task.getDescription());
        todoRepository.save(updateTask);

        return "update Task";
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deletedTask = todoRepository.findById(id).get();
        todoRepository.delete(deletedTask);

        return "Delete task";
    }

}
