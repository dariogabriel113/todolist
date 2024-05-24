package com.dario.todoList.TodoList.service;

import com.dario.todoList.TodoList.model.Todo;
import com.dario.todoList.TodoList.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> listar() {
        Sort sort = Sort.by(Sort.Direction.ASC, "isFinalizado");
        return todoRepository.findAll(sort);
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
