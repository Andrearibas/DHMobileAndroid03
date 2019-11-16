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

import io.reactivex.Observable;
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


    public ComicsViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Result>> getListaMarvel(){
        return this.listaMarvel;
    }

    public MutableLiveData<Boolean> loading() {
        return this.loading;
    }

    public void getComics(){
        disposable.add(
                repository.getMarvel()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe(disposable1 -> loading.setValue(true))
                        .doOnTerminate(() -> loading.setValue(false))
                        .flatMap(comicsResponse -> Observable.just(comicsResponse.getData().getResults()))
                        .subscribe(resultlist -> listaMarvel.setValue(resultlist),
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
