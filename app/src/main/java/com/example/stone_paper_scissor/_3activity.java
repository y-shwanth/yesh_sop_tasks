package com.example.stone_paper_scissor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class _3activity extends AppCompatActivity {
    private Button p_0;
    private Button p_1;
    private Button p_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__3activity);
        p_0 = findViewById(R.id.single_stone);
        p_1 = findViewById(R.id.single_paper);
        p_2 = findViewById(R.id.single_scissor);

        p_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(3);

                    if(number==0) open_4_2activity();
                    else if (number==1) open_4_1activity();
                    else open_4activity();

            }
        });
        p_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(3);

                if(number==0) open_4activity();
                else if (number==1) open_4_2activity();
                else open_4_1activity();
            }
        });
        p_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(3);

                if(number==0) open_4_1activity();
                else if (number==1) open_4activity();
                else open_4_2activity();
            }
        });
    }
    public void open_4activity()
    {
        Intent intent = new Intent(this,_4activity.class);
        startActivity(intent);
    }
    public void open_4_1activity()
    {
        Intent intent = new Intent(this,_4_1activity.class);
        startActivity(intent);
    }
    public void open_4_2activity()
    {
        Intent intent = new Intent(this,_4_2activity.class);
        startActivity(intent);
    }
}