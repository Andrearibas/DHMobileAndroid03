package com.example.audio.data.remote;

import com.example.audio.model.Artista;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("searchalbum.php")
    Observable<Artista> getAllAlbumArtist(
            @Query("s") String artista);

}
