package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class neccarCami extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neccar_cami);

        this.setTitle("Habib – i Neccar Camii");

        makale = findViewById(R.id.tv3);
        makale.setText("Antakya’nın merkezinde yer alan ve ilçenin en önemli tarihi yapılarından biri olan Habib – i Neccar Camii, ilçeyi ziyaretinizde mutlaka görmeniz gereken yapılardandır. İlçe merkezindeyken Kurtuluş Caddesi’nde yer alan camiye yürüyerek veya toplu taşıma araçları ile birlikte gidilebilmesi mümkündür.\n" +
                "Türkiye Cumhuriyeti’nin ilk camisi olma özelliğini gösteren Habib – i Neccar Camii, Antakya 638 yılında Müslüman Araplarca alındığında yaptırılmıştır. Camiye ismini veren hikâye, Kur’an-ı Kerim’deki Yasin Suresi’nde geçmektedir. Hz. İsa’nın havarilerine ilk inanan ve bu uğurda canını vermiş olan bir Antakyalının adını taşıyan Habib – i Neccar Camii, ilçenin önemli yapıları arasındadır.\n" +
                "Memlük Hükümdarı Baybars tarafından eski bir tapınağın yerine inşa edildiği bilinen bu yapının kuzeydoğu bölümünde, yerin tam 4 metre altında Habib Neccar ve Şem’un Safa’nın türbeleri yer almaktadır. Giriş bölümünde yer alan türbeler ise Yuhanna ve Pavlos’a aittir. Etrafı medrese odaları ile çevrilmiş olan bu yapının avlusunda yer alan şadırvan, 19. yüzyılda yapılmıştır.");

        don = findViewById(R.id.don5);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(neccarCami.this, AntakyaTarih.class);
                startActivity(intent);
            }
        });
    }
}