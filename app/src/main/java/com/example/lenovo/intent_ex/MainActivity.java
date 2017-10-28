package com.example.lenovo.intent_ex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText uname;
    EditText uage;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send();
    }
    void send()
    {
        uname=(EditText)findViewById(R.id.name);
        uage=(EditText)findViewById(R.id.Age);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        String name=uname.getText().toString();
        int age=Integer.parseInt(uage.getText().toString());
        Intent i=new Intent(this,Activity_B.class);
        i.putExtra("name1",name);
        i.putExtra("Age2",age);
        startActivity(i);
        finish();


    }
}
