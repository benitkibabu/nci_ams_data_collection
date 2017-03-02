package com.kibabu.benit.ncistudentapp.app;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Ben on 02/03/2017.
 */

public class MyInstanceIdService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh(){
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d("MIIS", token);
        //send token to app server below.
    }
}
