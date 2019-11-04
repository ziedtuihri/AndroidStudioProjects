package com.example.poidsideal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editPoids, editTaille;
    Button bntHomme, btnFemme;
    TextView txtPI, txtComments;
    int poids, taille, pi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editPoids = findViewById(R.id.edtPoids);
        editTaille = findViewById(R.id.edtTaille);
        bntHomme = findViewById(R.id.bntHomme);
        btnFemme = findViewById(R.id.btnFemme);
        txtPI = findViewById(R.id.txtPI);
        txtComments = findViewById(R.id.txtComments);

    }

    //click sur bouton home

    public void btnhommeClick(View view){
        String strpoids, strtaille;
        strpoids = editPoids.getText().toString();
        strtaille = editTaille.getText().toString();

        if((strtaille.equals("") || strpoids.equals("") )){
            Toast toast;
            toast = Toast.makeText(this, "Vérifier que vous avez saisi les paramétres ! ",
                    Toast.LENGTH_LONG);
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

    //click sur le second bouton
    public void btnfemmeClick(View view){


    }

}
