package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.ex1.MESAJ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// ** Este utilizata atunci cand utilizatorul  apasa butonul Trimite
    public void trimiteMesaj (View view){
        Intent intent = new Intent(this, ActivitateAfiseazaMesaj.class);
        EditText editText  = (EditText) findViewById(R.id.editText);
        String mesaj = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mesaj);
        startActivity(intent);
    }


}
