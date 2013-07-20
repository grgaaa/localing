package com.hackaton.localanguage.plugin;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created with IntelliJ IDEA.
 * User: GregorHorvat
 * Date: 20.7.13
 * Time: 9:35
 */
public class LocalinguaPlugin extends CordovaPlugin {
    private static final String TAG = "LocalinguaPlugin";

    private Context ctx;

    public LocalinguaPlugin(Context ctx) {
       this.ctx = ctx;
    }

    public void startService(long refreshRate) {
        Log.d(TAG, "starting service; refreshRate: " + refreshRate);

        Intent serviceIntent = new Intent();
        serviceIntent.putExtra(NotificationService.REFRESH_RATE, refreshRate);
        serviceIntent.setClassName("com.hackaton.localanguage", "com.hackaton.localanguage.plugin.NotificationService");
        ctx.startService(serviceIntent);
    }
}
