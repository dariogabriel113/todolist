package com.dario.todoList.TodoList.repository;

import com.dario.todoList.TodoList.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
