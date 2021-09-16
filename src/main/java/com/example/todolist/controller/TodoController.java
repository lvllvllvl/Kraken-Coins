package com.example.todolist.controller;


import com.example.todolist.model.TodoItem;
import com.example.todolist.repo.TodoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/todo")

public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }
// postmapping
    @PostMapping
    public TodoItem save(@NotNull @RequestBody TodoItem todoItem) {

        return todoRepo.save(todoItem);
    }

// update putmapping
    @PutMapping
    public TodoItem update(@NotNull @RequestBody TodoItem todoItem) {

        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        todoRepo.deleteById(id);
    }
}
