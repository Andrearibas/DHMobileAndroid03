package com.example.desafioandroidnovo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafioandroidnovo.R;
import com.example.desafioandroidnovo.RecyclerItemClickListener;
import com.example.desafioandroidnovo.adapter.RestaurantesAdapter;
import com.example.desafioandroidnovo.model.Prato;
import com.example.desafioandroidnovo.model.RestaurantesModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<RestaurantesModel> listaDeRestaurantes = new ArrayList<>();
    private List<Prato> listaDePratos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();

        //Configurando a Lista
        this.populandoRestaurantes();

        //Configurando o Adapter
        RestaurantesAdapter restaurantesAdapter = new RestaurantesAdapter(listaDeRestaurantes);


        //Configurando o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        RestaurantesModel restaurantesModel = listaDeRestaurantes.get(position);
                        Intent intent = new Intent(HomeActivity.this, CardapioRestauranteActivity.class);
                        intent.putExtra("restaurante", restaurantesModel);
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {

                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    }
                }
                )
        );
        recyclerView.setAdapter(restaurantesAdapter);

    }

    public void populandoRestaurantes(){
        RestaurantesModel restaurantesModel = new RestaurantesModel(R.drawable.restautante01tony,"Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo","Fecha às 22:00",populandoPratos());
        listaDeRestaurantes.add(restaurantesModel);

        RestaurantesModel restaurantesModel2 = new RestaurantesModel(R.drawable.restautante02aoyama,"Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", populandoPratos());
        listaDeRestaurantes.add(restaurantesModel2);

        RestaurantesModel restaurantesModel3 = new RestaurantesModel(R.drawable.restautante03outback,"Outback - Moema","Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 00:00",populandoPratos());
        listaDeRestaurantes.add(restaurantesModel3);

        RestaurantesModel restaurantesModel4 = new RestaurantesModel(R.drawable.restautante04sisenor,"Sí Señor!","Alameda Jauaperi, 626 - Moema","Fecha às 01:00",populandoPratos());
        listaDeRestaurantes.add(restaurantesModel4);
    }

    public List<Prato> populandoPratos(){
        Prato prato1 = new Prato(R.drawable.imagemdoprato,"Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.");
        listaDePratos.add(prato1);

        Prato prato2 = new Prato(R.drawable.imagemdoprato,"Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.");
        listaDePratos.add(prato2);

        Prato prato3 = new Prato(R.drawable.imagemdoprato,"Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.");
        listaDePratos.add(prato3);

        Prato prato4 = new Prato(R.drawable.imagemdoprato,"Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.");
        listaDePratos.add(prato4);

        return listaDePratos;
    }

    public void initView(){
        recyclerView = findViewById(R.id.recyclerViewRestaurantes);
    }
}
