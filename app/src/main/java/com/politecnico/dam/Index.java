package com.politecnico.dam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Index extends AppCompatActivity {

    ImageButton siguiente;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        mp = MediaPlayer.create(this , R.raw.pika);
        siguiente = findViewById(R.id.imgBtn);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(Index.this , MainActivity.class);
                mp.start();
                startActivity(siguiente);
            }
        });
    }
}