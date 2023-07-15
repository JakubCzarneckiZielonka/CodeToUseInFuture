package com.example.codetouseinfuture.Layouts;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codetouseinfuture.R;

public class TemporaryLayout extends AppCompatActivity {

    Button btn;
    LinearLayout parentLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn_3);
        parentLayout = findViewById(R.id.mainLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout tempLayout = new LinearLayout(TemporaryLayout.this);
                tempLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                tempLayout.setOrientation(LinearLayout.VERTICAL);
                tempLayout.setBackgroundColor(Color.YELLOW); // Ustaw kolor tła tymczasowego layoutu

                TextView textView = new TextView(TemporaryLayout.this);
                textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                textView.setText("Działa");
                textView.setTextSize(24);
                textView.setGravity(Gravity.CENTER);

                tempLayout.addView(textView);
                parentLayout.addView(tempLayout);
            }
        });
    }
}
