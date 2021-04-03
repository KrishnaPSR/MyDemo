package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

         Intent intent = getIntent();
        Bundle uid = intent.getExtras("imageUrl")


        img=(ImageView)findViewById(R.id.image);
//        img.setImageResource(getIntent().getIntExtra("imageUrl", R.drawable.ic_launcher_background));
        Glide.with(getApplicationContext()).load(uid).into(img);

    }
}