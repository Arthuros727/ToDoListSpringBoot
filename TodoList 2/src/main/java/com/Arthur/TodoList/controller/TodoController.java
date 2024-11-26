package com.Arthur.TodoList.controller;

import com.Arthur.TodoList.model.Todoitem;
import com.Arthur.TodoList.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<Todoitem> findAll() {
        return todoRepo.findAll();
    }

    @GetMapping("/done")
    public List<Todoitem> findDone() {
        return todoRepo.findByDoneTrue();
    }

    @PostMapping
    public Todoitem save(@RequestBody Todoitem todoitem) {
        if (todoitem.getVersion() == null) {
            todoitem.setVersion(1L);
        }

        return todoRepo.save(todoitem);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Todoitem> edit(@PathVariable Long id, @RequestBody Todoitem newTodoitem) {
        Todoitem item = todoRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("id : " + id + ", est pas trouvé"));

        item.setTitle(newTodoitem.getTitle());
        item.setDone(newTodoitem.isDone());
        if (item.getVersion() == null) {
            item.setVersion(1L);
        }else {
            item.setVersion(item.getVersion() + 1);
        }

        Todoitem updatedTodoitem = todoRepo.save(item);

        return ResponseEntity.ok(updatedTodoitem);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (todoRepo.existsById(id)) {
            todoRepo.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
