package com.example.workingonstoragestate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 2114 on 04-04-2017.
 */

public class SDCardBroadcastReceiver extends BroadcastReceiver
{
    private static final String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
    private static final String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
    private static final String MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
    private static final String MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";

    private static final String TAG = "SDCardBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i(TAG, "Intent recieved: " + intent.getAction());

        if (intent.getAction() == ACTION_MEDIA_REMOVED) {

            Log.e(TAG, "ACTION_MEDIA_REMOVED called");

            // For bundle Extras do like below
//            Bundle bundle = intent.getExtras();
//            if (bundle != null) {
//
//            }
        }else if (intent.getAction() == ACTION_MEDIA_MOUNTED){

            Log.e(TAG, "ACTION_MEDIA_MOUNTED called");

        }else if(intent.getAction() == MEDIA_BAD_REMOVAL){

            Log.e(TAG, "MEDIA_BAD_REMOVAL called");

        }else if (intent.getAction() == MEDIA_EJECT){

            Log.e(TAG, "MEDIA_EJECT called");

        }
    }
}
