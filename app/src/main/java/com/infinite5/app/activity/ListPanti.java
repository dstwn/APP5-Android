package com.infinite5.app.activity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.infinite5.app.R;

public class ListPanti extends AppCompatActivity {

    private final static String TAG = "List";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_panti);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("");
        tangkapData();

    }

    private void setData(String pGambar, String pJudul, String pTag) {
        TextView oJudul = findViewById(R.id.Zudul);
        oJudul.setText(pJudul);

        TextView oTag = findViewById(R.id.Tag);
        oTag.setText(pTag);

        TextView oJuduleMas = findViewById(R.id.JuduleMas);
        oJuduleMas.setText(pJudul);

        ImageView oGambar = findViewById(R.id.Gambar);
        Glide.with(this)
                .asBitmap()
                .load(pGambar)
                .into(oGambar);

    }
    private void tangkapData(){
        if (getIntent().hasExtra("gambar") && getIntent().hasExtra("judul") && getIntent().hasExtra("tag")){
            String pGambar = getIntent().getStringExtra("gambar");
            String pJudul = getIntent().getStringExtra("judul");
            String pTag = getIntent().getStringExtra("tag");

            setData(pGambar, pJudul, pTag);
        }
    }

}
