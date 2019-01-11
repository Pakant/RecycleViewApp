package com.example.pasqu.recycleviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aggiungi = findViewById(R.id.button);
        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        EditText nome = findViewById(R.id.editText);
        RecyclerView.LayoutManager myLayoutManager;
        RecyclerView.Adapter mAdapter;

        Elementi e1 = new Elementi();
        Elementi e2 = new Elementi();

        e1.setNome("carne");
        e2.setNome("pesce");

        ArrayList<Elementi> elementList = new ArrayList<Elementi>();
        elementList.add(e1);
        elementList.add(e2);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        myRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        mAdapter = new ElementiAdapter(myDataset);
        myRecyclerView.setAdapter(mAdapter);

        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
