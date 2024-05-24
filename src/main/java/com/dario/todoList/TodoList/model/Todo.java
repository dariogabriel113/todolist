package com.dario.todoList.TodoList.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    private String titulo;
    private String descricao;
    private boolean isFinalizado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return isFinalizado;
    }

    public void setFinalizado(boolean finalizado) {
        isFinalizado = finalizado;
    }
}
