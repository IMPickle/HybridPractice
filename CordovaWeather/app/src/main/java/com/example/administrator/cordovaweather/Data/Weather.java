package com.example.administrator.cordovaweather.Data;

/**
 * Created by joy on 2017/4/24.
 */

public class Weather {
    public  String CityName;
    public  String CityCode ;

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getCityCode() {

        return CityCode;
    }

    public void setCityCode(String cityCode) {
        CityCode = cityCode;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "CityName='" + CityName + '\'' +
                ", CityCode='" + CityCode + '\'' +
                '}';
    }
}
