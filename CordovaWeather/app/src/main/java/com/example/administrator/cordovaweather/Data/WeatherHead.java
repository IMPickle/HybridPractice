package com.example.administrator.cordovaweather.Data;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by joy on 2017/4/25.
 */

public class WeatherHead {
    @SerializedName("weather")
    public List<Weather> mWeatherList;
}
