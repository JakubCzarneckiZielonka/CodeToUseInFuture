package com.example.codetouseinfuture.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codetouseinfuture.MainActivity;
import com.example.codetouseinfuture.R;

public class ToActivity extends AppCompatActivity {
    TextView textView1,textView2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_4);

        Intent intent = getIntent();
        String text = intent.getStringExtra(FromActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(FromActivity.EXTRA_NUMBER, 0);

        textView1 = findViewById(R.id.navigation_4_TextView_2);
        textView2 = findViewById(R.id.navigation_4_TextView_3);

        textView1.setText(text);
        textView2.setText(String.valueOf(number));

    }
}
