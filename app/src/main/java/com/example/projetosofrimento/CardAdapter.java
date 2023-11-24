package com.example.projetosofrimento;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetosofrimento.dominio.CardData;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private List<CardData> cardList;

    // Constructor
    public CardAdapter(List<CardData> cardList) {
        this.cardList = cardList;
    }

    // Inner ViewHolder class
    public static class CardViewHolder extends RecyclerView.ViewHolder {
        // Views in your card layout
        public TextView usuarioTextView;
        public TextView lugarTextView;
        public TextView horarioTextview;
        public TextView diaTextView;

        public CardViewHolder(View itemView) {
            super(itemView);
            // Initialize views
            usuarioTextView = itemView.findViewById(R.id.cardNomeUsuario);
            lugarTextView = itemView.findViewById(R.id.otherTextView);
            horarioTextview = itemView.findViewById(R.id.CardHora);
            diaTextView = itemView.findViewById(R.id.CardDia);
        }
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate your card layout
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        // Bind data to views
        CardData currentCard = cardList.get(position);
        holder.usuarioTextView.setText(currentCard.getUsuario());
        holder.lugarTextView.setText(currentCard.getLugar());
        holder.diaTextView.setText(currentCard.getDia());
        holder.horarioTextview.setText(currentCard.getHora());
        // ... bind other data
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
