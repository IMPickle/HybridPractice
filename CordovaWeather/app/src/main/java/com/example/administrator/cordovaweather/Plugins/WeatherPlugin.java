package com.example.administrator.cordovaweather.Plugins;

import android.util.Log;
import com.example.administrator.cordovaweather.Data.Weather;
import com.example.administrator.cordovaweather.OpenResource.WeatherJSON;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONException;
import java.util.List;
import static com.example.administrator.cordovaweather.Http.GetWeather.getWeather;


/**
 * Created by yangze on 2017/4/13.
 */

public class WeatherPlugin extends CordovaPlugin {
   public final static String WEATHER_ACTION="getWeather";
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // 初始化
        Log.e("yz", "WeatherPlugin初始化");
    }

    @Override
    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
        Log.e("yz", "executeString 调用");
        return executeTest(action, rawArgs, callbackContext);
    }

    public boolean executeTest(String action, String args, final CallbackContext callbackContext) {
        Log.e("yz", "WeatherPlugin调用");
        String htmlCity = args.replaceAll("\"", "");   //由于H5传值带有“”，需要去除。
        if (callbackContext == null) {
            return false;
        }

        if (cordova.getActivity() == null || cordova.getActivity().isDestroyed()) {
            callbackContext.error("error, the activity context is null or destroyed");
            return false;
        }

        if (WEATHER_ACTION.equals(action)) {
            List<Weather> weatherList = WeatherJSON.Open();
            if (weatherList == null || weatherList.isEmpty()) {
                callbackContext.error("获取城市失败");
                return false;
            }
            for (int i = 0; i < weatherList.size(); i++) {
                if (htmlCity.equals(weatherList.get(i).CityName)) {
                    getWeather(callbackContext, weatherList.get(i));
                    break;
                } else if (!htmlCity.equals(weatherList.get(i).CityName) && i == weatherList.size() - 1) {
                    callbackContext.error("该城市尚未开通天气服务！");
                    break;
                }
            }
        }
        return true;
    }
}
