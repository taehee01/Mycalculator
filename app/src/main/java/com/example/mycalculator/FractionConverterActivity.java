package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FractionConverterActivity extends AppCompatActivity {
    EditText nurmerator1;
    EditText nurmerator2;
    EditText nurmerator3;
    EditText nurmerator4;
    EditText denominator1;
    EditText denominator2;
    EditText denominator3;
    EditText denominator4;
    Button btnConvert1;
    Button btnConvert2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction_converter);
        nurmerator1 = findViewById(R.id.numerator1);
        nurmerator2 = findViewById(R.id.numerator2);
        nurmerator3 = findViewById(R.id.numerator3);
        nurmerator4 = findViewById(R.id.numerator4);

        denominator1 = findViewById(R.id.denominator1);
        denominator2 = findViewById(R.id.denominator2);
        denominator3 = findViewById(R.id.denominator3);
        denominator4 = findViewById(R.id.denominator4);

        btnConvert1 = findViewById(R.id.btnConvert1);
        btnConvert2 = findViewById(R.id.btnConvert2);

        btnConvert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nurmerator1.getText().toString().compareTo("")!=0 && denominator1.getText().toString().compareTo("")!=0){
                    int gcd = GCD(Integer.parseInt((nurmerator1.getText().toString())), Integer.parseInt(denominator1.getText().toString()));
                    nurmerator3.setText(""+(Integer.parseInt(nurmerator1.getText().toString())/gcd));
                    denominator3.setText(""+(Integer.parseInt(denominator1.getText().toString())/gcd));
                }
                if(nurmerator2.getText().toString().compareTo("")!= 0 && denominator2.getText().toString().compareTo("") != 0){
                    int gcd = GCD(Integer.parseInt((nurmerator2.getText().toString())), Integer.parseInt(denominator2.getText().toString()));
                    nurmerator4.setText(""+(Integer.parseInt(nurmerator2.getText().toString())/gcd));
                    denominator4.setText(""+(Integer.parseInt(denominator2.getText().toString())/gcd));
                }
            }
        });



    }
    int GCD(int a, int b){
        int min = 0;
        if(a > b)
            min = b;
        else
            min = a;
        for(int i = min; i>=1; i--){
            if(a%i == 0 && b%i ==0){
                return i;
            }
        }
        return 1;
    }
    int LCM(int a, int b){
        int gcd = GCD(a,b);
        return a*b / gcd;
    }
}