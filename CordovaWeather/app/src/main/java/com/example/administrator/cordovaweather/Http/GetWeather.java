package com.example.administrator.cordovaweather.Http;

import android.util.Log;

import com.example.administrator.cordovaweather.Data.Weather;

import org.apache.cordova.CallbackContext;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by joy on 2017/4/25.
 */

public class GetWeather {
    /**
     * 通过okhttp请求天气
     */
    public static void getWeather(final CallbackContext callbackContext, Weather weather) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder requestBuilder = new Request.Builder().url(WeatherUrl.Stitching(weather.CityCode));
        Request request = requestBuilder.build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callbackContext.error("请求数据失败:" + e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String str = response.body().string();
                Log.e("yz", "天气数据:" + str);
                callbackContext.success(str);

            }
        });
    }
}
