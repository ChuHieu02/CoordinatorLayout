package com.example.chuhieu.coordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.chuhieu.coordinatorlayout.recyclerview.Adapter;
import com.example.chuhieu.coordinatorlayout.recyclerview.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Model> models;
    private Adapter adapter;
    LinearLayoutManager linearLayoutManager;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.rclist);
        models = new ArrayList<>();
        for (int i = 0; i <50 ; i++) {
            Model model = new Model();
            model.setName("Chu Hieu");
            model.setPhone(+i);
            models.add(model);

        }
        adapter = new Adapter(models);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}
