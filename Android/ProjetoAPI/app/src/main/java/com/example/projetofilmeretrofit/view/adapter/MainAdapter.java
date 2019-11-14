package com.example.projetofilmeretrofit.view.adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetofilmeretrofit.R;
import com.example.projetofilmeretrofit.model.Filme;
import com.example.projetofilmeretrofit.viewmodel.FilmeViewModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private MainAdapter adapter;
    private List<Filme> listaFilmes = new ArrayList<>();
    private FilmeViewModel viewModel;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Filme filme = listaFilmes.get(position);
        holder.onBind(filme);
    }
    public void update(List<Filme> listaFilmes) {
        this.listaFilmes.clear();
        this.listaFilmes = listaFilmes;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitulo;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById(R.id.txtTitulo);

        }
        public void onBind(Filme filme) {
            textViewTitulo.setText(filme.getTitle());

            Picasso.get().load("https://image.tmdb.org/t/p/w500/"+filme.getPosterPath()).into(imageView);

        }
    }
}