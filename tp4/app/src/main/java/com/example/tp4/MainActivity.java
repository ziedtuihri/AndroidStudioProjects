package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputa,inputb;
    Button plusB,sustractionB,foisB,divB;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputa = findViewById(R.id.editText1);
        inputb = findViewById(R.id.editText2);
        plusB = findViewById(R.id.plusB);
        sustractionB = findViewById(R.id.sustractionB);
        foisB = findViewById(R.id.foisB);
        divB = findViewById(R.id.divB);
        textView = findViewById(R.id.textView);


    }

    public void plusClick(View view){
        String a,b;
        Integer r,k;

        a = inputa.getText().toString();
        b = inputb.getText().toString();
        k = Integer.parseInt(a);
        r = Integer.parseInt(b);
        textView.setText("votre resultat =   "+(k + r));

    }

    public void mClick(View view){
        String a,b;
        Integer r,k;

        a = inputa.getText().toString();
        b = inputb.getText().toString();
        k = Integer.parseInt(a);
        r = Integer.parseInt(b);
        textView.setText("votre resultat =   "+(k - r));

    }

    public void fClick(View view){
        String a,b;
        Integer r,k;

        a = inputa.getText().toString();
        b = inputb.getText().toString();
        k = Integer.parseInt(a);
        r = Integer.parseInt(b);
        textView.setText("votre resultat =   "+(k * r));

    }

    public void dClick(View view){
        String a,b;
        Integer r,k;

        a = inputa.getText().toString();
        b = inputb.getText().toString();
        k = Integer.parseInt(a);
        r = Integer.parseInt(b);
        textView.setText("votre resultat =   "+(k / r));

    }

}