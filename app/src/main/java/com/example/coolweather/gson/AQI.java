package com.example.coolweather.gson;

/**
 * Created by admin on 2018/1/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
