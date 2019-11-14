package com.example.audio.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.audio.model.Album;
import com.example.audio.model.Artista;
import com.example.audio.repository.AudioRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class AudioViewModel extends AndroidViewModel {
    private MutableLiveData<List<Album>> albunsLiveData = new MutableLiveData<>();
    public MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private AudioRepository repository = new AudioRepository();


    public AudioViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Album>> getAllAlbum(){
        return this.albunsLiveData;
    }

    public void getAllAlbuns(String artista) {
        disposable.add(
                repository.getAlbum(artista)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe((Disposable disposable) -> {
                            isLoading.setValue(true);
                        })
                        .doOnTerminate(() -> isLoading.setValue(false))
                        .subscribe((Artista artistaResponse) -> {

                                    albunsLiveData.setValue(artistaResponse.getAlbum());

                                },
                                throwable -> {
                                    Log.i("LOG", "erro" + throwable.getMessage());
                                })
        );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }

}
