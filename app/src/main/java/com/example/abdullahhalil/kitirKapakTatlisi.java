package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kitirKapakTatlisi extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitir_kapak_tatlisi);

        this.setTitle("Kıtır kabak tatlısı");

        makale = findViewById(R.id.tv11);
        makale.setText("Hatay'da kabak tatlısı şekerleme kıtırlığında kireçte bekletilerek yapılır. Yapım aşamaları diğer kabak tatlılarına göre zahmetli olsa da bizce bir farklılık yapıp bu tarifini de mutlaka denemelisiniz.");

        don = findViewById(R.id.don12);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kitirKapakTatlisi.this, AntakyaTatli.class);
                startActivity(intent);
            }
        });
    }
}