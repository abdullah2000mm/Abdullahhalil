package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AntakyaYemek extends AppCompatActivity {
    Button btn, btn1, btn2, don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atntakya_yemek);

        this.setTitle("Antakyada Yöresel Yemekler");

        btn = (Button) findViewById(R.id.btn8);
        btn1 = (Button) findViewById(R.id.btn9);
        btn2 = (Button) findViewById(R.id.btn10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mahsi = new Intent(AntakyaYemek.this, sihilMahsi.class);
                startActivity(mahsi);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kebab= new Intent(AntakyaYemek.this, kebab.class);
                startActivity(kebab);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ekmek = new Intent(AntakyaYemek.this, ekmek.class);
                startActivity(ekmek);
            }
        });

        don = findViewById(R.id.don2);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AntakyaYemek.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}