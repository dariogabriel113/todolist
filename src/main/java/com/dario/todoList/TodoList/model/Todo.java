package com.dario.todoList.TodoList.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;
    private boolean isFinalizado;

    public Todo() {

    }

    public Todo(Long id, @NotBlank String titulo, @NotBlank String descricao, boolean isFinalizado) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.isFinalizado = isFinalizado;
    }

    public Todo(String titulo, String descricao, boolean isFinalizado) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.isFinalizado = isFinalizado;
    }

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
