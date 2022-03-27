package com.example.laba4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout ConstraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout = findViewById(R.id.relative_layout);
    }

    public void onRedButtonClick(View view) {
        ConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }
    public void onYellowButtonClick(View view) {
        ConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }
    public void onGreenButtonClick(View view) {
        ConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}