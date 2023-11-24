package com.example.projetosofrimento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NovaOcorrencia1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_ocorrencia1);

        Spinner spinner = findViewById(R.id.spinner_fruits);

        // Lista de frutas
        List<String> fruits = new ArrayList<>();
        fruits.add("Bosque");
        fruits.add("Praça de Alimentação");
        fruits.add("Pier");
        fruits.add("Estacionamento Superior");
        fruits.add("Estacionamento Inferior");
        fruits.add("Bloco 1");
        fruits.add("Bloco 2");
        fruits.add("Bloco 3");
        fruits.add("Bloco 4");
        fruits.add("Bloco 5");
        fruits.add("Bloco 6");
        fruits.add("Bloco 7");
        fruits.add("Bloco 8");
        fruits.add("Bloco 9");
        fruits.add("Bloco 10");
        fruits.add("Bloco 11");
        fruits.add("Bloco 12");

        // Adapter para o Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, fruits);
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

    }
}