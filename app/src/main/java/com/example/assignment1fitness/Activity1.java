package com.example.assignment1fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {
private EditText Name;
private EditText Age;
private EditText Weight;
private Button btnEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    Name=findViewById(R.id.Name);
    Age=findViewById(R.id.Age);
    Weight=findViewById(R.id.Weight);
btnEnter=findViewById(R.id.btnEnter);
    }

    public void btnEnterData(View view) {
     //String msg=Name.getText().toString();
        Intent intent1=new Intent(this,MainActivity2.class);
   //   intent1.putExtra("data" ,msg);
        startActivity(intent1);
    }


}