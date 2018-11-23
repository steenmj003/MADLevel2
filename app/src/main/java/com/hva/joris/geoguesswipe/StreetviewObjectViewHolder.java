package com.hva.joris.geoguesswipe;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class StreetviewObjectViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public View view;

    public StreetviewObjectViewHolder(@NonNull View itemView) {
        super(itemView);
        this.imageView = itemView.findViewById(R.id.imageView);
        this.view = itemView;
    }
}
