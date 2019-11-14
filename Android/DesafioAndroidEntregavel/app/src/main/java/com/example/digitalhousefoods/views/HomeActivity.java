package com.example.digitalhousefoods.views;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.adapter.HomeAdapter;
import com.example.digitalhousefoods.interfaces.RecyclerViewOnClick;
import com.example.digitalhousefoods.model.Pratos;
import com.example.digitalhousefoods.model.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements RecyclerViewOnClick {
    public static final String RESTAURANTE_KEY = "restaurante";
    private HomeAdapter homeAdapter;
    private RecyclerView recyclerView;
    private List<Restaurante> listaDeRestaurantes = new ArrayList<>();
    private List<Pratos> listaDePratos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recyclerViewRestaurantes);

        homeAdapter = new HomeAdapter(getRestaurantes(),this);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setLayoutManager(layoutManager);


      //  popularRecyclerRestaurantes();
    }

    private void popularRecyclerRestaurantes() {
        HomeAdapter homeAdapter = new HomeAdapter(getRestaurantes(),this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(homeAdapter);

        recyclerView.setLayoutManager(layoutManager);
    }

    private List<Restaurante> getRestaurantes() {
        List<Restaurante> restaurantes = new ArrayList<Restaurante>();
        restaurantes.add(new Restaurante(R.drawable.restautante01tony,"Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo","Fecha às 22:00",getPratos()));
        restaurantes.add(new Restaurante(R.drawable.restautante02aoyama,"Aoyama - Moema", "Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00", getPratos()));
        restaurantes.add(new Restaurante(R.drawable.restautante03outback,"Outback - Moema","Av. Moaci, 187, 187 - Moema, São Paulo","Fecha às 00:00",getPratos()));
        restaurantes.add(new Restaurante(R.drawable.restautante04sisenor,"Sí Señor!","Alameda Jauaperi, 626 - Moema","Fecha às 01:00",getPratos()));

        return restaurantes;
    }

    private List<Pratos> getPratos() {
        List<Pratos> listaDePratos = new ArrayList<>();
        listaDePratos.add(new Pratos(R.drawable.imagemdoprato, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."));
        listaDePratos.add(new Pratos(R.drawable.imagemdoprato, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."));
        listaDePratos.add(new Pratos(R.drawable.imagemdoprato, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."));
        listaDePratos.add(new Pratos(R.drawable.imagemdoprato, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."));
        return listaDePratos;
    }

    @Override
    public void onClick(Restaurante restaurantes) {
        Intent intent = new Intent(HomeActivity.this, CardapioActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESTAURANTE_KEY, restaurantes);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
