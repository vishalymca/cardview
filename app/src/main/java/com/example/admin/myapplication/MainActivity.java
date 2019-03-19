package com.example.admin.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.ticket_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String s[][] = {{"CODE WARS","12 April","1:00 PM","RS 20","Paid"},
                {"XUNBAO","7 April","2:00 PM","RS 20","Paid"},
                {"HACKON","12 April","3:00 PM","RS 20","Paid"},
                {"CODEXPLOD","12 April","4:00 PM","RS 10","Paid"},
                {"CODEGOLF","12 April","5:00 PM","RS 30","Not Paid"},
                {"ALPHAAZ","12 April","6:00 PM","RS 200","Paid"},
                {"JAM","12 April","7:00 PM","Free","Not Paid"},
                {"SKIT","12 April","8:00 PM","RS 20","Paid"}};

        recyclerView.setAdapter(new Adapter1(MainActivity.this,s));



    }
}
