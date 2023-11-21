package com.example.projetosofrimento;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class TelaHome extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);

        // Initialize your RecyclerView and layout manager
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Example data, replace with your actual data
        List<String> cardData = new ArrayList<>();
        cardData.add("Card 1 Content");
        cardData.add(""); // Empty card
        cardData.add("Card 3 Content");

        // Initialize the adapter with your data
        cardAdapter = new CardAdapter(cardData, this);
        recyclerView.setAdapter(cardAdapter);
    }
}
