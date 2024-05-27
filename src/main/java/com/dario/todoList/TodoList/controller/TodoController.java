package com.dario.todoList.TodoList.controller;

import com.dario.todoList.TodoList.model.Todo;
import com.dario.todoList.TodoList.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    List<Todo> listar() {
        return todoService.listar();
    }

    @PostMapping
    List<Todo> criar(@RequestBody Todo todo) {
        return todoService.criar(todo);
    }

    @PutMapping
    List<Todo> editar(@RequestBody Todo todo) {
        return todoService.editar(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> apagar(@PathVariable("id") Long id) {
        return todoService.apagar(id);
    }
}
