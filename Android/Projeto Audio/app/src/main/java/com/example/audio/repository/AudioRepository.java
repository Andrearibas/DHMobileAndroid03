package com.example.audio.repository;

import com.example.audio.model.Artista;

import io.reactivex.Observable;

import static com.example.audio.data.remote.RetrofitService.getApiService;

public class AudioRepository {

    public Observable<Artista> getAlbum (String artista){
        return getApiService().getAllAlbumArtist(artista);
    }
}
