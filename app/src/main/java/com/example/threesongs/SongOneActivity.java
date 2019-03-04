package com.example.threesongs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongOneActivity extends AppCompatActivity {

    Button btnPlay,btnBack;
    MediaPlayer mpSong;
    int playing = 0;
    TextView txtDescription;
    String description = "  For Number 1, I gotta go with a classic. Especially with the new" +
            "movie currently in theaters, this song has been on my mind for the past several weeks";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_one);
        btnPlay = findViewById(R.id.btnPlay);
        btnBack = findViewById(R.id.btnBack);
        txtDescription = findViewById(R.id.txtDescription);
        btnPlay.setOnClickListener(bPlay);
        mpSong = new MediaPlayer();
        mpSong = MediaPlayer.create(this,R.raw.bohemian_rhapsody);
        playing = 0;

        txtDescription.setText(description);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSong.stop();
                startActivity(new Intent(SongOneActivity.this,MainActivity.class));
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

