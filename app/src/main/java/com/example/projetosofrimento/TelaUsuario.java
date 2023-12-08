package com.example.projetosofrimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TelaUsuario extends AppCompatActivity {

    TextView txtUsuario = findViewById(R.id.NomeUsuario);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_usuario);
        FloatingActionButton fab = findViewById(R.id.cmdOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txtToPass = txtUsuario.getText().toString();
                // Intent to start the new activity
                Intent intent = new Intent(TelaUsuario.this, NovaOcorrencia1.class);
                intent.putExtra("Nome_usuário", txtToPass);
                startActivity(intent);
            }
        });
    }
}