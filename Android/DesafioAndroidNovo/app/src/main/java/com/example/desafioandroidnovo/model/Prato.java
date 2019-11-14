package com.example.desafioandroidnovo.model;

import java.io.Serializable;

public class Prato implements Serializable {

    private int imagemPrato;
    private String nomePrato;
    private String descPrato;

    public Prato() {
    }

    public Prato(int imagemPrato, String nomePrato, String descPrato) {
        this.imagemPrato = imagemPrato;
        this.nomePrato = nomePrato;
        this.descPrato = descPrato;
    }

    public int getImagemPrato() {
        return imagemPrato;
    }

    public void setImagemPrato(int imagemPrato) {
        this.imagemPrato = imagemPrato;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescPrato() {
        return descPrato;
    }

    public void setDescPrato(String descPrato) {
        this.descPrato = descPrato;
    }
}
