package com.example.austin.app_doc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button btnIniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();
        //ANIMACION DE IMAGEN ESCALANDO
        imageView = (ImageView) findViewById(R.id.image1);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        imageView.animate().scaleX(2).scaleY(2).setDuration(7000).start();
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,IniciarDocente.class);
                startActivity(a);
            }
        });
    }
    public void nextRegistro(View view){
        Intent PasarVenta = new Intent(getApplicationContext(),RegistroDocente.class);
        startActivity(PasarVenta);
    }
}
