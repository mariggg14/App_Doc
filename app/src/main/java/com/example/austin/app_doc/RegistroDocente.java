package com.example.austin.app_doc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroDocente extends AppCompatActivity {
    Button btnUnirse;
    Animation frombottom, fromtop;
    TextView textView, edtEmail, edtNameComplet, edtUserName, edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_docente);
        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombotton);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        btnUnirse = (Button) findViewById(R.id.btnUnirse);
        textView = (TextView) findViewById(R.id.textView);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtNameComplet = (EditText) findViewById(R.id.edtNameComplete);
        edtUserName = (EditText) findViewById(R.id.edtUserName);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        btnUnirse.startAnimation(frombottom);
        textView.startAnimation(fromtop);
        edtEmail.startAnimation(fromtop);
        edtNameComplet.startAnimation(fromtop);
        edtUserName.startAnimation(fromtop);
        edtPassword.startAnimation(fromtop);
    }
    public void nextGrupo(View view){
        Intent PasarVenta = new Intent(getApplicationContext(),SeleccionGrupo.class);
        startActivity(PasarVenta);
    }
}
