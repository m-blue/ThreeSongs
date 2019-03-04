package com.example.threesongs;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongThreeActivity extends AppCompatActivity {

    Button btnPlay,btnBack;
    MediaPlayer mpSong;
    int playing = 0;
    TextView txtDescription;
    String description = "  I discovered about The Blind Guardian fairly recently so I haven't been able to check their whole discography." +
            "Even so, The Bards Song is something I've been finding myself play on repeat." +
            "The song is sort of a two-parter based of JRR Tolkien's The Hobbit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_three);
        btnPlay = findViewById(R.id.btnPlay);
        btnBack = findViewById(R.id.btnBack);
        txtDescription = findViewById(R.id.txtDescription);
        btnPlay.setOnClickListener(bPlay);
        mpSong = new MediaPlayer();
        mpSong = MediaPlayer.create(this,R.raw.the_bards_song_in_the_forest);
        playing = 0;

        txtDescription.setText(description);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSong.stop();
                startActivity(new Intent(SongThreeActivity.this,MainActivity.class));
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
