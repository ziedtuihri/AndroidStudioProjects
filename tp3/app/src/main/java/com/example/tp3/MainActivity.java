package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    EditText ecran;
    ImageButton b0;
    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;
    ImageButton b7;
    ImageButton b8;
    ImageButton b9;
    ImageButton buttonPlus;
    ImageButton buttonMoins;
    ImageButton buttonDiv;
    ImageButton buttonMul;

    private boolean update = false;
    private String operateur = "";
    private double chiffre1;
    private boolean clicOperateur = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b0 =  findViewById(R.id.id0);
        b1 =  findViewById(R.id.id1);
        b2 =  findViewById(R.id.id2);
        b3 =  findViewById(R.id.id3);
        b4 =  findViewById(R.id.id4);
        b5 =  findViewById(R.id.id5);
        b6 =  findViewById(R.id.id6);
        b7 =  findViewById(R.id.id7);
        b8 =  findViewById(R.id.id8);
        b9 =  findViewById(R.id.id9);

        buttonPlus =  findViewById(R.id.id_3);
        buttonMoins =  findViewById(R.id.id_1);
        buttonMul = findViewById(R.id.id_2);
        buttonDiv =  findViewById(R.id.id_4);


        ecran = findViewById(R.id.edtNumber);



        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("0");
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("9");
            }
        });

    }

    public void chiffreClick(String str) {
        if (update) {
            update = false;
        } else {
            if (!ecran.getText().equals("0"))
                str = ecran.getText() + str;
        }
        ecran.setText(str);
    }






}

