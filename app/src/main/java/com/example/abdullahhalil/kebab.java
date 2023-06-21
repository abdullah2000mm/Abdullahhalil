package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kebab extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebab);

        this.setTitle("Antakya Kâğıt Kebabı");

        makale = findViewById(R.id.tv7);
        makale.setText("Antakya Kâğıt Kebabı; dana döş eti, yeşil ve kırmızı biber (acı veya tatlı) maydanoz, sarımsak, tuz ve karabiber karışımından oluşan, disk şekli verilerek yağlı kağıt üzerinde pişirilen, yörede Arapça olarak “lahme la varka” olarak da bilinen bir kebaptır.");

        don = findViewById(R.id.don3);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kebab.this, AntakyaYemek.class);
                startActivity(intent);
            }
        });
    }
}