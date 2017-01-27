package com.example.android.kuklee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    MediaPlayer mySound;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mySound = MediaPlayer.create(MainActivity.this, R.raw.kukle);
            ImageButton button = (ImageButton) findViewById(R.id.imageButton);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    try {
                        mySound.start();
                    } catch (NullPointerException e) {
                        mySound = MediaPlayer.create(MainActivity.this, R.raw.kukle);
                    }
                }
            });

}}
