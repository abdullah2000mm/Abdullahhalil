package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class antakyaKalesi extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antakya_kalesi);

        this.setTitle("Antakya Kalesi");

        makale = findViewById(R.id.tv4);
        makale.setText("Antakya’nın ilçe merkezine 3 km uzaklıkta, Habib Neccar Dağı’nın yamaçlarında bulunan Antakya Kalesi, şehrin en eski tarihi yapılarından biridir. Antakya Kalesi’ni ziyaret etmek için ilçe merkezinden kalkan otobüs ve minibüsleri kullanabilir veya özel taksi hizmeti ile kısa sürede kaleye varabilirsiniz.\n" +
                "M.Ö. 300 yıllarında yapıldığı bilinen bu kale, Büyük İskender’in generallerinden biri olan Seleucos 1. Nikator tarafından kurulmuştur. Dünyanın önemli yapıları arasında bulunan ve Seleukoslar, Romalıkar, Selçuklular ve Osmanlılar gibi devletler tarafından kullanılan bu kalenin 12 kilometre uzunluğunda olduğu araştırmacılar tarafından saptanmıştır.\n" +
                "Yaşanan pek çok deprem ve savaşın ardından önemli derecede harap olan ve günümüze yalnızca bir bölümü ulaşabilmiş olan Antakya Kalesi’nin bugünlerde ziyaret edilebilen bölümü, M.S. 6. yüzyılda Bizans İmparatorlarından biri olan Justianus tarafından inşa ettirilmiştir. Kalenin yalnızca Habib – i Neccar Dağı üzerindeki bölümleri kalmış olsa da tarihi ile Türkiye’nin ve dünyanın en önemli yapıları arasında bulunmaktadır.");

        don = findViewById(R.id.don10);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antakyaKalesi.this, AntakyaTarih.class);
                startActivity(intent);
            }
        });
    }
}