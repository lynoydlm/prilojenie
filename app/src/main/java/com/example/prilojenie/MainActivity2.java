package com.example.prilojenie;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private final int zagr=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run()  {
                Intent peremenaya1 = new Intent (MainActivity2.this, MainActivity3.class);
                MainActivity2.this.startActivity (peremenaya1);
                MainActivity2.this.finish();
            }
        }, zagr);
    }
}