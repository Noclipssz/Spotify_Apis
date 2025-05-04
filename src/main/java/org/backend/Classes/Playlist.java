package org.backend.Classes;

import java.util.ArrayList;
import java.util.Date;

public class Playlist {
    private int id;
    private String nome;
    private Usuario usuario;
    private ArrayList musicas;
    private boolean privada;
    private Date criadaEm;

    public Playlist(int id, String nome, Usuario usuario, ArrayList musicas, boolean privada, Date criadaEm) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.musicas = musicas;
        this.privada = privada;
        this.criadaEm = criadaEm;
    }
}
