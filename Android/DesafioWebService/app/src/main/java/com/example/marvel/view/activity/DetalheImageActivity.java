package com.example.marvel.view.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Result;
import com.squareup.picasso.Picasso;

import static com.example.marvel.view.activity.DetalheActivity.DETAILSIMAGE_KEY;

public class DetalheImageActivity extends AppCompatActivity {
    private ImageView imagemDetalhe;
    private Toolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_image);

        toolbar = findViewById(R.id.my_toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp));
        setSupportActionBar(toolbar);

        imagemDetalhe = findViewById(R.id.ivDetalheImage);

        if (getIntent() != null && getIntent().getExtras() != null) {

            Result result = getIntent().getExtras().getParcelable(DETAILSIMAGE_KEY);

            Picasso.get().load(result.getThumbnail().getPath() + ".jpg").into(imagemDetalhe);

        }
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
