package com.example.projetosofrimento;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetosofrimento.R;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private List<String> cardItems;

    public CardAdapter(List<String> cardItems) {
        this.cardItems = cardItems;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        // Bind your card content here
        String cardContent = cardItems.get(position);
        holder.bind(cardContent);
    }

    @Override
    public int getItemCount() {
        return cardItems.size();
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {

        private TextView cardContentTextView;

        CardViewHolder(@NonNull View itemView) {
            super(itemView);
            cardContentTextView = itemView.findViewById(R.id.cardContentTextView);
        }

        void bind(String cardContent) {
            // Bind your card views here
            cardContentTextView.setText(cardContent);
        }
    }
}
