package com.kwong.coolweather.gson;

/**
 * Created by 锐锋 on 2017/8/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
