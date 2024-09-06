package com.example.mycalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GeomertyOptionActivity extends AppCompatActivity {
    Button btnCircle;
    Button btnTrapezoid;
    Button btnParallelogram;
    Button btnTriangle;
    Button btnRhombus;
    ImageView imgMollu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_geomerty_option);
        btnCircle = findViewById(R.id.btnCircle);
        btnParallelogram = findViewById(R.id.btnParallelogram);
        btnTrapezoid = findViewById(R.id.btnTrapezoid);
        btnTriangle = findViewById(R.id.btnTriangle);
        btnRhombus = findViewById(R.id.btnRhombus);
        imgMollu = findViewById(R.id.imageView2);
    }
}