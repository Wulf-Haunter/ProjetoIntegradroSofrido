package com.example.projetosofrimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHome extends AppCompatActivity {
    Button btnPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);

        btnPerfil = (Button) findViewById(R.id.cmdPerfil);
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencaoPerfil = new Intent(TelaHome.this, TelaUsuario.class);
                startActivity(intencaoPerfil);
            }
        });
    }
}