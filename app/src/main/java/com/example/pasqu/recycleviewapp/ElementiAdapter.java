package com.example.pasqu.recycleviewapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ElementiAdapter extends RecyclerView.Adapter<ElementiHolder> {

    private ArrayList<Elementi> mElement;


    public ElementiAdapter (ArrayList<Elementi> elementList) {
        mElement = elementList;
    }

    @NonNull
    @Override
    public ElementiHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.elementi_item,viewGroup,false);
        return new ElementiHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ElementiHolder elementiHolder, int position) {
        elementiHolder.bind(mElement.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return mElement.size();
    }
}
