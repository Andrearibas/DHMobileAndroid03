package com.example.digitalhousefoods.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.adapter.PratosAdapter;
import com.example.digitalhousefoods.interfaces.RecyclerPratosViewOnClick;
import com.example.digitalhousefoods.interfaces.RecyclerViewOnClick;
import com.example.digitalhousefoods.model.Pratos;
import com.example.digitalhousefoods.model.Restaurante;

import java.util.ArrayList;
import java.util.List;

import static com.example.digitalhousefoods.views.HomeActivity.RESTAURANTE_KEY;

public class CardapioActivity extends AppCompatActivity implements RecyclerPratosViewOnClick {
    private static final String PRATO_KEY = "prato";
    private ImageView imagemViewRestaurante;
    private TextView txtNomeRestaurante;
    private List<Pratos> listaDePratos = new ArrayList<>();
    private RecyclerView recyclerViewPratos;
    private PratosAdapter pratosAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
        initView();

        Intent intent = getIntent();
        Restaurante restaurante = intent.getParcelableExtra(RESTAURANTE_KEY);


        if (getIntent() != null) {
            Restaurante restaurantes = getIntent().getExtras().getParcelable(RESTAURANTE_KEY);
            Drawable drawable = getResources().getDrawable(restaurantes.getImagen());
            imagemViewRestaurante.setImageDrawable(drawable);
            txtNomeRestaurante.setText(restaurantes.getNome());

            listaDePratos = restaurantes.getListaDePratos();

            pratosAdapter = new PratosAdapter(listaDePratos);

            LinearLayoutManager linearLayout = new LinearLayoutManager(this);
            recyclerViewPratos.setAdapter(pratosAdapter);
            recyclerViewPratos.setLayoutManager(linearLayout);

        }

    }



    private void initView() {
        imagemViewRestaurante = findViewById(R.id.imageViewCardapio);
        txtNomeRestaurante = findViewById(R.id.txtNomeRestaurante);
        recyclerViewPratos = findViewById(R.id.recyclerViewCardapio);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(Pratos pratos) {

        Intent intent = new Intent(this, DetalhePratoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(PRATO_KEY, pratos);
        intent.putExtras(bundle);

        startActivity(intent);

    }
}
