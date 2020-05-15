package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class _4_2activity extends AppCompatActivity {
    Timer timer;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__4_2activity);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        int y; String z;
        y = globalClass.getP1score();
        z = String.valueOf(y);
        textView = (TextView) findViewById(R.id.score_draw);
        textView.setText(z);
        int x;
        x = globalClass.getRounds();
        x = x - 1;
        globalClass.setRounds(x);

        if(x!=0)
        {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                    Intent intent = new Intent(_4_2activity.this,_3activity.class);
                    startActivity(intent);
                    finish();

            }
        },1000);
        }
        else {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {


                    Intent intent = new Intent(_4_2activity.this,Main8Activity.class);
                    startActivity(intent);
                    finish();

                }
            },1000);
        }


    }

}
