package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView t1;
    Button b1;
    Integer som,i,j;
    RadioButton r1,r2,r3,r4,r5,r6;
    CheckBox r7,r8,r9,r10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        t1 = findViewById(R.id.t1);
        b1 = findViewById(R.id.b1);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);
        r6 = findViewById(R.id.r6);


        r7 = findViewById(R.id.r7);
        r8 = findViewById(R.id.r8);
        r9 = findViewById(R.id.r9);
        r10 = findViewById(R.id.r10);

    }

    public void clickB(View view) {
        String ch = editText.getText().toString();
        Integer k=0, i, j;
        String ch3="";
        if (r1.isChecked()) {
            k += 14;
            ch3="Pizza capi avec les supplements : ";
        }
        if (r2.isChecked()) {
            k += 13;
            ch3="Pizza Laguno avec les supplements : ";
        }
        if (r3.isChecked()) {
            k += 16;
            ch3="Pizza Marguerite avec les supplements : ";
        }
        if (r4.isChecked()) {
            k += 18;
            ch3="Pizza Mexicane avec les supplements : ";
        }
        if (r5.isChecked()) {
            k += 11;
            ch3="Pizza 4 saison  avec les supplements : ";
        }
        if (r6.isChecked()) {
            k += 20;
            ch3="Pizza Spécial  avec les supplements : ";
        }

        if (r7.isChecked()) {
            k += 1;
            ch3 =ch3+"X-chese ";
        }
        if (r8.isChecked()) {
            k += 1;
            ch3 =ch3+"Salami ";
        }
        if (r9.isChecked()) {
            k += 1;
            ch3 =ch3+"Olives ";
        }
        if (r10.isChecked()) {
            k += 2;
            ch3 =ch3+"Bacon ";
        }


        t1.setText("Nom : "+ch+"\n prix : "+k+"\n "+ch3);
    }
        public void popup(String msg){

        Toast toast;
        toast = Toast.makeText(this, msg,
                Toast.LENGTH_LONG);
        toast.show();

    }
}
