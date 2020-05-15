package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Main6Activity extends AppCompatActivity {

    Timer timer;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        tv1 = (TextView) findViewById(R.id.score_p1);
        int y; String z;
        y = globalClass.getP1score();
        z = String.valueOf(y);
        tv1.setText(z);
        tv2 = (TextView) findViewById(R.id.score_p2);
        int a; String b;
        a = globalClass.getP1score();
        b = String.valueOf(a);
        tv2.setText(z);

        tv3 = (TextView) findViewById(R.id.draw_p1);
        tv4 = (TextView) findViewById(R.id.draw_p2);
        String m; String n;
        m = globalClass.getP1name();
        tv3.setText(m);
        n = globalClass.getP2name();
        tv4.setText(n);

        int temp;
        temp = globalClass.getRounds();
        temp =temp -1;
        globalClass.setRounds(temp);
        if(temp!=0){
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(Main6Activity.this,activity_3.class);
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

                    Intent intent = new Intent(Main6Activity.this,Main7Activity.class);
                    startActivity(intent);
                    finish();


                }
            },1000);
        }
    }

}
