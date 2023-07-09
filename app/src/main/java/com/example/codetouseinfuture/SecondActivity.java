package com.example.codetouseinfuture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button btn1;
    private View animetedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
            btn1 = findViewById(R.id.secondActivitybtn_1);
            animetedView = findViewById(R.id.animate_view);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startSlideUpAnimation();
                }
            });
    }
    private void startSlideUpAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.slide_up);
        animetedView.startAnimation(animation);
    }
}