package com.example.comunicacaofragments.views;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.comunicacaofragments.R;
import com.example.comunicacaofragments.interfaces.Comunicador;
import com.example.comunicacaofragments.model.SistemaOperacional;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {
    private Button btnAndroid;
    private Button btnIOS;
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

        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional android = new SistemaOperacional(R.drawable.android, "Android, lançado em 2000");

                comunicador.receberMensagem(android);
            }
        });

        btnIOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional ios = new SistemaOperacional(R.drawable.apple,"IOS, lançado em 2001");

                comunicador.receberMensagem(ios);
            }
        });

        return view;
    }


    public void initViews(View view){
        btnAndroid = view.findViewById(R.id.buttonAndroid);
        btnIOS = view.findViewById(R.id.buttonIOS);
    }


}
