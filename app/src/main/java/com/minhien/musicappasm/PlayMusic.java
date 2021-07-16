package com.minhien.musicappasm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import soup.neumorphism.NeumorphImageView;

public class PlayMusic extends AppCompatActivity {

    NeumorphImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);

        back = findViewById(R.id.imageMenu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlayMusic.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}