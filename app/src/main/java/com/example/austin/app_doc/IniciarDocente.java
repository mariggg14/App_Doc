package com.example.austin.app_doc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IniciarDocente extends AppCompatActivity {
    Button btnIniciar;
    Animation frombottom, fromtop;
    TextView textView, edtEmail, edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_docente);
        //OCULTAR ACTIONBAR
        getSupportActionBar().hide();

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombotton);
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        textView = (TextView) findViewById(R.id.textView);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        btnIniciar.startAnimation(frombottom);
        textView.startAnimation(fromtop);
        edtEmail.startAnimation(fromtop);
        edtPassword.startAnimation(fromtop);
    }
}
