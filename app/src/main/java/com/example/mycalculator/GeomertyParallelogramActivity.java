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

public class GeomertyParallelogramActivity extends AppCompatActivity {
    EditText editParallelogramA;
    EditText editParallelogramB;
    TextView textParallelogramResult;
    Button btnParallelogramResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_geomerty_parallelogram);
        editParallelogramA = findViewById(R.id.editParallelogramA);
        editParallelogramB = findViewById(R.id.editParallelogramB);
        textParallelogramResult = findViewById(R.id.textParallelogramResult);
        btnParallelogramResult = findViewById(R.id.btnParallelogramResult);
        btnParallelogramResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double A= Double.parseDouble(editParallelogramA.getText().toString());
                double B= Double.parseDouble(editParallelogramB.getText().toString());
                double result = A*B/2;
                textParallelogramResult.setText(""+result);
            }
        });
    }
}