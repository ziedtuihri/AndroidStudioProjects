package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editPoids, editTaille;
    Button idButton;
    TextView textView6, poids, taille, textView7;
    RadioButton rd1, rd2;
    Integer pi, taille2, poids2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taille = findViewById(R.id.idTaille);
        poids = findViewById(R.id.idPoids);
        editPoids = findViewById(R.id.editPoids);
        editTaille = findViewById(R.id.editTaille);
        idButton = findViewById(R.id.idButton);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        rd1 = findViewById(R.id.idHomme);
        rd2 = findViewById(R.id.idFemme);

    }

    public void idButton(View view) {


        String strpoids, strtaille;
        strpoids = editPoids.getText().toString();
        strtaille = editTaille.getText().toString();

        if ((strtaille.equals("") || strpoids.equals(""))) {
            Toast toast;
            toast = Toast.makeText(this, "Vérifier que vous avez saisi les paramétres ! ",
                    Toast.LENGTH_LONG);
            toast.show();
        } else {
            // conversion
            poids2 = Integer.parseInt(strpoids);
            taille2 = Integer.parseInt(strtaille);
            pi = (taille2 - 100) - (taille2 - 150) / 4;
            textView6.setText("votre poids ideal est " + String.valueOf(pi));

            if (pi > poids2) {
                textView7.setText("vous devez gagner du poids.");
            } else if (pi < poids2) {
                textView7.setText("vous devez perdre du poids");
            } else {
                textView7.setText("votre poids est ideal. Braveau");
            }
        }
        if(rd1.isChecked() == true ){
            textView7.setText("votre poids est ideal. Braveau");
        } else if(rd2.isChecked() == false ) {
            textView7.setText("votre poids est ideal. Braveau");
        }
    }


    }



