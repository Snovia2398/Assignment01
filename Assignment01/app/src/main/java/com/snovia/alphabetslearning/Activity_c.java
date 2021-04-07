package com.snovia.alphabetslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_c extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        ImageView imageView= findViewById(R.id.imageView2);
        imageView.animate().rotation(720).setDuration(1000);

        mp = MediaPlayer.create(this,R.raw.cc);
        mp.start();
    }
    public void play(View view) {
        mp.start();
    }

    public void back(View view) {
        Intent intent= new Intent(Activity_c.this,Activity_b.class);
        startActivity(intent);
    }

    public void forward(View view) {
        Intent intent= new Intent(Activity_c.this,Activity_d.class);
        startActivity(intent);
    }
}