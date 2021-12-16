package com.example.soundbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        Context context = getApplicationContext();
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.fart);

        btn.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      //Toast toast = Toast.makeText(context, "j'ai cliqué sur le bouton.", Toast.LENGTH_SHORT);
                                      //toast.show();
                                      Intent intent = new Intent(MainActivity.this, ContactActivity.class );
                                      startActivity(intent);
                              }

        });
    }
}