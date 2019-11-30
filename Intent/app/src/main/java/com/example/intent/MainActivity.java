package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Intent i = new Intent(this, Activity2.class);
i.putExtra("Value1", "Première valeur Activity2 ");
i.putExtra("Value2", 5);
i.putExtra("Value3", 0.22);
    startActivity(i);
}
