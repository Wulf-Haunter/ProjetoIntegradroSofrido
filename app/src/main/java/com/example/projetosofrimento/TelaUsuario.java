package com.example.projetosofrimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaUsuario extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_usuario);
        FloatingActionButton fab = findViewById(R.id.cmdOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to start the new activity
                Intent intent = new Intent(TelaUsuario.this, NovaOcorrencia1.class);
                startActivity(intent);
            }
        });
    }
}