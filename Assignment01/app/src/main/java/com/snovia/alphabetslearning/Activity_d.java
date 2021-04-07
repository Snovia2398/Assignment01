package com.snovia.alphabetslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_d extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        ImageView imageView= findViewById(R.id.imageView3);
        imageView.animate().rotation(720).setDuration(1000);

        mp = MediaPlayer.create(this,R.raw.dd);
        mp.start();
    }
    public void play(View view) {
        mp.start();
    }

    public void back(View view) {
        Intent intent= new Intent(Activity_d.this,Activity_c.class);
        startActivity(intent);
    }

    public void forward(View view) {
        Intent intent= new Intent(Activity_d.this,Activity_e.class);
        startActivity(intent);
    }
}