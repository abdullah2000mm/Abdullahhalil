package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AntakyaTatli extends AppCompatActivity {
    Button btn, btn1, btn2, don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antakya_tatli);

        this.setTitle("Antakyada Yöresel Tatlılar");

        btn = (Button) findViewById(R.id.btn11);
        btn1 = (Button) findViewById(R.id.btn12);
        btn2 = (Button) findViewById(R.id.btn13);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kombe = new Intent(AntakyaTatli.this, antakyaKombesi.class);
                startActivity(kombe);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kunefe= new Intent(AntakyaTatli.this, kunefe.class);
                startActivity(kunefe);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kapakTatlisi = new Intent(AntakyaTatli.this, kitirKapakTatlisi.class);
                startActivity(kapakTatlisi);
            }
        });

        don = findViewById(R.id.don1);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AntakyaTatli.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}