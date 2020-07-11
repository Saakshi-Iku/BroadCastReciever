package com.example.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Battery Low",Toast.LENGTH_SHORT).show();
       // throw new UnsupportedOperationException("Not yet implemented");
    }
}
