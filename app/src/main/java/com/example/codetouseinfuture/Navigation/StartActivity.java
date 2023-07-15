package com.example.codetouseinfuture.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codetouseinfuture.R;

public class StartActivity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_1);

        btn1 = findViewById(R.id.btn_navigation_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
