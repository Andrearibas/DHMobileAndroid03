package com.example.comunicacaofragments.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.comunicacaofragments.R;
import com.example.comunicacaofragments.interfaces.Comunicador;
import com.example.comunicacaofragments.model.SistemaOperacional;

public class MainActivity extends AppCompatActivity implements Comunicador {
    public static final String SO_KEY = "SO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragment(R.id.contener2, new PrimeiroFragment());
    }

    @Override
    public void receberMensagem(SistemaOperacional sistema) {
        setBundleToFragment(sistema, SO_KEY);

    }

    private void replaceFragment(int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();

        //*Codigo simplificado
       // getSupportFragmentManager().beginTransaction().replace(container,fragment).commit();
    }

    private void setBundleToFragment(SistemaOperacional so, String CHAVE){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAVE, so);

        Fragment segundoFragment = new SegundoFragment();
        segundoFragment.setArguments(bundle);

        replaceFragment(R.id.contener1,segundoFragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
