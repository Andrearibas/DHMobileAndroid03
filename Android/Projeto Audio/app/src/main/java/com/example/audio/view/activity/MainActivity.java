package com.example.audio.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SearchView;

import com.example.audio.R;
import com.example.audio.model.Album;
import com.example.audio.view.adapter.RecyclerViewAdapter;
import com.example.audio.viewmodel.AudioViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Album> albuns = new ArrayList<>();
    private AudioViewModel viewModel;
    private ProgressBar progressBar;
    private RecyclerViewAdapter adapter;
    private SearchView searchView;
    private String bandaNome = "Musica";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);

        viewModel.getAllAlbuns(bandaNome);

        viewModel.getAllAlbum().observe(this,(List<Album> albuns)->{
            if (albuns != null && !albuns.isEmpty()){
                adapter.setUpdate(albuns);
            }else {
                Snackbar.make(searchView,"Album não encontrado", Snackbar.LENGTH_LONG);
                adapter.setUpdate(this.albuns);
            }
        });

        viewModel.isLoading.observe(this,(Boolean loading)->{
            if (loading){
                progressBar.setVisibility(View.VISIBLE);
            } else {
                progressBar.setVisibility(View.GONE);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                bandaNome = text;
                adapter.clear();
                viewModel.getAllAlbuns(bandaNome);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                if(text.length() > 3){
                    bandaNome = text;
                    adapter.clear();
                    viewModel.getAllAlbuns(bandaNome);
                }
                return false;
            }
        });
    }

    public void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        searchView = findViewById(R.id.searchView);
        adapter = new RecyclerViewAdapter(albuns);
        viewModel = ViewModelProviders.of(this).get(AudioViewModel.class);
        recyclerView.setAdapter(adapter);
    }
}
