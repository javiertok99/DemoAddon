package com.example.a16022934.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.imageView);
        iv.setImageResource(R.mipmap.ic_launcher);

        String imageUrl = "http://square.github.io/picasso/static/sample.png";
        Picasso.with(this).load(imageUrl).into(iv);


    }
}
