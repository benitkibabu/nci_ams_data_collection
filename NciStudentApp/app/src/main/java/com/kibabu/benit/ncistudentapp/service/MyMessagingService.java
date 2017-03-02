package com.kibabu.benit.ncistudentapp.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyMessagingService extends FirebaseMessagingService {
    public MyMessagingService() {

    }

    @Override
    public void onMessageReceived(RemoteMessage message){

        Log.d("MMGS_From", message.getFrom());
        Log.d("MMGS_Body", message.getNotification().getBody());
    }
}
