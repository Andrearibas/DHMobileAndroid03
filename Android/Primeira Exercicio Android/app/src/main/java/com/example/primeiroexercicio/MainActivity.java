package com.example.primeiroexercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText email;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.edit_text_nome);
        email = findViewById(R.id.edit_text_email);
        botao = findViewById(R.id.botao_id);

        // final Editable nomeRecebido = nome.getText();

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeRecebido = nome.getText().toString();
                String emailRecebido = email.getText().toString();

                if (nomeRecebido.equals("")) {
                    Toast.makeText(getApplicationContext(), "Preencha o campo Nome", Toast.LENGTH_SHORT).show();


                } else{
                    Toast.makeText(getApplicationContext(), "Dados OK", Toast.LENGTH_SHORT).show();
                }

                if (emailRecebido.equals("")) {
                    Toast.makeText(getApplicationContext(), "Preencha o campo Email", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Dados OK", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



