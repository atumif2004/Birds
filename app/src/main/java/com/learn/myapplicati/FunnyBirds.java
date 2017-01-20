package com.learn.myapplicati;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FunnyBirds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameView(this));
    }
}
