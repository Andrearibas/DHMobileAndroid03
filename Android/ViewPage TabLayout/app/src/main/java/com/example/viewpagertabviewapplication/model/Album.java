package com.example.viewpagertabviewapplication.model;

import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class Album {
    private ImageView imageView;
    private String nome;
    private Fragment fragment;

    public Album(String praia, Fragment ubutuba) {
        this.nome = praia;
        this.fragment = ubutuba;
    }

    public Album(ImageView imageView, Fragment fragment) {
        this.imageView = imageView;
        this.fragment = fragment;
    }

    public Album(ImageView imageView, String nome, Fragment fragment) {
        this.imageView = imageView;
        this.nome = nome;
        this.fragment = fragment;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
