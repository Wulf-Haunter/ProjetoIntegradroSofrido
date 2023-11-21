package com.example.projetosofrimento;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    private List<String> cardData; // Botar a informação correta aqui!!!
    private Context context;

    public CardAdapter(List<String> cardData, Context context) {
        this.cardData = cardData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String data = cardData.get(position);
        if (data != null && !data.isEmpty()) {
            holder.cardContent.setText(data);
            holder.cardView.setVisibility(View.VISIBLE);
        } else {
            holder.cardView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return cardData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView cardContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            cardContent = itemView.findViewById(R.id.conteudoCard);
        }
    }
}
