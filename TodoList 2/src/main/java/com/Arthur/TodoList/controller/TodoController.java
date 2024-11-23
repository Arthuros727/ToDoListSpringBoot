package com.Arthur.TodoList.controller;

import com.Arthur.TodoList.model.Todoitem;
import com.Arthur.TodoList.repo.TodoRepo;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;
    @GetMapping
    public List<Todoitem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public Todoitem save(@Validated @NotNull @RequestBody Todoitem todoitem){
        return todoRepo.save(todoitem);
    }
}
