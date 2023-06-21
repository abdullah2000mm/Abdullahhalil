package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AntakyaTarih extends AppCompatActivity {
    Button btn, btn1, btn2, btn3, don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antakya_tarih);

        this.setTitle("Antakyada Tarihi Yerler");

        btn = (Button) findViewById(R.id.btn4);
        btn1 = (Button) findViewById(R.id.btn5);
        btn2 = (Button) findViewById(R.id.btn6);
        btn3 = (Button) findViewById(R.id.btn7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ulucamii = new Intent(AntakyaTarih.this, uluCami.class);
                startActivity(ulucamii);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent habibcamii = new Intent(AntakyaTarih.this, neccarCami.class);
                startActivity(habibcamii);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kale = new Intent(AntakyaTarih.this, antakyaKalesi.class);
                startActivity(kale);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent haron = new Intent(AntakyaTarih.this, haronCehennem.class);
                startActivity(haron);
            }
        });

        don = findViewById(R.id.don8);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AntakyaTarih.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}