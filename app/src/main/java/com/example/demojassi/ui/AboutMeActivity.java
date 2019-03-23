package com.example.demojassi.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.demojassi.R;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        TextView  text= findViewById(R.id.ts1);
        TextView  text1= findViewById(R.id.ts2);
        String name = "JASPREET SINGH" ;
         String name1 = "(Android Developer)" ;
        text.setText(name);
        text1.setText(name1);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_);
        setTitle("ABOUT");

    }
}
