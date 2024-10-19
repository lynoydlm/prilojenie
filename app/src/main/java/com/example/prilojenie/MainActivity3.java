package com.example.prilojenie;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        Button perehod=(Button) findViewById(R.id.perehod);
        perehod.setOnClickListener(this::onClick);

        Button registr=(Button) findViewById(R.id.registr);
        registr.setOnClickListener(this::onClick2);
    }
    public void onClick(View view) {
        Intent perehod = new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(perehod);
    }
    public void onClick2(View view) {
        Intent registr = new Intent(MainActivity3.this, MainActivity5.class);
        startActivity(registr);
    }


}