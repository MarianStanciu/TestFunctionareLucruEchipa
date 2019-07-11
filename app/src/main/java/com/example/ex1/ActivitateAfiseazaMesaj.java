package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitateAfiseazaMesaj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_afiseaza_mesaj);
        Intent intent = getIntent();
        String mesaj = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText(mesaj);
    }
}
