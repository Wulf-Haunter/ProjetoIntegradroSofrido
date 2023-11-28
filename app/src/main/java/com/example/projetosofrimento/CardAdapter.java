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
        public TextView usuariotv;
        public TextView lugartv;
        public TextView horariotv;
        public TextView diatv;
        public TextView descricaotv;

        public CardViewHolder(View itemView) {
            super(itemView);
            // Initialize views
            usuariotv = itemView.findViewById(R.id.cardNomeUsuario);
            lugartv = itemView.findViewById(R.id.otherTextView);
            horariotv = itemView.findViewById(R.id.CardHora);
            diatv = itemView.findViewById(R.id.CardDia);
            descricaotv = itemView.findViewById(R.id.DescricaoOcorrencia);

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
        holder.usuariotv.setText(currentCard.getUsuario());
        holder.lugartv.setText(currentCard.getLugar());
        holder.horariotv.setText(currentCard.getDia());
        holder.diatv.setText(currentCard.getHora());
        holder.descricaotv.setText(currentCard.getDescrição());
        // ... bind other data
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }
}
