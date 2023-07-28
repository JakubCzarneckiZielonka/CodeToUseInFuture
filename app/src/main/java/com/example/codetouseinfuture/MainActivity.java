package com.example.codetouseinfuture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codetouseinfuture.Adapters.MainRecyclerViewAdapter;
import com.example.codetouseinfuture.Animation.AnimationActivity_1;
import com.example.codetouseinfuture.Models.Item;
import com.example.codetouseinfuture.Navigation.FromActivity;
import com.example.codetouseinfuture.Navigation.StartActivity;
import com.example.codetouseinfuture.RecyclerView.MainRecyclerView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainRecyclerViewAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.MainRecyclerView_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = readDataFromAsset();
        adapter = new MainRecyclerViewAdapter(itemList, new MainRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                if (item.getText().equals("Activity 1")) {
                    Intent intent = new Intent(MainActivity.this, StartActivity.class);
                    intent.putExtra("text", item.getText());
                    startActivity(intent);
                } else if (item.getText().equals("Activity 2")) {
                    Intent intent = new Intent(MainActivity.this, StartActivity.class);
                    intent.putExtra("text", item.getText());
                    startActivity(intent);
                } else if (item.getText().equals("Activity 3")) {
                    Intent intent = new Intent(MainActivity.this, StartActivity.class);
                    intent.putExtra("text", item.getText());
                    startActivity(intent);
                }
            }
        });
        recyclerView.setAdapter(adapter);
    }

    private List<Item> readDataFromAsset() {
        List<Item> items = new ArrayList<>();
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open("Spis.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            Random random = new Random();
            while ((line = bufferedReader.readLine()) != null) {
                int randomColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                items.add(new Item(line, randomColor));

            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }
}
