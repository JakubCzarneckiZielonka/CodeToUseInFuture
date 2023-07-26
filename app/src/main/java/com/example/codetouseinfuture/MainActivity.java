package com.example.codetouseinfuture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.codetouseinfuture.Animation.AnimationActivity_1;
import com.example.codetouseinfuture.Navigation.FromActivity;
import com.example.codetouseinfuture.RecyclerView.MainRecyclerView;

public class MainActivity extends AppCompatActivity {

        Button btn_1, btn_2, btn_3, btn_4;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btn_1 = findViewById(R.id.main_btn_1);
            btn_2 = findViewById(R.id.main_btn_2);
            btn_3 = findViewById(R.id.main_btn_3);
            btn_4 = findViewById(R.id.main_btn_4);
            btn_1.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            });
            btn_2.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, AnimationActivity_1.class);
                startActivity(intent);
            });
            btn_3.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, FromActivity.class);
                startActivity(intent);
            });
            btn_4.setOnClickListener(view -> {
                Intent intent = new Intent(MainActivity.this, MainRecyclerView.class);
                startActivity(intent);
            });
        }
    }
