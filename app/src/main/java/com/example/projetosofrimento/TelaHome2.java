package com.example.projetosofrimento;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TelaHome2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home2);
        // Your existing FAB click handling
        FloatingActionButton fab = findViewById(R.id.cmdOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to start the new activity
                Intent intent = new Intent(TelaHome2.this, NovaOcorrencia1.class);
                startActivity(intent);
            }
        });

        // Handling BottomAppBar menu item clicks
        BottomAppBar bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomAppBar.setOnMenuItemClickListener(new BottomAppBar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.perfil) {
                    // Handle the click for menu item with ID R.id.perfil
                    Intent intentPerfil = new Intent(TelaHome2.this, TelaUsuario.class);
                    startActivity(intentPerfil);
                    return true;
                }
                return false; // Indicate that the click has not been handled
            }

        });

        // Retrieve the Intent that started this activity
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Get the data passed with the Intent
            String ocorridoText = extras.getString("ocorrido_text");
            String categoria = extras.getString("categoriaSelecionada");
            String lugar = extras.getString("localSelecionado");
            String descricaoText = extras.getString("descricaoOcorrencia");
            String txtNome = extras.getString("Nome_Usuário");

            // Find the TextView components in your layout
            TextView cardNomeUsuario = findViewById(R.id.cardNomeUsuario);
            TextView CardDia = findViewById(R.id.CardDiaFalso);
            TextView CardHora = findViewById(R.id.CardHoraFalso);
            TextView TipoDeOcorrencia = findViewById(R.id.TipoDeOcorrencia);
            TextView DescricaoOcorrencia = findViewById(R.id.DescricaoOcorrenciaFalso);
            TextView localOcorrencia = findViewById(R.id.lugarOcorrencia);

            // Set the text values with the data received from the previous activity
            // cardNomeUsuario.setText(txtNome);
            CardDia.setText(getCurrentDate());
            CardHora.setText(getCurrentTime());
            localOcorrencia.setText(lugar);
            TipoDeOcorrencia.setText(categoria);
            DescricaoOcorrencia.setText(descricaoText);
        }
    }

    private String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy", Locale.getDefault());
        return sdf.format(Calendar.getInstance().getTime());
    }

    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.getDefault());
        return sdf.format(Calendar.getInstance().getTime());
    }
}

