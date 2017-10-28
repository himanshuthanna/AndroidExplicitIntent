package com.example.lenovo.intent_ex;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity_B extends AppCompatActivity {
    TextView t1,t2;
    String name;
    int age;
    Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_xmlfile);
        receive();
    }
    void receive()
    {
        i1=getIntent();
        name=i1.getStringExtra("name1");
        age=i1.getIntExtra("Age2",-1);
        t1=(TextView)findViewById(R.id.r1);
        t2=(TextView)findViewById(R.id.r2);
        t1.setText(name);
        t2.setText(String.valueOf(age));
    }

}
