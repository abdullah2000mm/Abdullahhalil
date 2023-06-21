package com.example.abdullahhalil;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AntakyaGenelinde extends AppCompatActivity {
TextView makale;
Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antakya_genelinde);

        this.setTitle("AntakyaGenelinde");

        makale = findViewById(R.id.tv);
        makale.setText("Tarih kaynaklarına göre Antakya, MÖ 300 civarında Büyük İskender'in komutanlarından Seleucus Nicator tarafından kurulmuştur. Antik kaynaklara göre Antakya üç yüz bin nüfusuyla Roma İmparatorluğu'nun 3. dünyanın ise 4. büyük kentiydi.");

        don = findViewById(R.id.don);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AntakyaGenelinde.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}