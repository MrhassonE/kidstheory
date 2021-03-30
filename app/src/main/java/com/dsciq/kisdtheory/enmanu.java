package com.dsciq.kisdtheory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class enmanu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enmanu);
    }

    public void arka(View view) {
        Intent intent = new Intent(enmanu.this,arka.class);
        startActivity(intent);
    }

    public void newt(View view) {
        Intent intent = new Intent(enmanu.this,newt.class);
        startActivity(intent);
    }

    public void evo(View view) {
        Intent intent = new Intent(enmanu.this,evo.class);
        startActivity(intent);
    }
}