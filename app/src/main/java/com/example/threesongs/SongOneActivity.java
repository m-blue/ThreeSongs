package com.example.threesongs;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongOneActivity extends AppCompatActivity {

    Button button;
    MediaPlayer mpSong;
    int playing = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_one);
        button = findViewById(R.id.btnPlay3);
        button.setOnClickListener(bPlay);
        mpSong = new MediaPlayer();
        mpSong = MediaPlayer.create(this,R.raw.bohemian_rhapsody);
        playing = 0;
    }
    Button.OnClickListener bPlay = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch (playing)
            {
                case 0:
                    mpSong.start();
                    playing = 1;
                    break;
                case 1:
                    mpSong.pause();
                    playing = 0;
                    break;
            }

        }
    };
}
