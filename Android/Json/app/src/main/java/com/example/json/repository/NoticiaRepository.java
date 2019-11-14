package com.example.json.repository;

import android.content.Context;
import android.content.res.AssetManager;

import com.example.json.model.NoticiasResposta;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import io.reactivex.Observable;

public class NoticiaRepository {
    public Observable<NoticiasResposta> obterListaNoticias(Context context){

        try {
            AssetManager manager = context.getAssets();
            InputStream inputStream = manager.open("noticias.json");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            Gson gson = new Gson();

            NoticiasResposta resposta = gson.fromJson(reader, NoticiasResposta.class);

            return Observable.just(resposta);

        }catch (Exception ex){
            ex.printStackTrace();
            return Observable.error(ex.getCause());
        }
    }
}
