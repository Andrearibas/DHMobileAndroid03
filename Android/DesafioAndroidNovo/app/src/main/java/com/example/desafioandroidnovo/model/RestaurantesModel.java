package com.example.desafioandroidnovo.model;

import java.io.Serializable;
import java.util.List;

public class RestaurantesModel implements Serializable {
    private int imagemRestaurantes;
    private String nomeRestaurante;
    private String enderecoRestaurante;
    private String horarioRestaurante;
    private List<Prato> listaDePratos;

    public RestaurantesModel() {
    }

    public RestaurantesModel(int imagemRestaurantes, String nomeRestaurante, String enderecoRestaurante, String horarioRestaurante, List<Prato> listaDePratos) {
        this.imagemRestaurantes = imagemRestaurantes;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
        this.horarioRestaurante = horarioRestaurante;
        this.listaDePratos = listaDePratos;
    }

    public int getImagemRestaurantes() {
        return imagemRestaurantes;
    }

    public void setImagemRestaurantes(int imagemRestaurantes) {
        this.imagemRestaurantes = imagemRestaurantes;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEnderecoRestaurante() {
        return enderecoRestaurante;
    }

    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public String getHorarioRestaurante() {
        return horarioRestaurante;
    }

    public void setHorarioRestaurante(String horarioRestaurante) {
        this.horarioRestaurante = horarioRestaurante;
    }

    public List<Prato> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(List<Prato> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }
}
