package com.example.masso.sarawaktour;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Etnik_suku_bidayuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etnik_suku_bidayuh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        // -- Start Button "Teruskan" Instance
        Button btnNext = (Button) findViewById(R.id.next);
        // Button "Teruskan" Event Handling
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Etnik_suku_iban.class);
                startActivity(intent);

            }
        });

        // --- End Button "Teruskan" ---

        // -- Start Button "kebelankang" Instance
        Button btnBack = (Button) findViewById(R.id.back);
        // Button "Kebelankang" Event Handling
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Etnik_suku.class);
                startActivity(intent);

            }
        });

        // --- End Button "Kebelakang" ---
    }
}
