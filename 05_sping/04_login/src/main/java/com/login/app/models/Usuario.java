package com.login.app.models;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; // Corrigido: GenerationType
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIO") // Recomendado para organizar o banco de dados
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY é o mais comum para IDs autoincremento
    private long idUsuario;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true) // E-mail geralmente não pode se repetir
    private String email;

    @Column(nullable = false)
    private String senha;

    // --- Getters e Setters ---
    // Necessários para que o Spring e o Hibernate consigam manipular os dados

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}