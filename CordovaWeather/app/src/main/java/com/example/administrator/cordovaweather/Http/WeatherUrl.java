package com.example.administrator.cordovaweather.Http;

/**
 * Created by joy on 2017/4/24.
 */

public class WeatherUrl {
    public  static  final String WEATHER_URL="http://www.weather.com.cn/data/sk/";

    public static String Stitching (String CityCode){
        return WEATHER_URL+CityCode+".html";
    }
}
