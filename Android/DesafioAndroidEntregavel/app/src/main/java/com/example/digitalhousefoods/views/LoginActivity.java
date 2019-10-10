package com.example.digitalhousefoods.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.digitalhousefoods.R;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout txtEmail;
    private TextInputLayout txtPassword;
    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtEmail.setError(null);
                txtPassword.setError(null);

                if (txtEmail.getEditText().getText().toString().equals(" ")){
                    txtEmail.setError("Digite seu email!");
                }else if (txtPassword.getEditText().getText().toString().equals(" ")){
                    txtPassword.setError("Digite sua senha!");
                }else {
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                }
            }
        });

    }

    public void initView(){
        txtEmail = findViewById(R.id.txtInputEmail);
        txtPassword = findViewById(R.id.txtInputPassWord);
        btnLogin = findViewById(R.id.buttonLogin);
        btnRegister = findViewById(R.id.buttonTelaRegister);
    }
}
