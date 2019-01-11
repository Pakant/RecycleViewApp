package com.example.pasqu.recycleviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aggiungi = findViewById(R.id.button);
        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        final EditText nome = findViewById(R.id.editText);
        RecyclerView.LayoutManager myLayoutManager;
        RecyclerView.Adapter mAdapter;
        final ArrayList<Elementi> elementList = new ArrayList<Elementi>();
        elementList.add(new Elementi("carne"));
        elementList.add(new Elementi("pesce"));

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        myRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        myLayoutManager = new LinearLayoutManager(MainActivity.this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        Log.d(TAG,"sto settando l' adapter");
        ElementiAdapter adapter = new ElementiAdapter(elementList);
        myRecyclerView.setAdapter(adapter);

        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elementList.add(new Elementi(nome.getText().toString()));

            }
        });


    }
}
