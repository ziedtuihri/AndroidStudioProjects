package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editPoids, editTaille;
    Button bntHomme, bntFemme;
    TextView txtPI, txtComments;
    int poids, taille, pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPoids = findViewById(R.id.edtPoids);
        editTaille = findViewById(R.id.edtTaille);
        bntHomme = findViewById(R.id.button);
        bntFemme = findViewById(R.id.button2);
        txtPI = findViewById(R.id.textView5);
        txtComments = findViewById(R.id.textView6);

    }

    public void btnHomme(View view) {
        String strpoids, strtaille;
        strpoids = editPoids.getText().toString();
        strtaille = editTaille.getText().toString();
        if((strtaille.equals("") || strpoids.equals("") )){
            Toast toast;
            toast = Toast.makeText(this, "vérifier la saisie ",Toast.LENGTH_LONG);
            toast.show();
        } else {
            // conversion
            poids = Integer.parseInt(strpoids);
            taille = Integer.parseInt(strtaille);
            pi = (taille - 100) - (taille - 150)/4;
            txtPI.setText("votre poids ideal est "+String.valueOf(pi));

            if(pi > poids){
                txtComments.setText("vous devez gagner du poids.");
            } else if(pi<poids) {
                txtComments.setText("vous devez perdre du poids");
            } else {
                txtComments.setText("votre poids est ideal. Braveau");
            }

        }
        }
    }

