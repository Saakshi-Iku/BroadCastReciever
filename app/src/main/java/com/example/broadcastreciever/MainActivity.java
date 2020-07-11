package com.example.broadcastreciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Custom(View view) {
        Intent i=new Intent();
        i.setAction("hello.some.custom.action");
        i.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(i);
    }
}