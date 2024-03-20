package com.example.pemmob2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnexplicit = findViewById(R.id.btnbmi);
        Button btnimplicit = findViewById(R.id.linkig);

        //set on click listener pada button
        btnexplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perintah Intent Explicit pindah halaman ke activity lain
                startActivity(new Intent(Home.this, BeratBadanIdeal.class));
            }
        });

        //set on click listener pada button
        btnimplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perintah Intent Implicit untuk share ke sosmed
                Intent intent = new Intent(Intent.ACTION_SEND);
                // Membawa data / pesan yang ingin dishare
                intent.putExtra(intent.EXTRA_TEXT,"Hallo saya share ke sosial media https://play.google.com/store/apps/details?id=com.instagram.android");
                intent.setType("text/plain");
                // Menjalankan perintah Intent Implicit
                startActivity(Intent.createChooser(intent,"Share to :"));
            }
        });

    }
}