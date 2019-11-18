package com.example.marvel.view.activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.marvel.R;
import com.example.marvel.model.pojo.Result;
import com.squareup.picasso.Picasso;

import static com.example.marvel.view.activity.DetalheActivity.DETAILSIMAGE_KEY;

public class DetalheImageActivity extends AppCompatActivity {
    private ImageView imagemDetalhe;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_image);

        imagemDetalhe = findViewById(R.id.ivDetalheImage);


        if (getIntent() != null && getIntent().getExtras() != null) {

            Result result = getIntent().getExtras().getParcelable(DETAILSIMAGE_KEY);

            Picasso.get().load(result.getThumbnail().getPath() + ".jpg").into(imagemDetalhe);

        }
    }
}
