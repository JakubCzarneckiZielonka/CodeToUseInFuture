package com.example.codetouseinfuture.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codetouseinfuture.R;

public class SecondRecyclerView extends AppCompatActivity {
    ImageView img;
    TextView tv1,tv2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_2);
        getSupportActionBar().hide();
        img = findViewById(R.id.recyclerview_2_img_1);
        tv1 = findViewById(R.id.recyclerview_2_TV_1);
        tv2 = findViewById(R.id.recyclerview_2_TV_2);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        String history = intent.getExtras().getString("history");
        int image = intent.getExtras().getInt("flag");

        tv1.setText(name);
        tv2.setText(history);
        img.setImageResource(image);
    }
}
