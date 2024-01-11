package com.JuanDavid.ToDoList.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table( name = "todolist")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremental y id único
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name="description")
    private String description;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
