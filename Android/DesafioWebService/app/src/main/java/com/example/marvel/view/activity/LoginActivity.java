package com.example.marvel.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.marvel.R;

public class LoginActivity extends AppCompatActivity {
    private EditText nomeEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button logInSave;
    private String email, senha, nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();

        logInSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeEditText.setError(null);
                passwordEditText.setError(null);

                validarCampos();

            }
        });
    }

    public void validarCampos() {
        nomeEditText.setError(null);
        emailEditText.setError(null);
        passwordEditText.setError(null);

        nome = nomeEditText.getText().toString().trim();
        email = emailEditText.getText().toString().trim();
        senha = passwordEditText.getText().toString().trim();


        if (nomeEditText.getEditableText().toString().equals("")) {
            nomeEditText.setError("Informe seu nome.");
        } else if (emailEditText.getEditableText().toString().equals("")) {
            emailEditText.setError("Informe sua email.");
        } else if (passwordEditText.getEditableText().toString().equals("")) {
            passwordEditText.setError("Informe sua senha.");
        } else {
            irParaHome();
        }
    }

    public void irParaHome() {

        startActivity(new Intent(LoginActivity.this, HomeActivity.class));

    }

    public void initView(){
        nomeEditText = findViewById(R.id.textInputEditNome);
        emailEditText = findViewById(R.id.textInputEditEmail);
        passwordEditText = findViewById(R.id.textInputEditPassword);
        logInSave = findViewById(R.id.btnSave);
    }
}
