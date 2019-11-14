package com.example.desafioandroidnovo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.desafioandroidnovo.R;
import com.example.desafioandroidnovo.model.Prato;
import com.example.desafioandroidnovo.model.RestaurantesModel;

import java.util.List;

public class CardapioRestauranteActivity extends AppCompatActivity {

    RestaurantesModel restaurantesModel;
    TextView textViewNomeRestaurante;
    List<Prato> pratos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio_restaurante);

        textViewNomeRestaurante = findViewById(R.id.nomeRestaurante);

        getBundle(getIntent());
    }

    private void getBundle(Intent intent) {
        if (intent != null) {
            restaurantesModel = (RestaurantesModel) intent.getSerializableExtra("restaurante");
            pratos = restaurantesModel.getListaDePratos();

            popularView();
        }
    }

    private void popularView() {
        textViewNomeRestaurante.setText(restaurantesModel.getNomeRestaurante());
    }
}
