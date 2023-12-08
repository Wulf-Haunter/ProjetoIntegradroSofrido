package com.example.projetosofrimento;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TelaHome2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home2);

        // Retrieve the Intent that started this activity
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Get the data passed with the Intent
            String ocorridoText = extras.getString("ocorrido_text");
            String descricaoText = extras.getString("descricao_text");

            // Find the TextView components in your layout
            TextView cardNomeUsuario = findViewById(R.id.cardNomeUsuario);
            TextView CardDia = findViewById(R.id.CardDiaFalso);
            TextView CardHora = findViewById(R.id.CardHoraFalso);
            TextView TipoDeOcorrencia = findViewById(R.id.TipoDeOcorrencia);
            TextView DescricaoOcorrencia = findViewById(R.id.DescricaoOcorrenciaFalso);

            // Set the text values with the data received from the previous activity
            //cardNomeUsuario.setText("botar nome do usuário!");
            CardDia.setText(getCurrentDate());
            CardHora.setText(getCurrentTime());
            TipoDeOcorrencia.setText(ocorridoText); // Set appropriate value
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
