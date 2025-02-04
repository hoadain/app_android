package com.example.appweb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInfo = findViewById(R.id.btnInfo);
        Button btnSolveEquation = findViewById(R.id.btnSolveEquation);

        // Chuyển sang màn hình thông tin cá nhân
        btnInfo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        });

        // Chuyển sang màn hình giải phương trình bậc 2
        btnSolveEquation.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SolveEquationActivity.class);
            startActivity(intent);
        });
    }
}
