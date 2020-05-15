package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        tv1 = (TextView) findViewById(R.id.final_score_p1);
        int y; String z;
        y = globalClass.getP1score();
        z = String.valueOf(y);
        tv1.setText(z);
        tv2 = (TextView) findViewById(R.id.final_score_p2);
        int a; String b;
        a = globalClass.getP2score();
        b = String.valueOf(a);
        tv2.setText(z);

        tv3 = (TextView) findViewById(R.id.final_p1);
        tv4 = (TextView) findViewById(R.id.final_p2);
        String m; String n;
        m = globalClass.getP1name();
        tv3.setText(m);
        n = globalClass.getP2name();
        tv4.setText(n);

        button = (Button) findViewById(R.id.play_again);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_StartAgain();
            }
        });
    }
    public void open_StartAgain(){
        Intent intent = new Intent(this,activity_2.class);
        startActivity(intent);
    }
}
