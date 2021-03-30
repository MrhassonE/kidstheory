package com.dsciq.kisdtheory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class newt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newt);
    }

    public void nex(View view) {
        Intent intent = new Intent(newt.this,newt1.class);
        startActivity(intent);
    }
}