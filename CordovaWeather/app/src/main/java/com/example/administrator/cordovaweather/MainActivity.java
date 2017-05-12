package com.example.administrator.cordovaweather;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class MainActivity extends CordovaActivity {
    private static final String START_URL = "file:///android_asset/www/index.html";
    public static MainActivity mainActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity=this;
        loadUrl(START_URL);

    }
}
