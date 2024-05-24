package com.dario.todoList.TodoList.service;

import com.dario.todoList.TodoList.model.Todo;
import com.dario.todoList.TodoList.repository.TodoRepository;

import java.util.List;

public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listar() {
        return todoRepository.findAll();
    }

    public List<Todo> criar(Todo todo) {
        todoRepository.save(todo);
        return listar();
    }

    public List<Todo> editar(Todo todo) {
        todoRepository.save(todo);
        return listar();
    }

    public List<Todo> apagar(Long id) {
        todoRepository.deleteById(id);
        return listar();
    }
}
