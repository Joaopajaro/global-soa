package com.example.mentia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mentorias")
public class Mentoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    public Mentoria() {}

    public Mentoria(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
