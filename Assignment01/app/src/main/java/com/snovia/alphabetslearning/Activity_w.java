package com.snovia.alphabetslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_w extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w);

        ImageView imageView= findViewById(R.id.imageView22);
        imageView.animate().rotation(720).setDuration(1000);

        mp = MediaPlayer.create(this,R.raw.ww);
        mp.start();
    }
    public void play(View view) {
        mp.start();
    }

    public void back(View view) {
        Intent intent= new Intent(this,Activity_v.class);
        startActivity(intent);
    }

    public void forward(View view) {
        Intent intent= new Intent(this,Activity_x.class);
        startActivity(intent);
    }
}