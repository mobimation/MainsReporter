package com.mobimation.mainsreporter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    String TAG=this.getClass().getName();
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // Forward intent to activity
            Log.d(TAG, "Received intent, launching activity");
            Intent activityIntent = new Intent(intent);
            activityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);

            activityIntent.setClass(context, MainActivity.class);
            context.startActivity(activityIntent);

    }
}
