package com.sd3lab.ahmadhassan.mathgamechapter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Handler myHandler;
    boolean gameOn;
    long startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(this);
        startTime = System.currentTimeMillis();

        myHandler = new Handler(){
          public void handleMessage(Message message){
              super.handleMessage(message);
              if (gameOn){
                  long seconds = ((System.currentTimeMillis() - startTime))/1000;
                  Log.i("Info", "Seconds = " + seconds);
              }
              myHandler.sendEmptyMessageDelayed(0, 1000);
          }
        };

        gameOn = true;
        myHandler.sendEmptyMessage(0);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, GameActivity.class);
        startActivity(i);
    }
}
