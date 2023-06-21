package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class uluCami extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulu_cami);

        this.setTitle("Ulu Camii");

        makale = findViewById(R.id.tv1);
        makale.setText("Antakya’da yer alan ve Hatay’ın en önemli camisi olarak görülen Ulu Cami, ilçenin merkezinde bulunmaktadır. Antakya ilçe merkezindeyken yürüyerek dahi Uzun Çarşı Caddesi’ndeki Ulu Camii’ye gidebilirsiniz.\n" +
                "Duvarlarında altın harfler ile yazılmış ayetlerin bulunduğu, içine kıymetli halıların yer aldığı Ulu Camii, Antakya ve Hatay’ın en eski camisi olma özelliğini taşımaktadır. 16. yüzyılda yapıldığı düşünülen bu caminin mimarisinde Selçuklu tarzının önemli etkisi vardır. Düz çatılı olan ve tarihi önemi ile dikkat çeken Ulu Camii, Osmanlı döneminde de birkaç kez onarım görmüş bir yapıdır.\n" +
                "1872 depreminden sonra da onarılan bu camide yer alan bir kitabede bu onarımın 1874 yılında yapıldığı yazılmıştır. Antakya’nın ve Hatay’ın en önemli tarihi eserlerinden biri haline gelmiş olan Ulu Camii, ilçeyi ziyaretinizde mutlaka görmeniz gereken yerlerden biridir.");

        don = findViewById(R.id.don7);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(uluCami.this, AntakyaTarih.class);
                startActivity(intent);
            }
        });
    }
}