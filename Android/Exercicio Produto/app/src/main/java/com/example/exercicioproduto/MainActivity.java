package com.example.exercicioproduto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nomeProduto;
    private EditText precoProduto;
    private EditText porcentagemDesconto;
    private Button botao;
    private double valor1,valor2,resultado,resultadoFinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeProduto = findViewById(R.id.nome_produto_edit_text);
        precoProduto = findViewById(R.id.preco_produto_edit_text);
        porcentagemDesconto = findViewById(R.id.porcentagem_desconto_edit_text);
        botao = findViewById(R.id.button);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.parseDouble(precoProduto.getText().toString());
                valor2 = Double.parseDouble(porcentagemDesconto.getText().toString());
                resultado = (valor2*valor1)/100;
                resultadoFinal = valor1 - resultado;

                Toast.makeText(getApplicationContext(),"O Valor do Produto "+ nomeProduto.getText()+" é R$ "+ resultadoFinal,Toast.LENGTH_LONG).show();


            }
        });

    }
}
