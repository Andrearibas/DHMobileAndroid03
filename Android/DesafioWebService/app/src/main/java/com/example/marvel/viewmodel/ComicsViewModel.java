package com.example.marvel.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.marvel.data.remote.API;
import com.example.marvel.data.remote.RetrofitService;
import com.example.marvel.model.pojo.ComicResponse;
import com.example.marvel.model.pojo.Result;
import com.example.marvel.repository.MarvelRepository;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.example.marvel.util.Criptografia.md5;

public class ComicsViewModel extends AndroidViewModel {
    private MutableLiveData<List<Result>> listaMarvel = new MutableLiveData<>();
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private MarvelRepository repository = new MarvelRepository();
    public static final String PUBLIC_KEY​ = "6eb7e8896ec5850c52515a8a23ee97f0";
    public static final String PRIVATE_KEY = "0dd0c16fedb8a02985977eafca66b49f5e6a526f";

    String ts = Long.toString(System.currentTimeMillis()/1000);

    String hash =  md5(ts+PRIVATE_KEY+PUBLIC_KEY​);

    public ComicsViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Result>> getListaMarvel(){
        return this.listaMarvel;
    }

    public LiveData<Boolean> getLoading() {
        return this.loading;
    }

    public void getComics(){
        disposable.add(
                RetrofitService.getApiService().getComics("magazine","comic",true,"focDate",
                        ts, hash, PUBLIC_KEY​)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        loading.setValue(true);
                    }
                })
                .doOnTerminate(()-> loading.setValue(false))
                .subscribe(comicResponse -> comicResponse.getData().getResults(), throwable -> {
                    Log.i("LOG", "ERRO: " + throwable.getMessage());
                        })
        );

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }

}
