package com.example.digitalhousefoods.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Restaurante implements Parcelable {
    private int Imagen;
    private String nome;
    private String endereco;
    private String horarioFuncionamento;
    private List<Pratos> listaDePratos;

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public List<Pratos> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(List<Pratos> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

    public Restaurante(int imagen, String nome, String endereco, String horarioFuncionamento, List<Pratos> listaDePratos) {
        Imagen = imagen;
        this.nome = nome;
        this.endereco = endereco;
        this.horarioFuncionamento = horarioFuncionamento;
        this.listaDePratos = listaDePratos;
    }

    public Restaurante() {
    }

    protected Restaurante(Parcel in) {
        Imagen = in.readInt();
        nome = in.readString();
        endereco = in.readString();
        horarioFuncionamento = in.readString();
        listaDePratos = new ArrayList<>();
        in.readList(listaDePratos, Pratos.class.getClassLoader());
    }

    public static final Creator<Restaurante> CREATOR = new Creator<Restaurante>() {
        @Override
        public Restaurante createFromParcel(Parcel in) {
            return new Restaurante(in);
        }

        @Override
        public Restaurante[] newArray(int size) {
            return new Restaurante[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(Imagen);
        parcel.writeString(nome);
        parcel.writeString(endereco);
        parcel.writeString(horarioFuncionamento);
        parcel.writeList(listaDePratos);
    }
}
