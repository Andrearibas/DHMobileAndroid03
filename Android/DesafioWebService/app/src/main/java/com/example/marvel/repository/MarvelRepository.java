package com.example.marvel.repository;

import com.example.marvel.data.remote.RetrofitService;
import com.example.marvel.model.pojo.ComicResponse;

import io.reactivex.Observable;

import static com.example.marvel.data.remote.RetrofitService.getApiService;
import static javax.crypto.Cipher.PUBLIC_KEY;

public class MarvelRepository {

    public Observable<ComicResponse> getMarvel (){
        return getApiService().getComics("magazine", "comic", true, RetrofitService.getTimeStamp(), RetrofitService.getHash(), PUBLIC_KEY);
    }
}
