package com.example.projetosofrimento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class NovaOcorrencia1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_ocorrencia1);
        FloatingActionButton fab = findViewById(R.id.cmdContinuarOcorrencia);
        Spinner spinner = findViewById(R.id.spinner_fruits);
        Spinner spinner2 = findViewById(R.id.spinner_fruits2);
        EditText txtOcorrencia = findViewById(R.id.edtOcorrencia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String categoriaSelecionada = spinner.getSelectedItem().toString();
                String localSelecionado = spinner2.getSelectedItem().toString();

                // Intent to start TelaHome2
                Intent intentHome2 = new Intent(NovaOcorrencia1.this, TelaHome2.class);
                intentHome2.putExtra("categoriaSelecionada", categoriaSelecionada);
                intentHome2.putExtra("localSelecionado", localSelecionado);

                String descricaoOcorrencia = txtOcorrencia.getText().toString();
                intentHome2.putExtra("descricaoOcorrencia", descricaoOcorrencia);
                startActivity(intentHome2);
            }
        });

        // Lista de frutas
        List<String> fruits = new ArrayList<>();
        fruits.add("Denúncia");
        fruits.add("Denúncia de indivíduo");
        fruits.add("Denunciar dano a patrimônio");
        fruits.add("Denunciar suspeito no campus");
        fruits.add("Denunciar máquina com defeito");
        fruits.add("Denunciar conduta do professor");
        fruits.add("Denunciar conduta de aluno");

        // Adapter para o Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fruits);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Definindo o adapter para o Spinner
        spinner.setAdapter(adapter);

        // Lidando com a seleção do Spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                String selectedFruit = parent.getItemAtPosition(position).toString();
                // Aqui você pode lidar com a fruta selecionada
                // Por exemplo, exibindo-a em um Toast
                Toast.makeText(NovaOcorrencia1.this, "Fruta selecionada: " + selectedFruit, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Método chamado quando nada é selecionado
            }
        });
            // Second Spinner


            // Lista de frutas para o segundo Spinner
            List<String> fruits2 = new ArrayList<>();
            fruits2.add("Bloco 1");
            fruits2.add("Bloco 2");
            fruits2.add("Bloco 3");
            fruits2.add("Bloco 4");
            fruits2.add("Bloco 5");
            fruits2.add("Bloco 6");
            fruits2.add("Bloco 7");
            fruits2.add("Bloco 8");
            fruits2.add("Bloco 9");
            fruits2.add("Bloco 10");
            fruits2.add("Bloco 11");
            fruits2.add("Bloco 12");
            fruits2.add("Taguatinga");
            fruits2.add("Edíficio União");

            // Adapter para o segundo Spinner
            ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fruits2);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            // Definindo o adapter para o segundo Spinner
            spinner2.setAdapter(adapter2);

            // Lidando com a seleção do segundo Spinner
            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                    String selectedCategory = parent.getItemAtPosition(position).toString();
                    // Aqui você pode lidar com a categoria selecionada
                    // Por exemplo, exibindo-a em um Toast
                    Toast.makeText(NovaOcorrencia1.this, "Categoria selecionada (Spinner 2): " + selectedCategory, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Método chamado quando nada é selecionado
                }
            });

    }
}