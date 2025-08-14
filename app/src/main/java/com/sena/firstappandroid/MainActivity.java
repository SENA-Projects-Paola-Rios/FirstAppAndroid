package com.sena.firstappandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            btnTwo = findViewById(R.id.btnChange);
            btnTwo.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
              }
        });
    }
}