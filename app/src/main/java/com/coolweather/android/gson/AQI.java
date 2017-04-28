package com.coolweather.android.gson;

/**
 * Created by vhj on 2017/4/25.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
