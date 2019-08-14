package com.example.alertnow;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mp = MediaPlayer.create(this, R.raw.toque_sino);


    }

    public void playSong(View v){
        mp.start();
    }
    public void pauseSong(View v) {
        mp.pause();
    }

    public void stopSong(View v) {
        mp.stop();
        mp=MediaPlayer.create(this, R.raw.toque_sino);
    }
}
