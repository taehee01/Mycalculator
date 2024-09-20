package com.example.mycalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GeomertyCircleActivity extends AppCompatActivity {
    Button btnCalculator;
    EditText editRadius;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_geomerty_circle);
        btnCalculator = findViewById(R.id.btnCircleResult);
        editRadius = findViewById(R.id.editCircleR);
        textResult = findViewById(R.id.textCircleResult);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double R= Double.parseDouble(editRadius.getText().toString());
                double result = R*R*3.141592;
                textResult.setText(""+result);
            }
        });
    }
}