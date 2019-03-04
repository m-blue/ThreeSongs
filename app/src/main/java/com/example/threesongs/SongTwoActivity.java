package com.example.threesongs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongTwoActivity extends AppCompatActivity {

    Button btnPlay,btnBack;
    MediaPlayer mpSong;
    int playing = 0;
    TextView txtDescription;
    String description = "  I have been a fan of Gorillaz for at least a decade and this song is one of my favorites. " +
            "Just like in the name, there is a nice relaxing melancholy feel to the whole song." +
            "It's just a nice song man.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_two);
        btnPlay = findViewById(R.id.btnPlay);
        btnBack = findViewById(R.id.btnBack);
        txtDescription = findViewById(R.id.txtDescription);
        btnPlay.setOnClickListener(bPlay);
        mpSong = new MediaPlayer();
        mpSong = MediaPlayer.create(this,R.raw.melancholy_hill);
        playing = 0;

        txtDescription.setText(description);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSong.stop();
                startActivity(new Intent(SongTwoActivity.this,MainActivity.class));
            }
        });
    }
    Button.OnClickListener bPlay = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            switch (playing)
            {
                case 0:
                    mpSong.start();
                    playing = 1;
                    btnPlay.setText("Pause Song");
                    break;
                case 1:
                    mpSong.pause();
                    playing = 0;
                    btnPlay.setText("Play Song");
                    break;
            }

        }
    };

}

