package com.example.codetouseinfuture.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.codetouseinfuture.R;

public class FromActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.codetouseinfuture.EXTRA_TEXT";
    public static final String EXTRA_NUMBER ="com.example.codetouseinfuture.EXTRA_NUMBER";
    Button btn1;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_3);
        btn1 = findViewById(R.id.navigation_3_btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openToActivity();
            }
        });
    }
    public void openToActivity(){
        editText1 = findViewById(R.id.navigation_3_ET_1);
        String text = editText1.getText().toString();
        editText2 = findViewById(R.id.navigation_3_ET_2);
        int number = Integer.parseInt(editText2.getText().toString());
        Intent intent = new Intent(FromActivity.this,ToActivity.class);
        intent.putExtra(EXTRA_TEXT,text);
        intent.putExtra(EXTRA_NUMBER,number);
        startActivity(intent);
    }
}
