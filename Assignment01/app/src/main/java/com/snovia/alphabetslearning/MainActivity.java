package com.snovia.alphabetslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Audio(View view) {
        Intent intent= new Intent(this,Activity_Audio.class);
        startActivity(intent);
    }

    public void playSong(View view) {
        Intent intent= new Intent(this,Activity_PlaySong.class);
        startActivity(intent);
    }

    public void alphabets_words(View view) {
        Intent intent= new Intent(this,Activity_a.class);
        startActivity(intent);
    }
}