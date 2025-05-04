package org.backend.Classes;

import java.util.Date;

public class Jogo {
    private int id;
    private String nome;
    private String desenvolvedora;
    private String generoJogo;
    private Date anoLancamento; // provavelmente colocarei ano/mes
    private String capaurl;
    private String plataformas;

    public Jogo(int id, String nome, String desenvolvedora, String generoJogo, Date anoLancamento, String capaurl) {
        this.id = id;
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
        this.generoJogo = generoJogo;
        this.anoLancamento = anoLancamento;
        this.capaurl = capaurl;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public String getGeneroJogo() {
        return generoJogo;
    }

    public Date getAnoLancamento() {
        return anoLancamento;
    }

    public String getCapaurl() {
        return capaurl;
    }

    public String getPlataformas() {
        return plataformas;
    }
}
