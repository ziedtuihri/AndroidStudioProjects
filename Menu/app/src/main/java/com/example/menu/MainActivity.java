package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();


        if(id == R.id.red){
        t1.setTextColor(Color.RED);


        }
        if(id == R.id.green){
            t1.setTextColor(Color.GREEN);

        }
        if(id == R.id.finish){
            finish();
            return true;
        }
        if(id == R.id.gras){
            t1.setTypeface(null, Typeface.BOLD);
            return true;
        }
        if(id == R.id.itallique){
            t1.setTypeface(null, Typeface.BOLD_ITALIC);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
