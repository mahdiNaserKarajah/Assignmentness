package com.example.assignment1fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
String msg=intent.getStringExtra("data");
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    public void btnDiet(View view) {
    }

    public void btnTraining(View view) {


    }
}