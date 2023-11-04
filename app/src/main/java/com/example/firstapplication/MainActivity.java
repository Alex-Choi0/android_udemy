package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView);
        btn1 = findViewById(R.id.domagic);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setBackgroundColor(Color.BLACK);
                text.setText("I have done my magic");
                text.setVisibility(View.INVISIBLE);
                btn1.setVisibility(View.INVISIBLE);
            }
        });

    }
}