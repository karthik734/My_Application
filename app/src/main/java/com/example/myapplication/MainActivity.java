package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText getnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view){
        getnum=(EditText) findViewById(R.id.q);
        //num= new Integer(getnum.getText().toString()).intValue();
        Toast.makeText(getApplicationContext(), "ADDITION",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, PrintActivity.class);
        intent.putExtra("task","add".toString());
        intent.putExtra("q",getnum.getText().toString()).getData();
        startActivity(intent);
    }

}