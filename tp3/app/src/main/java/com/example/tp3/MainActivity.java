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
    ImageButton buttonC;
    ImageButton buttonEgal;
    ImageButton point;
    ImageButton buttonMod;
    ImageButton buttonDel;

    private boolean update = false;
    private String operateur = "";
    private double chiffre1;
    private boolean clicOperateur = false;
    private String del,str,chp;

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
        buttonC = findViewById(R.id.buttonC);
        buttonEgal = findViewById(R.id.buttonEgal);
        point = findViewById(R.id.point);
        buttonMod = findViewById(R.id.buttonMod);
        buttonDel = findViewById(R.id.buttonDel);

                ecran = findViewById(R.id.edtNumber);

        buttonDel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                delF();
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                modF();
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pointF();
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plusClick();
            }
        });

        buttonMoins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moinsClick();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                divClick();
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mulClick();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resetClick();
            }
        });

        buttonEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });


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
////////////////////////////////////////////////////////////////////////////////////////

    public void modF(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue() / 100;
            ecran.setText(String.valueOf(chiffre1));
            clicOperateur = true;
        }
    }

    public void delF(){
        del = ecran.getText().toString();
        if (update) {
            update = false;
        }
        if(del.substring(0,1) == "0"){
        chp = "0";
        }
        else {
            chp = del.substring(0,del.length()-1);
        }
        ecran.setText(chp);
    }

    public void pointF(){
        chp = ".";
        if (update) {
            update = false;
        } else {
                str = ecran.getText() + chp;
        }
        ecran.setText(str);
    }

    public void plusClick(){

        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }

    public void moinsClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }

    public void mulClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }


    public void divClick(){
        if(clicOperateur){
            calcul();
            ecran.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(ecran.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }

    public void egalClick(){
        calcul();
        update = true;
        clicOperateur = false;
    }

    public void resetClick(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        ecran.setText("");
    }

    private void calcul(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(ecran.getText().toString()).doubleValue();
            ecran.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(ecran.getText().toString()).doubleValue();
                ecran.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                ecran.setText("0");
            }
        }
    }

}

