package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PrintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        Intent intent=getIntent();
        String task=intent.getStringExtra("task");
        String xq=intent.getStringExtra("q");
        int q=Integer.parseInt(xq);
        int count=10;
        TextView displayTextView=(TextView) findViewById(R.id.outtext);
        if(task.equalsIgnoreCase("add")){
            Toast.makeText(getApplicationContext(),"Addition Table",Toast.LENGTH_SHORT).show();
            displayTextView.setText("Table"+q+"\n");
            for(int i=1;i<=count;i++){
                int additions= (q+i);
                displayTextView.append("\n"+q +"+"+i+"="+additions);
            }

        }
    }
}