package org.backend.Classes;

import java.util.Date;

public class Music {
    private int id;
    private String nome;
    private String compositor;
    private String jogoRelacionado;
    private String generoMusical;
    private float duracao;
    private String urlAudio;
    private String capaUrl; // svg ou url decidir
    private Date dataLancamento;
    private int popularidade; //contagem de repetições

    public Music(int id, String nome, String compositor, String jogoRelacionado, String generoMusical, float duracao, String urlAudio, String capaUrl, Date dataLancamento) {
        this.id = id;
        this.nome = nome;
        this.compositor = compositor;
        this.jogoRelacionado = jogoRelacionado;
        this.generoMusical = generoMusical;
        this.duracao = duracao;
        this.urlAudio = urlAudio;
        this.capaUrl = capaUrl;
        this.dataLancamento = dataLancamento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCompositor() {
        return compositor;
    }

    public String getJogoRelacionado() {
        return jogoRelacionado;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public float getDuracao() {
        return duracao;
    }

    public String getUrlAudio() {
        return urlAudio;
    }

    public String getCapaUrl() {
        return capaUrl;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }
}
