package com.snovia.alphabetslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.lang.reflect.Array;

public class Activity_Audio extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__audio);
        GridView gridView= findViewById(R.id.gridView);

        final String[] letters = new String[] {
                "Aa", "Bb", "Cc", "Dd", "Ee",
                "Ff", "Gg", "Hh", "Ii", "Jj",
                "Kk", "Ll", "Mm", "Nn", "Oo",
                "Pp", "Qq", "Rr", "Ss", "Tt",
                "Uu", "Vv", "Ww", "Xx", "Yy", "Zz"};

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.row, letters);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.a);
                       mp.start();
                       break;
                   case 1:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.b);
                       mp.start();
                       break;
                   case 2:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.c);
                       mp.start();
                       break;
                   case 3:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.d);
                       mp.start();
                       break;
                   case 4:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.e);
                       mp.start();
                       break;
                   case 5:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.f);
                       mp.start();
                       break;
                   case 6:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.g);
                       mp.start();
                       break;
                   case 7:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.h);
                       mp.start();
                       break;
                   case 8:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.i);
                       mp.start();
                       break;
                   case 9:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.j);
                       mp.start();
                       break;
                   case 10:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.k);
                       mp.start();
                       break;
                   case 11:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.l);
                       mp.start();
                       break;
                   case 12:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.m);
                       mp.start();
                       break;
                   case 13:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.n);
                       mp.start();
                       break;
                   case 14:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.o);
                       mp.start();
                       break;
                   case 15:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.p);
                       mp.start();
                       break;
                   case 16:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.q);
                       mp.start();
                       break;
                   case 17:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.r);
                       mp.start();
                       break;
                   case 18:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.s);
                       mp.start();
                       break;
                   case 19:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.t);
                       mp.start();
                       break;
                   case 20:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.u);
                       mp.start();
                       break;
                   case 21:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.v);
                       mp.start();
                       break;
                   case 22:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.w);
                       mp.start();
                       break;
                   case 23:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.x);
                       mp.start();
                       break;
                   case 24:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.y);
                       mp.start();
                       break;
                   case 25:
                       mp = MediaPlayer.create(getApplicationContext(),R.raw.z);
                       mp.start();
                       break;
                   default:
                       break;
               }
            }
        });

    }
}