package com.smd.nicdetailsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = (TextView)findViewById(R.id.output);

//        NICDetailFinder obj = new NICDetailFinder("200015500220");
//
//        outputText.setText(obj.BIRTH_DAY);
    }
}