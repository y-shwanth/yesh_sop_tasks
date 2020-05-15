package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_2 extends AppCompatActivity {

    private Button _duo_button;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        editText1 = (EditText) findViewById(R.id.player1_text);
        editText2 = (EditText) findViewById(R.id.player2_text);
        editText3 = (EditText) findViewById(R.id.total_rounds_text);

        final GlobalClass globalClass = (GlobalClass) getApplicationContext();
        globalClass.setP1score(0);
        globalClass.setP2score(0);

        _duo_button = (Button) findViewById(R.id.start_button);
        _duo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                globalClass.setP1name(editText1.getText().toString());
                globalClass.setP2name(editText2.getText().toString());
                globalClass.setRounds(Integer.parseInt(editText3.getText().toString()));
                open_activity_3();
            }
        });

    }
    public void open_activity_3()
    {
        Intent intent = new Intent(this,activity_3.class);
        startActivity(intent);
    }
}
