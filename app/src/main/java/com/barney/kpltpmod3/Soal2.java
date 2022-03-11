package com.barney.kpltpmod3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Soal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        TextView txtState = findViewById(R.id.txtState);
        txtState.setText("idle");

        Button btn1 = findViewById(R.id.btnBuka);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtState.setText("terbuka");
            }
        });

        Button btn2 = findViewById(R.id.btnKunci);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtState.setText("terkunci");
            }
        });
    }
}