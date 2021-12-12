package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent = getIntent();

        int count = intent.getIntExtra("count",0);
        int right = intent.getIntExtra("right",1);

        TextView textView= findViewById(R.id.textViewID);

        textView.setText("\n You got "+ right + " / " + count+"");

    }
    public void shareBtnFunction(View view){
        Intent intent = getIntent();
        String message;
        message="\n You got "+ intent.getIntExtra("right",0) + " / " + intent.getIntExtra("count",1);;
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
    public void backMainActivity(View view){
        Intent intent = new Intent(Final.this, MainApppActivity.class);
        startActivity(intent);
        finish();
    }
    }
