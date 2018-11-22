package com.infinite5.app.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.infinite5.app.R;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainAcyivity";

    private ArrayList<String> mJudul = new ArrayList<>();
    private ArrayList<String> mGambar = new ArrayList<>();
    private ArrayList<String> mTag = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started");

        mAnjay();

    }

    private void mAnjay() {

        Log.d(TAG, "mAnjay: data kota");

        mJudul.add("Kabupaten Bantul");
        mTag.add("Bantul");
        mGambar.add("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSeSWeKYWPvCkPzlhuH_TvKEL1SnU3q405KYMYRr6RSPNZWDrf5");

        mJudul.add("Kabupaten Sleman");
        mTag.add("Sleman");
        mGambar.add("https://i.redd.it/tpsnoz5bzo501.jpg");

        mJudul.add("Kabupaten Gunung Kidul");
        mTag.add("Gunung Kidul");
        mGambar.add("https://i.redd.it/tpsnoz5bzo501.jpg");

        mJudul.add("Kabupaten Kulon Progo");
        mTag.add("Kulon Progo");
        mGambar.add("https://i.redd.it/tpsnoz5bzo501.jpg");

        mJudul.add("Kota Yogyakarta");
        mTag.add("Kota Yogyakarta");
        mGambar.add("https://i.redd.it/tpsnoz5bzo501.jpg");

        initRecyclePanti();

    }

    private void initRecyclePanti() {
        Log.d(TAG, "initRecyclePanti: list panti");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        RecyclerView menu = (RecyclerView) findViewById(R.id.menu_kabupaten);
        MenuAdapter adapter = new MenuAdapter(this, mJudul, mTag, mGambar);
        menu.setAdapter(adapter);
        menu.setLayoutManager(layoutManager);


    }
}
