package com.example.talkstrangers.models;

import android.webkit.JavascriptInterface;

import com.example.talkstrangers.activities.CallActivity;


public class InterfaceJava {

    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity) {
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();
    }

}
