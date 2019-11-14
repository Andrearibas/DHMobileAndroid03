package com.example.marvel.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Result;
import com.example.marvel.view.adapter.RecyclerViewMavelAdapter;
import com.example.marvel.viewmodel.ComicsViewModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private RecyclerViewMavelAdapter adapter;
    private List<Result> listaMarvel = new ArrayList<>();
    private ComicsViewModel viewModel;

    // //Atributo para armazenar a o valor da pagina atual
    private int pagina = 1;
   // public static final String API_KEY = "6eb7e8896ec5850c52515a8a23ee97f0";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);

    }
}
