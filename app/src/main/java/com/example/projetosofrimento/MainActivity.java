package com.example.projetosofrimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ID do botão continuar
        btnContinuar = (Button) findViewById(R.id.cmdContinuar);

        // Método para ir para outra Activity com o botão!
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencaoContinuar = new Intent(MainActivity.this, TelaLogin.class);
                //Método para iniciar a Activity
                startActivity(intencaoContinuar);
            }
        });

    }
}