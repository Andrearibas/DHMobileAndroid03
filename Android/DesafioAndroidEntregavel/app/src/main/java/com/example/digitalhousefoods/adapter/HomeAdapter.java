package com.example.digitalhousefoods.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.interfaces.RecyclerViewOnClick;
import com.example.digitalhousefoods.model.Restaurante;


import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private List<Restaurante> restaurantes;
    private RecyclerViewOnClick listener;

    public HomeAdapter(List<Restaurante> restaurantes, RecyclerViewOnClick listener) {
        this.restaurantes = restaurantes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_restaurante, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Restaurante listaRestaurantes = restaurantes.get(position);
        holder.bind(listaRestaurantes);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(listaRestaurantes);
            }
        });

        //holder.nome.setText(restaurante.getNome());
        //holder.endereco.setText(restaurante.getEndereco());
        //holder.horario.setText(restaurante.getHorarioFuncionamento());
        //Drawable drawable = itemView.getResources().getDrawable(restaurantes.get());
        //holder.imagem.setImageDrawable(drawable);
    }

    @Override
    public int getItemCount() {
        return restaurantes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imagem;
        TextView endereco;
        TextView nome;
        TextView horario;

        public ViewHolder(View itemView) {
            super(itemView);
            endereco = itemView.findViewById(R.id.txtEnderecoRestaurante);
            nome = itemView.findViewById(R.id.txtNomeRestaurante);
            imagem = itemView.findViewById(R.id.imagemViewRestaurante);
            horario = itemView.findViewById(R.id.txtHorario);
        }

        public void bind(Restaurante restaurantes) {
            Drawable drawable = itemView.getResources().getDrawable(restaurantes.getImagen());
            imagem.setImageDrawable(drawable);
            nome.setText(restaurantes.getNome());
            endereco.setText(restaurantes.getEndereco());
            horario.setText(restaurantes.getHorarioFuncionamento());
        }
    }
}
