package com.example.austin.app_doc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();
        imageView = (ImageView) findViewById(R.id.image1);
        imageView.animate().scaleX(2).scaleY(2).setDuration(5000).start();
    }
}
