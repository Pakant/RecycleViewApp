package com.example.pasqu.recycleviewapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ElementiHolder extends RecyclerView.ViewHolder  {

    TextView  mText;
    ImageView mImage;
    Elementi mElementi;

    public ElementiHolder(@NonNull View itemView) {
        super(itemView);

        mText = itemView.findViewById(R.id.textViewH);
        mImage = itemView.findViewById(R.id.imageViewH);

    }
    public void bind (Elementi elementi){
        mElementi = elementi;
        mText.setText(mElementi.getNome());
        mImage.setImageResource(R.mipmap.ic_launcher_round);
    }
}
