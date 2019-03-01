package com.example.threesongs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongOneActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_one);
        button = findViewById(R.id.btnPlay);
        button.setOnClickListener(bPlay);
    }
    Button.OnClickListener bPlay = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            
        }
    };
}
