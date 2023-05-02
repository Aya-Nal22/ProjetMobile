package com.example.qcmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     Button btn_suiv;
     RadioGroup rg;
     RadioButton rb;
     int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        btn_suiv = (Button) findViewById(R.id.btn_suiv);
        rg = (RadioGroup) findViewById(R.id.radio);
        btn_suiv.setOnClickListener(this);
        btn_suiv.setBackgroundColor(Color.GRAY);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_suiv:
                int id = rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(id);
                if (rb.getText().toString().equals("7"))
                {
                    score = 1;
                }
                Intent i = new Intent(this,Question2.class);
                i.putExtra("score",score);
                startActivity(i);
        }
    }
}