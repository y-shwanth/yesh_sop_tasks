package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {

    private Button button;
    TextView textView;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();

        int y; String z; int a;
        y = globalClass.getP1score(); a = globalClass.getP2score();
        z = String.valueOf(y);
        textView = (TextView) findViewById(R.id.final_score);
        textView.setText(z);
        tv = (TextView) findViewById(R.id.final_result);
        if(y>a)
            tv.setText("you won");
        else if(a>y)
            tv.setText("you lost");
        else
            tv.setText("draw");

        button = findViewById(R.id.play_single_again);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSingle_again();
            }
        });
    }
    public void openSingle_again(){
        Intent intent = new Intent(this,_2activity.class);
        startActivity(intent);
    }
}
