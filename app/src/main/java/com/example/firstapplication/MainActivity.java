package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    AppCompatButton button;
    TextView result;
    ImageView image;
    RadioButton green;
    RadioButton red;
    RadioButton yellow;
    RadioGroup group;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextName);
        button = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageExample);

        group = findViewById(R.id.group);
        green = findViewById(R.id.radioButtonGreen);
        red = findViewById(R.id.radioButtonRed);
        yellow = findViewById(R.id.radioButtonYello);
        layout = findViewById(R.id.linearLayout);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(green.isChecked()){
                    layout.setBackgroundColor(Color.GREEN);
                } else if(red.isChecked()){
                    layout.setBackgroundColor(Color.RED);

                } else if(yellow.isChecked()) {
                    layout.setBackgroundColor(Color.YELLOW);
                }

            }


        });
    }
}