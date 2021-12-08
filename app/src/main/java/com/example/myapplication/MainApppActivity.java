package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainApppActivity extends AppCompatActivity {

    Button buttonPractice,buttonQuizExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_appp);


        buttonPractice=(Button) findViewById(R.id.btnPractice);
        buttonQuizExam=(Button) findViewById(R.id.btnExam) ;

        buttonPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainApppActivity.this, Practice.class);
                startActivity(intent);

            }

        });
        buttonQuizExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainApppActivity.this, Quiz.class);
                startActivity(intent);
            }
        });

    }
}