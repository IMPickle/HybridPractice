package com.example.administrator.cordovaweather.OpenResource;

import android.util.Log;
import com.example.administrator.cordovaweather.Data.Weather;
import com.example.administrator.cordovaweather.Data.WeatherHead;
import com.example.administrator.cordovaweather.MainActivity;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by joy on 2017/4/24.
 */

public class WeatherJSON {

    public  static List<Weather> Open(){

        try {
            InputStream inputStream= MainActivity.mainActivity.getResources().getAssets().open("weather");
            int size = inputStream.available();
            byte[] bytes = new byte[size];
            inputStream.read(bytes);
            inputStream.close();
            String string = new String(bytes);
            Gson gson=new Gson();
            WeatherHead weatherHead = gson.fromJson(string,WeatherHead.class);
            List<Weather> weatherList=weatherHead.mWeatherList;
            Log.e("yz","打开Json文件成功"+string);
            return  weatherList;
        } catch (IOException e) {
            Log.e("yz","打开Json文件出错");
            return null;
        }

    }


}
