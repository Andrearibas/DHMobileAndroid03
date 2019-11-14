package com.example.desafioandroidnovo.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafioandroidnovo.Interface.RecyclerViewOnClick;
import com.example.desafioandroidnovo.R;
import com.example.desafioandroidnovo.model.RestaurantesModel;

import java.util.List;

public class RestaurantesAdapter extends RecyclerView.Adapter<RestaurantesAdapter.MyViewHolder> {
    private List<RestaurantesModel> listaDeRestaurantes;

    public RestaurantesAdapter(List<RestaurantesModel> listaDeRestaurantes) {
        this.listaDeRestaurantes = listaDeRestaurantes;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemViewRestaurantes = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_restaurantes,parent,false);

        return new MyViewHolder(itemViewRestaurantes);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final RestaurantesModel restaurantesModel = listaDeRestaurantes.get(position);

        holder.bind(restaurantesModel);

    }

    @Override
    public int getItemCount() {
        return listaDeRestaurantes.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imagemRestaurante;
        TextView nomeRestaurante;
        TextView enderecoRestaurante;
        TextView horarioRestaurante;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemRestaurante = itemView.findViewById(R.id.imagemViewRestaurante);
            nomeRestaurante = itemView.findViewById(R.id.txtNomeRestaurante);
            enderecoRestaurante = itemView.findViewById(R.id.txtEnderecoRestaurante);
            horarioRestaurante = itemView.findViewById(R.id.txtHorario);
        }

        public void bind(RestaurantesModel restaurantes) {
            Drawable drawable = itemView.getResources().getDrawable(restaurantes.getImagemRestaurantes());
            imagemRestaurante.setImageDrawable(drawable);
            nomeRestaurante.setText(restaurantes.getNomeRestaurante());
            enderecoRestaurante.setText(restaurantes.getEnderecoRestaurante());
            horarioRestaurante.setText(restaurantes.getHorarioRestaurante());
        }
    }
}
