package com.example.viewpagertabviewapplication.views.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.viewpagertabviewapplication.R;
import com.example.viewpagertabviewapplication.adapter.FotoAdapter;
import com.example.viewpagertabviewapplication.model.Album;
import com.example.viewpagertabviewapplication.views.fragments.FotoFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Album> listaAlbum = new ArrayList<>();

        listaAlbum.add(new Album("Praia",
                FotoFragment.novaInstancia(R.drawable.praiaubatuba,"Ubutuba")));

        listaAlbum.add(new Album("Praia2",
                FotoFragment.novaInstancia(R.drawable.praiamaresia,"Maresia")));

        FotoAdapter adapter = new FotoAdapter(getSupportFragmentManager(), listaAlbum);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);

        viewPager.setOffscreenPageLimit(listaAlbum.size());

        tabLayout.setupWithViewPager(viewPager);
    }
}
