package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    AppCompatButton button;
    TextView result;
    ImageView image;

    LinearLayout layout;

    ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageExample);

        toggleButton = findViewById(R.id.toggleButtonShow);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    image.setVisibility(View.INVISIBLE);
                    result.setText("Image is hided");
                } else {
                    image.setVisibility(View.VISIBLE);
                    result.setText("Image is shown");

                }
            }
        });


        layout = findViewById(R.id.linearLayout);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }


        });
    }
}