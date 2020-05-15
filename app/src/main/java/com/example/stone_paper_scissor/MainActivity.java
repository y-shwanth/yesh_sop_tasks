package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button duoButton;
    private Button singleplay_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singleplay_Button =(Button) findViewById(R.id.single_mode_button);
        singleplay_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_2activity();
            }
        });
        duoButton = (Button) findViewById(R.id.duo_button);
        duoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, activity_2.class);
        startActivity(intent);
    }
    public void open_2activity()
    {
        Intent intent_ = new Intent(this,_2activity.class);
        startActivity(intent_);
    }
}
