package com.example.desafioandroidnovo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.desafioandroidnovo.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {
    private TextInputLayout txtRegisterName;
    private TextInputLayout txtRegisterEmail;
    private TextInputLayout txtRegisterPassword;
    private TextInputLayout txtRegisterRepeatePassord;
    private Button btnTelaRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();

        Toolbar toolbar = findViewById(R.id.id_toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });

        btnTelaRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtRegisterName.setError(null);
                txtRegisterEmail.setError(null);
                txtRegisterPassword.setError(null);
                txtRegisterRepeatePassord.setError(null);

                if(!txtRegisterPassword.getEditText().getText().toString().equals(txtRegisterRepeatePassord.getEditText().getText().toString())){
                    txtRegisterPassword.setError("As senhas não conferem!");
                    txtRegisterRepeatePassord.setError("As senhas não conferem!");
                }else if (txtRegisterName.getEditText().getText().toString().equals("")){
                    txtRegisterName.setError("Campo Obrigatório.");
                } else if (txtRegisterEmail.getEditText().getText().toString().equals("")){
                    txtRegisterEmail.setError("Campo Obrigatório.");
                } else if (txtRegisterPassword.getEditText().getText().toString().equals("")){
                    txtRegisterPassword.setError("Campo Obrigatório.");
                } else if (txtRegisterRepeatePassord.getEditText().getText().toString().equals("")){
                    txtRegisterRepeatePassord.setError("Campo Obrigatório.");
                } else {
                    Snackbar.make(view,"Cadastro realizado com sucesso!",Snackbar.LENGTH_INDEFINITE).setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            startActivity(new Intent(RegisterActivity.this,HomeActivity.class));
                        }
                    }).setActionTextColor(getResources().getColor(R.color.colorAccent)).show();
                }
            }

        });
    }

    public void initView(){
        txtRegisterName = findViewById(R.id.txtInputRegisterName);
        txtRegisterEmail = findViewById(R.id.txtInputRegisterEmail);
        txtRegisterPassword = findViewById(R.id.txtInputRegisterPassaword);
        txtRegisterRepeatePassord = findViewById(R.id.txtInputRegisterRepeate);
        btnTelaRegister = findViewById(R.id.buttonTelaRegister);
    }
}
