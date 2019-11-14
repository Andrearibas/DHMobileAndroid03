package com.example.marvel.repository;

import com.example.marvel.model.pojo.ComicResponse;
import com.example.marvel.model.pojo.Result;

import io.reactivex.Observable;

import static com.example.marvel.data.remote.RetrofitService.getApiService;

public class MarvelRepository {

    public Observable<ComicResponse> getMarvel(String format, String formatType, boolean noVariants,
                                               String orderBy, String ts, String hash, String apikey){
        return getApiService().getComics(format,formatType,noVariants,orderBy,ts,hash,apikey);
    }
}
