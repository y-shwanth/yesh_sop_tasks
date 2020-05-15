package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Main9Activity extends AppCompatActivity {

    Timer timer;
    TextView textView,tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        textView = (TextView) findViewById(R.id.p2p_won);
        final GlobalClass globalClass = (GlobalClass) getApplicationContext();


        tv = (TextView) findViewById(R.id.duo_won_p2_score);
        int y; String z;
        y = globalClass.getP2score();
        y = y + 1;
        z = String.valueOf(y);
        tv.setText(z);
        globalClass.setP2score(y);

        int temp;
        temp = globalClass.getRounds();
        temp =temp -1;
        globalClass.setRounds(temp);
        textView.setText(globalClass.getP2name());
        if(temp!=0){
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {

                    Intent intent = new Intent(Main9Activity.this,activity_3.class);
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

                    Intent intent = new Intent(Main9Activity.this,Main7Activity.class);
                    startActivity(intent);
                    finish();


                }
            },1000);
        }
    }

}
