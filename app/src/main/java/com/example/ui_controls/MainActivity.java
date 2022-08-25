package com.example.ui_controls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autocomplete;
    Button btn, checkbtn, radioClick;
    ImageButton imgbtn;
    CheckBox checkBox1, checkBox2;
    ToggleButton toggle1, toggle2;
    RadioGroup radiogroup;
    RadioButton radioBtn,radioBtn2;




    String[] arr = { "India","Chennai", "Coimbatore","Pollachi","London",
            "Kovilpatti", "Rajapalayam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AutoComplete
        autocomplete = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, arr);
        autocomplete.setThreshold(1);
        autocomplete.setAdapter(adapter);

        //Button
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Button Is Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        //Image Button

        imgbtn = (ImageButton) findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "||---ImageButton is clicked---||", Toast.LENGTH_SHORT).show();
            }
        });


        //CheckBox

        checkbtn = (Button) findViewById(R.id.checkbtn);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thank You...", Toast.LENGTH_SHORT).show();
            }
        });


        //ToggleButton

        toggle1 = (ToggleButton) findViewById(R.id.toggle);
        toggle2 = (ToggleButton) findViewById(R.id.toggle2);

        toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Button -  ").append(toggle1.getText());
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result2 = new StringBuffer();
                result2.append("Button -  ").append(toggle2.getText());
                Toast.makeText(MainActivity.this, result2.toString(), Toast.LENGTH_SHORT).show();
            }
        });


        //Radio Group

        radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioClick = (Button) findViewById(R.id.radioClick);

        radioClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected = radiogroup.getCheckedRadioButtonId();
                radioBtn = (RadioButton) findViewById(selected);
                Toast.makeText(MainActivity.this,radioBtn.getText(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}