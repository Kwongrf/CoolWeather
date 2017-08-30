package com.kwong.coolweather.gson;

import android.support.v4.app.NotificationCompat;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 锐锋 on 2017/8/30.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;
}
