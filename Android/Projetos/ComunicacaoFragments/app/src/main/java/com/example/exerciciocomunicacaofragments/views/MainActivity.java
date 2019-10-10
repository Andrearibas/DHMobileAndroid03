package com.example.exerciciocomunicacaofragments.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.exerciciocomunicacaofragments.R;
import com.example.exerciciocomunicacaofragments.interfaces.Comunicador;
import com.example.exerciciocomunicacaofragments.model.SistemaOperacional;

public class MainActivity extends AppCompatActivity implements Comunicador {
    public static final String SO_KEY = "SO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragments(R.id.contener2, new PrimeiroFragment());
    }

    private void replaceFragments (int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }


    @Override
    public void receberMensagem(SistemaOperacional sistema) {
        setBundleToFragment(sistema,SO_KEY);

    }



    private void setBundleToFragment(SistemaOperacional so, String CHAVE){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAVE, so);

        Fragment segundoFragment = new SegundoFragment();
        segundoFragment.setArguments(bundle);

        replaceFragments(R.id.contener1,segundoFragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
