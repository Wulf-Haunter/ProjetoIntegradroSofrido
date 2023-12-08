package com.example.projetosofrimento;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class NovaOcorrencia2 extends AppCompatActivity {

    private EditText txtOcorrido;
    private Button cmdEnviarOcorrencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_ocorrencia2);

        txtOcorrido = findViewById(R.id.txtOcorrido);
        cmdEnviarOcorrencia = findViewById(R.id.cmdEnviarOcorrencia);

        cmdEnviarOcorrencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText
                String ocorridoText = txtOcorrido.getText().toString();

                // Create an Intent to start the next activity (replace with your actual implementation)
                Intent intent = new Intent(NovaOcorrencia2.this, TelaHome2.class);

                // Pass the text data as an extra to the next activity
                intent.putExtra("ocorrido_text", ocorridoText);

                // Start the next activity
                startActivity(intent);
            }
        });
    }
}
