package com.example.abdullahhalil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Ana Menü");

        list = findViewById(R.id.list);

        final List<String> buttonLabels = Arrays.asList("Antakyanın Tarihi", "Antakyanın Tarihi Yerleri", "Antakyanın Yöresel Yemekler", "Antakyanın Yöresel Tatlılar");

        ButtonListAdapter adapter = new ButtonListAdapter(this, buttonLabels, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = (int) v.getTag();
                String label = buttonLabels.get(position);

                Toast.makeText(MainActivity.this, "Clicked " + label, Toast.LENGTH_SHORT).show();

                // Perform different tasks based on the clicked button
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, AntakyaGenelinde.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, AntakyaTarih.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, AntakyaYemek.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, AntakyaTatli.class);
                        startActivity(intent3);
                        break;
                }
            }
        });

        list.setAdapter(adapter);
    }

    private class ButtonListAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final List<String> buttonLabels;
        private final View.OnClickListener buttonClickListener;

        public ButtonListAdapter(Context context, List<String> buttonLabels, View.OnClickListener buttonClickListener) {
            super(context, -1, buttonLabels);
            this.context = context;
            this.buttonLabels = buttonLabels;
            this.buttonClickListener = buttonClickListener;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Button btn;

            if (convertView == null) {
                btn = new Button(context);
                btn.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
            } else {
                btn = (Button) convertView;
            }

            String label = getItem(position);
            btn.setText(label);
            btn.setTag(position);
            btn.setOnClickListener(buttonClickListener);

            btn.setTextSize(24);
            btn.setGravity(Gravity.LEFT);
            btn.setAllCaps(false);

            return btn;
        }
    }
}