package com.example.marvel.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Result;
import com.example.marvel.view.interfacee.OnClickImage;
import com.squareup.picasso.Picasso;

import static com.example.marvel.view.activity.HomeActivity.RESULT_KEY;

public class DetalheActivity extends AppCompatActivity implements OnClickImage {
    private ImageView ivDetalheFundo, ivDetalheFrente;
    private TextView tvDetalheTitulo, tvDetalheDescricao, tvDetalhePublicacao, tvDetalhePreco, tvDetalhePagina;

    public static final String DETAILSIMAGE_KEY = "imagedetalhe";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        initView();

        if (getIntent() != null && getIntent().getExtras() != null) {

            Result result = getIntent().getParcelableExtra(RESULT_KEY);

            Picasso.get().load(result.getThumbnail().getPath() + ".jpg").into(ivDetalheFrente);
            Picasso.get().load(result.getThumbnail().getPath() + ".jpg").into(ivDetalheFundo);

            tvDetalheTitulo.setText(result.getTitle());
            tvDetalheDescricao.setText(result.getDescription());


            String dataForm = result.getDates().get(0).getDate().split("T")[0];
            String[] listDate = dataForm.split("-");
            String dataPublicacao = listDate[2] + "/" + listDate[1] + "/" + listDate[0];
            tvDetalhePublicacao.setText("Published: " + dataPublicacao);


            tvDetalhePreco.setText("Price: $ "+result.getPrices().get(0).getPrice());

            tvDetalhePagina.setText("Pages: " + result.getPageCount().toString());


            ivDetalheFrente.setOnClickListener(v -> {
                Intent intent = new Intent(DetalheActivity.this, DetalheImageActivity.class);
                intent.putExtra(DETAILSIMAGE_KEY, result);
                startActivity(intent);
            });

        }
    }

    public void initView() {
        ivDetalheFundo = findViewById(R.id.imageDetalheFundo);
        ivDetalheFrente = findViewById(R.id.imageDetalheFrente);
        tvDetalheTitulo = findViewById(R.id.textViewTituloDetalhe);
        tvDetalheDescricao = findViewById(R.id.textViewDescricaoDetalhe);
        tvDetalhePublicacao = findViewById(R.id.textViewDataPublicacao);
        tvDetalhePreco = findViewById(R.id.textViewPreco);
        tvDetalhePagina = findViewById(R.id.textViewPagina);
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void OnclickImage(Result result) {
        Intent intent = new Intent(this, DetalheImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_KEY, result);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();

    }
}

