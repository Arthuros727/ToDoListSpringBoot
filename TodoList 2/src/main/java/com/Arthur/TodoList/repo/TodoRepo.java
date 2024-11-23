package com.Arthur.TodoList.repo;

import com.Arthur.TodoList.model.Todoitem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todoitem, Long> {
}
