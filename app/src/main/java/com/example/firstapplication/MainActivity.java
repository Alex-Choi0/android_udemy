package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    AppCompatButton button;
    TextView result;
    ImageView image;

    CheckBox male;
    CheckBox female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextName);
        button = findViewById(R.id.buttonOk);
        result = findViewById(R.id.textViewResult);
        image = findViewById(R.id.imageExample);

        male = findViewById(R.id.checkBoxMale);
        female = findViewById(R.id.checkBoxFemale);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (male.isChecked()) {
                    result.setText("Male");
                    female.setChecked(false);
                } else if (female.isChecked()) {

                } else
                    result.setText("What is your gender?");

            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (female.isChecked()) {
                    result.setText("Female");
                    male.setChecked(false);
                } else {
                    if (male.isChecked()) {

                    } else
                        result.setText("What is your gender?");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                result.setText(editText.getText().toString());
                image.setImageResource(R.drawable.portal2_logo2);

            }
        });
    }
}