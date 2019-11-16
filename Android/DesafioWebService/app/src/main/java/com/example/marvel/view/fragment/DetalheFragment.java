package com.example.marvel.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Image;
import com.example.marvel.model.pojo.Result;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalheFragment extends Fragment {
    private ImageView ivDetalheFundo, ivDetalheFrente;
    private TextView tvDetalheTitulo,tvDetalheDescricao, tvDetalhePublicacao, tvDetalhePreco, tvDetalhePagina;


    public DetalheFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalhe, container, false);

        initView(view);

        return view;
    }

    public void initView(View view){
        ivDetalheFundo = view.findViewById(R.id.imageDetalheFundo);
        ivDetalheFrente = view.findViewById(R.id.imageDetalheFrente);
        tvDetalheTitulo = view.findViewById(R.id.textViewTituloDetalhe);
        tvDetalheDescricao = view.findViewById(R.id.textViewDescricaoDetalhe);
        tvDetalhePublicacao = view.findViewById(R.id.textViewDataPublicacao);
        tvDetalhePreco = view.findViewById(R.id.textViewPreco);
        tvDetalhePagina = view.findViewById(R.id.textViewPagina);
    }

}
