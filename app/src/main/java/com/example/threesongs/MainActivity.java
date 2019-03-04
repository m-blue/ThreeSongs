package com.example.threesongs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSong1, btnSong2, btnSong3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSong1 = findViewById(R.id.btnSong1);
        btnSong2 = findViewById(R.id.btnSong2);
        btnSong3 = findViewById(R.id.btnSong3);

        btnSong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SongOneSplash.class));
            }
        });

        btnSong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SongTwoSplash.class));
            }
        });

        btnSong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SongThreeSplash.class));
            }
        });
    }
}
