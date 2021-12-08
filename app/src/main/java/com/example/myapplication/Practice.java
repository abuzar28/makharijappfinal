package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practice extends AppCompatActivity {

    Button btnback, btnHalqiyah, btnlahatiyah, btntarfiyah, btnshahjariyah, btnlisaveyah, btnniteyah, btnghunna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        btnback = (Button) findViewById(R.id.btnback);
        btnHalqiyah = (Button) findViewById(R.id.btnHalqiyah);
        btnlahatiyah = (Button) findViewById(R.id.btnLahatiyah);
        btntarfiyah = (Button) findViewById(R.id.btnTarfiyahtest);
        btnshahjariyah = (Button) findViewById(R.id.btnShajariyahHaafiyah);
        btnlisaveyah = (Button) findViewById(R.id.btnLisaveyah);
        btnniteyah = (Button) findViewById(R.id.btnNiteeyah);
        btnghunna = (Button) findViewById(R.id.btnGhunna);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , MainApppActivity.class);
                startActivity(intent);
            }
        });

        btnHalqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , Halqiyah.class);
                startActivity(intent);
            }
        });
        btnlahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , Lahatiya.class);
                startActivity(intent);
            }
        });
       btntarfiyah.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Practice.this,Tarifiya.class);
               startActivity(intent);
           }
       });
        btnniteyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , Nehtiya.class);
                startActivity(intent);
            }
        });
        btnshahjariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , Hafiyah.class);
                startActivity(intent);
            }
        });
        btnlisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , Leh.class);
                startActivity(intent);
            }
        });
        btnghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practice.this
                        , Gunnah.class);
                startActivity(intent);
            }
        });
    }
}