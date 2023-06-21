package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ekmek extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekmek);

        this.setTitle("Ispanaklı Ekmek (Katıklı Ekmek)");

        makale = findViewById(R.id.tv8);
        makale.setText("İncecik lahmacun hamuruna benzer bir hamur üzerine ıspanak, çökelek, salça ve çeşitli baharatların, otların enfes karışımı sürülür, ortaya ıspanaklı ya da bir diğer adıyla katıklı ekmek çıkar. Taş fırınlarda pişen tarif, Antakya sofralarının olmazsa olmazlarındandır. Kimi zaman ıspanaksız haline de rastlanılabilir.");

        don = findViewById(R.id.don11);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ekmek.this, AntakyaYemek.class);
                startActivity(intent);
            }
        });
    }
}