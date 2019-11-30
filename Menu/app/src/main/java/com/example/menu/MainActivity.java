package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.textView);
        /*
        btn = (Button)findViewById(R.id.red);
        registerForContextMenu(btn);


         */
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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Menu");
        menu.add(0, v.getId(), 0, "Action 1");
        menu.add(0, v.getId(), 0, "Action 2");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getTitle() == "Action 1"){
            Toast toast;
            toast = Toast.makeText(this, "Aciton 1",
                    Toast.LENGTH_LONG);
            toast.show();
        } else if (item.getTitle() == "Action 2"){
            Toast toast;
            toast = Toast.makeText(this, "Aciton 1",
                    Toast.LENGTH_LONG);
            toast.show();
        }else {
            return false;
        }
        return true;
    }

}
