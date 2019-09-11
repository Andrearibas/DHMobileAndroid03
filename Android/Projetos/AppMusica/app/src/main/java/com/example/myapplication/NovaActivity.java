package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class NovaActivity extends AppCompatActivity {
    private TextInputLayout textInputLayoutNome;
    private TextInputEditText textInputEditTextNome;
    private FloatingActionButton btnAddNovaTela;
    private TextView textViewMsgm;
    private Button btnNovaMusica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);

        textInputLayoutNome =  findViewById(R.id.textInputLayoutNovaTela);
        textInputEditTextNome = findViewById(R.id.textInputEditTextNovaTela);
    }
}
