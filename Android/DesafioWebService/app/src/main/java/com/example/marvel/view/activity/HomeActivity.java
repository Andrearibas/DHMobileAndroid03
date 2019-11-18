package com.example.marvel.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Result;
import com.example.marvel.view.adapter.RecyclerViewMavelAdapter;
import com.example.marvel.view.interfacee.OnClick;
import com.example.marvel.viewmodel.ComicsViewModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements OnClick {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private RecyclerViewMavelAdapter adapter;
    private List<Result> resultList = new ArrayList<>();
    private ComicsViewModel viewModel;

    public static final String RESULT_KEY = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        viewModel.getComics();

        viewModel.getListaMarvel().observe(this,results -> {
            adapter.atualizalista(results);
        });

        viewModel.loading().observe(this, loading -> {
            if (loading){
                progressBar.setVisibility(View.VISIBLE);
            } else {
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progressBar);
        adapter = new RecyclerViewMavelAdapter(resultList,this);
        viewModel = ViewModelProviders.of(this).get(ComicsViewModel.class);

    }

    @Override
    public void OnClick(Result result) {
        Intent intent = new Intent(this, DetalheActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, result);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
