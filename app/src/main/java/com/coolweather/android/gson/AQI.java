package com.coolweather.android.gson;

/**
 * Created by Marvin on 2017/4/12.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
