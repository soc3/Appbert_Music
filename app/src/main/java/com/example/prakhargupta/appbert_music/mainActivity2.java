package com.example.prakhargupta.appbert_music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class mainActivity2 extends AppCompatActivity {

    Button b;  Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b=(Button)findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent i = new Intent(mainActivity2.this, MainActivity.class);//this -> current object java file
                startActivity(i);
            }
        });
        b2=(Button)findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mainActivity2.this,Main3Activity.class);
                //i.Extra("arg",songLis);
                startActivity(i);
            }
        });
    }
   /* @Override
    public void onBackPressed()
    {
        //super.onBackPressed();
        new AlertDialog.Builder(mainActivity2.this)
                .setTitle("EXIT")
                .setMessage("Do you want to exit")
                .setPositiveButton("Yes",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog , int which){

                    }
                })
                .setNeutralButton("Cancel", new  DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){
                        System.exit(0);
                    }
                })
                .show();
    }*/
    }
