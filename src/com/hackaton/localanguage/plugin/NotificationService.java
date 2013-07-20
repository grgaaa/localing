package com.hackaton.localanguage.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created with IntelliJ IDEA.
 * User: GregorHorvat
 * Date: 20.7.13
 * Time: 13:17
 */
public class NotificationService extends Service {

    private static final String TAG = "NotificationService";

    public static final String REFRESH_RATE = "REF_RATE";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "service started");
        long refreshRate = intent.getLongExtra(REFRESH_RATE, 10000);
        Log.d(TAG, "refreshRate: " + refreshRate);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
