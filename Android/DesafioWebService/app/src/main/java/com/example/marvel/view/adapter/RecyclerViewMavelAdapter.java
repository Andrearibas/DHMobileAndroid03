package com.example.marvel.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Result;
import com.example.marvel.view.activity.HomeActivity;
import com.example.marvel.view.interfacee.OnClick;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewMavelAdapter extends RecyclerView.Adapter<RecyclerViewMavelAdapter.ViewHolder> {

    private List<Result> listaMarvel;
    private OnClick listener;

    public RecyclerViewMavelAdapter(List<Result> listaMarvel, OnClick listener) {
        this.listaMarvel = listaMarvel;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerViewMavelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewMavelAdapter.ViewHolder holder, int position) {
        final Result result = listaMarvel.get(position);
        holder.onBind(result);

        holder.itemView.setOnClickListener(v-> listener.OnClick(result));
    }

    @Override
    public int getItemCount() {
        return listaMarvel.size();
    }

    public void atualizalista(List<Result> resultList) {
        this.listaMarvel.clear();
        this.listaMarvel = resultList;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewItemRecycler);
            textView = itemView.findViewById(R.id.textviewCodSerie);
        }

        public void onBind(Result result) {

            Picasso.get().load(result.getThumbnail().getPath() + ".jpg").into(imageView);
            textView.setText(result.getTitle());

        }
    }
}
