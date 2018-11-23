package com.hva.joris.geoguesswipe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StreetviewObjectAdapter extends RecyclerView.Adapter<StreetviewObjectViewHolder> {

    private Context context;
    public List<StreetviewObject> list;

    public StreetviewObjectAdapter(Context context, List<StreetviewObject> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public StreetviewObjectViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_cell, parent, false);
        return new StreetviewObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StreetviewObjectViewHolder streetviewObjectViewHolder, int position) {
        final StreetviewObject streetviewObject = list.get(position);
        streetviewObjectViewHolder.imageView.setImageResource(streetviewObject.getStreetviewName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
