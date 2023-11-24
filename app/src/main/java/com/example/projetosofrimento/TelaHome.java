package com.example.projetosofrimento;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class TelaHome extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);

        // Move the view initialization here
        recyclerView = findViewById(R.id.recyclerView);
        titleTextView = findViewById(R.id.titleTextView);

        List<String> cardItems = new ArrayList<>();
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.");
        cardItems.add("Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        cardItems.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

        if (cardItems.isEmpty()) {
            // If the content is empty, hide the title and recyclerView
            titleTextView.setVisibility(View.GONE);
            recyclerView.setVisibility(View.GONE);
        } else {
            // If there are card items, set up the RecyclerView and display the title
            titleTextView.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.VISIBLE);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            CardAdapter cardAdapter = new CardAdapter(cardItems);
            recyclerView.setAdapter(cardAdapter);
        }
    }
}
