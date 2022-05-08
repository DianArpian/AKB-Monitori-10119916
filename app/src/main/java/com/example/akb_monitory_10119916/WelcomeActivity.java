package com.example.akb_monitory_10119916;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.monitory.R;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button button = findViewById(R.id.btnWalkthroughStart);
        button.setOnClickListener(v -> move());
    }

    public void move() {
        Intent intent = new Intent(WelcomeActivity.this , LoginCodeActivity.class);
        startActivity(intent);
    }
}
