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
import com.example.digitalhousefoods.interfaces.RecyclerPratosViewOnClick;
import com.example.digitalhousefoods.model.Pratos;
import com.example.digitalhousefoods.model.Restaurante;
import com.example.digitalhousefoods.views.CardapioActivity;

import java.util.List;

public class PratosAdapter extends RecyclerView.Adapter<PratosAdapter.ViewHolder> {
    private List<Pratos> listaDePratos;
    private RecyclerPratosViewOnClick listener;

    public PratosAdapter(List<Pratos> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_pratos, parent, false);
        return new PratosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Pratos pratos = listaDePratos.get(position);
        holder.bind(pratos);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(pratos);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaDePratos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nomePrato;
        private ImageView imagemPrato;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomePrato = itemView.findViewById(R.id.txtNomeRestaurante);
            imagemPrato = itemView.findViewById(R.id.imageViewCardapio);

        }

        public void bind(Pratos pratos) {
            Drawable drawable = itemView.getResources().getDrawable(pratos.getImagemPrato());
            imagemPrato.setImageDrawable(drawable);
            nomePrato.setText(pratos.getDescPrato());
        }
    }
}
