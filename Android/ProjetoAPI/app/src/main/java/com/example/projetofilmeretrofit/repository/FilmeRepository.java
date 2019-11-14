package com.example.projetofilmeretrofit.repository;

import com.example.projetofilmeretrofit.model.FilmeResult;

import io.reactivex.Observable;

import static com.example.projetofilmeretrofit.data.remote.RetrofitService.getApiService;

public class FilmeRepository {
    public Observable<FilmeResult> getFilmes (String apiKey){
        return getApiService().getAllFilmes(apiKey);
    }

}
