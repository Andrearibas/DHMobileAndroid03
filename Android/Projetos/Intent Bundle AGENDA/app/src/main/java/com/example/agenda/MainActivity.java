package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout inputLayoutNome;
    private TextInputLayout inputLayoutTelefone;
    private FloatingActionButton botaoAdd;

    public static final String NOME_KEY = "nome";
    public static final String TELEFONE_KEY = "telefone";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLayoutNome = findViewById(R.id.textInputLayoutNome);
        inputLayoutTelefone = findViewById(R.id.textInputLayoutTelefone);
        botaoAdd = findViewById(R.id.floatingActionButtonAdd);

        botaoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = inputLayoutNome.getEditText().getText().toString();
                String telefone = inputLayoutTelefone.getEditText().getText().toString();

                if (!nome.isEmpty() && !telefone.isEmpty()){
                    //mando para outra activity os dados

                    //Criando uma nova instancia do tipo intent
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                    //Criando uma nova instancia do Bundle
                    Bundle bundle = new Bundle();
                    //Repassando os dados para o bundle
                    bundle.putString(NOME_KEY,nome);
                    bundle.putString(TELEFONE_KEY,telefone);

                    //Passando o bundle para o intent
                    intent.putExtras(bundle);

                    //Passando o intent para o startActivity
                    startActivity(intent);

                } else {
                    inputLayoutNome.setError("Preencha o campo nome!");
                    inputLayoutTelefone.setError("Preencha o campo telefone!");
                }



            }
        });



    }
}
