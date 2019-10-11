package com.example.digitalhousefoods.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.adapter.PratosAdapter;
import com.example.digitalhousefoods.model.Pratos;
import com.example.digitalhousefoods.model.Restaurante;

import static com.example.digitalhousefoods.views.HomeActivity.RESTAURANTE_KEY;

public class DetalhePratoActivity extends AppCompatActivity {
    private static final String PRATO_KEY = "prato";
    private ImageView imagemViewPratos;
    private TextView nomeDetalhe;
    private TextView informacaoDetalhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_prato);

        Intent intent = getIntent();
        Restaurante restaurante = intent.getParcelableExtra(PRATO_KEY);

        if (getIntent() != null) {
            Pratos detalhePratos = getIntent().getExtras().getParcelable(PRATO_KEY);
            initViews();

            nomeDetalhe.setText(detalhePratos.getNomePrato());
            informacaoDetalhe.setText(detalhePratos.getDescPrato());


        }




    }

    public void initViews(){
        imagemViewPratos = findViewById(R.id.imageViewDetalhePrato);
        nomeDetalhe = findViewById(R.id.nomedetalheprato);
        informacaoDetalhe = findViewById(R.id.informacaodetalheprato);
    }
}
