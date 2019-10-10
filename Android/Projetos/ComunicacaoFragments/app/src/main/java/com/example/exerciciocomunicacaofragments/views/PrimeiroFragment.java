package com.example.exerciciocomunicacaofragments.views;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.exerciciocomunicacaofragments.R;
import com.example.exerciciocomunicacaofragments.interfaces.Comunicador;
import com.example.exerciciocomunicacaofragments.model.SistemaOperacional;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {
    private Button btnCachorro;
    private Button btnGato;
    public Comunicador comunicador;


    public PrimeiroFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            comunicador = (Comunicador) context;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        initViews(view);

        btnCachorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional cachoorro = new SistemaOperacional(R.drawable.cachorro,"Cachorro");
                comunicador.receberMensagem(cachoorro);

            }
        });

        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional gato = new SistemaOperacional(R.drawable.gato,"Gato");
                comunicador.receberMensagem(gato);
            }
        });

        return view;
    }

    public void initViews (View view){
        btnCachorro = view.findViewById(R.id.buttonCachorro);
        btnGato = view.findViewById(R.id.buttonGato);
    }




}
