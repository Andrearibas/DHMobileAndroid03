package com.example.exerciciopraiafragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMaresia;
    private Button btnUbatuba;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        btnMaresia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new PraiaMaresia());

            }
        });

        btnUbatuba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recarregaFragment(new PraiaUbatuba());

            }
        });


        }
       public void recarregaFragment(Fragment fragment){
           FragmentManager manager = getSupportFragmentManager();
           FragmentTransaction transaction = manager.beginTransaction();
           transaction.replace(R.id.container, fragment);
           transaction.commit();

    }

    public void initView(){
        btnMaresia = findViewById(R.id.btnMaresias);
        btnUbatuba = findViewById(R.id.btnUbatuba);
    }
}
