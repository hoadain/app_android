package com.example.appweb;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SolveEquationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve_equation);

        EditText inputA = findViewById(R.id.inputA);
        EditText inputB = findViewById(R.id.inputB);
        EditText inputC = findViewById(R.id.inputC);
        Button btnSolve = findViewById(R.id.btnSolve);
        TextView result = findViewById(R.id.result);

        btnSolve.setOnClickListener(view -> {
            double a = Double.parseDouble(inputA.getText().toString());
            double b = Double.parseDouble(inputB.getText().toString());
            double c = Double.parseDouble(inputC.getText().toString());
            double delta = b * b - 4 * a * c;
            if (delta >= 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result.setText("Nghiệm: x1 = " + x1 + ", x2 = " + x2);
            } else {
                result.setText("Phương trình vô nghiệm");
            }
        });
    }
}