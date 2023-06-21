package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sihilMahsi extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sihil_mahsi);

        this.setTitle("Şıhıl Mahşı");

        makale = findViewById(R.id.tv6);
        makale.setText("Şıhıl Mahşi, Zahter Salatası (Kekik Salatası), Hatay Kağıt Kebabı, Mualla Yemeği, Hatay Ekşileme, Biberli Ekmek, Ispanak Borani, Sireysil, Mahluta Çorbası, Tepsi Kebabı, Hatay Usulü Kısır, Şam Tatlısı (Şambali), Peynirli Biberli Ekmek, Antakya Usulü Kısır, Hazır Yufkadan Tavada Tereyağlı Fıstıklı Katmer, seçtiğimiz tariflerin bazıları. Özetle, 15 adet tarif tam olarak aradığınız konu ile ilgili olarak özel olarak seçilmiştir.");

        don = findViewById(R.id.don6);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sihilMahsi.this, AntakyaYemek.class);
                startActivity(intent);
            }
        });
    }
}