package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class haronCehennem extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haron_cehennem);

        this.setTitle("Haron Cehennem Kayıkçısı");

        makale = findViewById(R.id.tv5);
        makale.setText("Antakya bölgesinin en ilginç doğal güzelliklerinden biri olan Haron Cehennem Kayıkçısı, St. Pierre Kilisesi’ne yani Antakya – Reyhanlı yoluna 10 dakika mesafededir. İlçeden kalkan otobüs ve minibüs seçeneklerinin yanı sıra özel taksi hizmeti ile de bu doğal güzelliği görebilirsiniz.\n" +
                "Haron Cehennem Kayıkçısı, Helenistik dönemden kalan bir kaya kabartması eseridir. Devasa kayaların yontulması ile birlikte bir eser elde edilmiştir ve bu esere mitolojide “Cehennem Kayıkçısı” ismi verilmiştir.\n" +
                "1. yüzyılda İmparator Antiochus IV döneminde bölgede yayılan veba salgınını durdurması için ilahlar adına yontulmaya başlanan bu kabartmanın yapımı, salgın sona erince yarıda bırakılmıştır. Etrafındaki yeşillik bölge ve yüzlerce yıllık tarihi ile görmeniz gereken doğal güzelliklerden biri olarak Haron Cehennem Kayıkçısı da Antakya ilçesi içerisinde yer almaktadır.");

        don = findViewById(R.id.don13);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(haronCehennem.this, AntakyaTarih.class);
                startActivity(intent);
            }
        });
    }
}