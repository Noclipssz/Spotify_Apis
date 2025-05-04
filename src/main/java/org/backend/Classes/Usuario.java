package org.backend.Classes;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private ArrayList favoritos;
    private ArrayList historico;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void setHistorico(ArrayList historico) {
        this.historico = historico;
    }

    public void setFavoritos(ArrayList favoritos) {
        this.favoritos = favoritos;
    }
}
