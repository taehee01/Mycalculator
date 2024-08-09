package com.example.mycalculator;

import android.os.Bundle;
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
        denominator3 = findViewById(R.id.numerator3);
        denominator4 = findViewById(R.id.numerator4);

        btnConvert1 = findViewById(R.id.btnConvert1);
        btnConvert2 = findViewById(R.id.btnConvert2);
    }
}