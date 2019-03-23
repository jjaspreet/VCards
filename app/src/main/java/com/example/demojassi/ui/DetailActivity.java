package com.example.demojassi.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.demojassi.R;
import com.example.demojassi.model.User;

public class DetailActivity extends AppCompatActivity {
    private TextView textview1, textview2, textview3, textview4, textview5, textview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Intent intent = getIntent();
        User userlist = intent.getParcelableExtra("Jassi");
        String id = userlist.getId();
        String Name = userlist.getName();
        String Mail = userlist.getMail();
        String website = userlist.getWebsite();
        String phone = userlist.getPhone();

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_);
        setTitle("DETAILS");




        textview2 = (TextView)findViewById(R.id.viewname);
        textview3 = (TextView)findViewById(R.id.viewmail);
        textview4 = (TextView) findViewById(R.id.viewwebsite);
        textview5 = (TextView)findViewById(R.id.viewphone);

        textview2.setText(Name);
        textview3.setText(Mail);
        textview4.setText(phone);
        textview5.setText(website);





    }
}
