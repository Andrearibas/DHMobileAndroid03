package com.example.projetofilmeretrofit.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.example.projetofilmeretrofit.R;
import com.example.projetofilmeretrofit.model.Filme;
import com.example.projetofilmeretrofit.view.adapter.MainAdapter;
import com.example.projetofilmeretrofit.viewmodel.FilmeViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private MainAdapter adapter;
    private List<Filme> listaFilmes = new ArrayList<>();
    private FilmeViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        viewModel.getAllFilmes("bde8033d3274c91b292a5293c6349052");

        viewModel.getListaFilme().observe(this, resultaLista ->{
           adapter.update(resultaLista);
        });

        viewModel.().observe(this, loading ->{
            if(loading)
        });
    }

    private void initViews(){
        recyclerView = findViewById(R.id.recyclerViewFilmes);
        progressBar = findViewById(R.id.progress_bar);
        adapter = new MainAdapter();
        viewModel = ViewModelProviders.of(this).get(FilmeViewModel.class);
    }
}
