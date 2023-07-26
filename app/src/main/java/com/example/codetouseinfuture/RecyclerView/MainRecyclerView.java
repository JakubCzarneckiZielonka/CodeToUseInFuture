package com.example.codetouseinfuture.RecyclerView;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.codetouseinfuture.R;

import java.util.ArrayList;

public class MainRecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<RVModel> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_1);

        recyclerView = findViewById(R.id.recyclerview_1_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new RVModel(R.drawable.albania,"Albania","Tirana"));
        arrayList.add(new RVModel(R.drawable.algeria,"Algieria","Algier"));
        arrayList.add(new RVModel(R.drawable.andorra,"Andora","Andora"));
        arrayList.add(new RVModel(R.drawable.angola,"Angola","Luanda"));
        arrayList.add(new RVModel(R.drawable.antigua_and_barbuda,"Antigua i Barbuda","Saint John's"));
        arrayList.add(new RVModel(R.drawable.argentina,"Argentyna","Buenos Aires"));
        arrayList.add(new RVModel(R.drawable.armenia,"Armenia","Erywań"));
        arrayList.add(new RVModel(R.drawable.australia,"Australia","Canberra"));
        arrayList.add(new RVModel(R.drawable.saudiarabia,"Arabia Saudyjska","Rijad"));

        ModelRecyclerView modelRecyclerView = new ModelRecyclerView(this,arrayList);
        recyclerView.setAdapter(modelRecyclerView);
    }
}
