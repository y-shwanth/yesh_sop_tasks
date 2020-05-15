package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_3 extends AppCompatActivity {

    private Button b_0;
    private Button b_1;
    private Button b_2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        String player1;
        player1 = globalClass.getP1name();
        textView = (TextView) findViewById(R.id.player1name_text);
        textView.setText(player1);

        b_0 = (Button) findViewById(R.id.p1_turn_0);
        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_3dummy_activity();
            }
        });
        b_1 = (Button) findViewById(R.id.p1_turn_1);
        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_main2();
            }
        });
        b_2 = (Button) findViewById(R.id.p1_turn_2);
        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_main3();
            }
        });

    }
    public void open_3dummy_activity(){
        Intent intent = new Intent(this,_3dummyactivity.class);
        startActivity(intent);
    }
    public void open_main2(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void open_main3(){
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
