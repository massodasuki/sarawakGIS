package com.example.masso.sarawaktour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Tempat_tamangambir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat_tamangambir);
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

                Intent intent = new Intent(getApplicationContext(), Tempat_tugu.class);
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

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        // --- End Button "Kebelakang" ---


        // -- Start Button "Lokasi" Instance
        Button btnLoc = (Button) findViewById(R.id.lokasi);
        // Button "Lokasi" Event Handling
        btnLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Lokasi dengan marker
                double latitude = 1.5805108 ;
                double longtitude = 110.1131894;

                String label = "Taman Negara Gambir";
                String uriBegin = "geo:"+latitude+","+longtitude;
                String query = latitude +","+longtitude+"("+label+")";
                String endcodeQuery = Uri.encode(query);
                String uriString = uriBegin + "?q="+endcodeQuery + "?z=16";
                Uri uri = Uri.parse(uriString);
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent2);
                // Lokasi dengan marker tamat


            /* Lokasi Dengan Google Map
                Intent intent = null,  chooser = null;

                intent = new Intent(Intent.ACTION_VIEW);
                //Ubah Geo untuk tetapkan lokasi
                intent.setData(Uri.parse("geo:1.5805108,110.1131894"));
                chooser = Intent.createChooser(intent, "Aktifkan Peta");
                startActivity(chooser); */

            }
        });


        // --- End Button "Lokasi" ---
    }
}
