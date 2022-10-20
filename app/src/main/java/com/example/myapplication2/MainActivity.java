package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] lstCouleurs={"Rouge","Vert","Bleu","Blanc","Noir"};
        Spinner spin = (Spinner) findViewById(R.id.spinnerCouleurs);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.
                simple_spinner_item, lstCouleurs);
        spin.setAdapter(aa);
    }
}