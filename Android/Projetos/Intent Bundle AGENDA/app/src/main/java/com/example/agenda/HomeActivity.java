package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import static com.example.agenda.MainActivity.NOME_KEY;
import static com.example.agenda.MainActivity.TELEFONE_KEY;

public class HomeActivity extends AppCompatActivity {

    private TextView textViewNome;
    private TextView textViewTelefone;
    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewNome = findViewById(R.id.textView1);
        textViewTelefone = findViewById(R.id.textView2);
        btnVoltar =  findViewById(R.id.botaoVoltar);


        Intent intent = getIntent();

        if (getIntent() !=null && intent.getExtras() != null){

            Bundle bundle = intent.getExtras();

            String nome = bundle.getString(NOME_KEY);
            String telefone = bundle.getString(TELEFONE_KEY);

            textViewNome.setText(nome);
            //textViewNome.setVisibility(View.GONE);
            textViewTelefone.setText(telefone);

        }else   {
            Snackbar.make(textViewNome,"Não a dados!", Snackbar.LENGTH_LONG).show();
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));

            }
        });

    }
}
