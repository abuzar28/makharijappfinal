package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Practice extends AppCompatActivity {

    Button btnback, btnHalqiyah, btnlahatiyah, btntarfiyah, btnshahjariyah, btnlisaveyah, btnniteyah, btnghunna;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        img=findViewById(R.id.imgpractice);
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
                img.setImageResource(R.drawable.halqiyahiiamge);
            }
        });
        btnlahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              img.setImageResource(R.drawable.lahatiyahimage);
            }
        });
       btntarfiyah.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               img.setImageResource(R.drawable.tarfiyahimage);
           }
       });
        btnniteyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img.setImageResource(R.drawable.niteyahimage);
                            }
        });
        btnshahjariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.shajariyahhaafiyahimage);
            }
        });
        btnlisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.lisaveyahimage);
            }
        });
        btnghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.ghunnaimage);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.practice:
                Intent intent =new Intent(Practice.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                Intent intent1 =new Intent(Practice.this,Quiz.class);
                startActivity(intent1);
                break;
            default:
                break;


        }
return true;
    }
}