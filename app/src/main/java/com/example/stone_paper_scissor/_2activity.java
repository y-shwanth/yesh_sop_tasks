package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class _2activity extends AppCompatActivity {
    private Button start_button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__2activity);

        editText = (EditText) findViewById(R.id.rounds_text);
        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        start_button = (Button) findViewById(R.id.singlegame_button);
        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalClass.setRounds(Integer.parseInt(editText.getText().toString()));
                globalClass.setP1name("player1");
                globalClass.setP2name("player2");
                globalClass.setP1score(0);
                globalClass.setP2score(0);
                open_3activity();
            }
        });
    }
    public void open_3activity(){
        Intent intent;
        intent = new Intent(this,_3activity.class);
        startActivity(intent);
    }
}
