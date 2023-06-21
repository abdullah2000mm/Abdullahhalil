package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class antakyaKombesi extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antakya_kombesi);

        this.setTitle("Antakya Kömbesi");

        makale = findViewById(R.id.tv9);
        makale.setText("Hatay'ın En Meşhur Tatlısı: Hatay denilince elbette ilk akla gelen tatlı çeşidi künefedir. Bununla birlikte listemizde de yer verdiğimiz Antakya kömbesi, haytalı, kerebiç ve kireçte kabak tatlıları Hatay gezilerinde mutlaka tadılan lezzetler arasında yer almaktadır.");

        don = findViewById(R.id.don9);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antakyaKombesi.this, AntakyaTatli.class);
                startActivity(intent);
            }
        });
    }
}