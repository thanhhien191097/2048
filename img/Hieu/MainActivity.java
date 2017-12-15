package com.example.tgdd.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySong,myClick;
    Animation   uptodown,downtoup;
    ImageButton button1,button2,button3;
    ImageView   image1,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sound
        mySong= MediaPlayer.create(MainActivity.this,R.raw.song);
        myClick= MediaPlayer.create(MainActivity.this,R.raw.click);
        //callButtono
        button1 = (ImageButton) findViewById(R.id.playid);
        button2 = (ImageButton) findViewById(R.id.storeid);
        button3 = (ImageButton) findViewById(R.id.settingid);
        image1  = (ImageView) findViewById(R.id.logoid);
        image2  = (ImageView) findViewById(R.id.doglogoid);
        //callAnimation
        uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup= AnimationUtils.loadAnimation(this,R.anim.downtoup);

        button1.setAnimation(downtoup);
        button2.setAnimation(downtoup);
        button3.setAnimation(downtoup);
        image1.setAnimation(uptodown);
        image2.setAnimation(downtoup);

        //loopSound
        mySong.setLooping(true);
        mySong.start();

    }
    public void playIT(View view){
        myClick.start();
    }
    public void storeIT(View view){
        myClick.start();
    }
    public void settingIT(View view){
        myClick.start();
    }


}
