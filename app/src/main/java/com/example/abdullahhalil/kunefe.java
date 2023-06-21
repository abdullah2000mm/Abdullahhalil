package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kunefe extends AppCompatActivity {
    TextView makale;
    Button don;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunefe);

        this.setTitle("Künefe");

        makale = findViewById(R.id.tv10);
        makale.setText("Lezzetini özel, tuzsuz Antakya peynirinden alan künefe yörenin en meşhur, en sevilen lezzetidir desek yanılmış olmayız. Küçük bir sini içerisinde bir kat kadayıf, bir kat peynir ve tekrar bir kat kadayıfın iyice sıkıştırılarak pişirilmesi ile hazırlanan künefe sıcak şerbet ile tatlandırılır. Sıcak sıcak servis edilir.");

        don = findViewById(R.id.don4);
        don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kunefe.this, AntakyaTatli.class);
                startActivity(intent);
            }
        });
    }
}