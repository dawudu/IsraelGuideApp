package com.example.manthole.israelguideapp;

import java.io.Serializable;

/**
 * Created by manthole on 15 Aug 2017.
 */

public class Cities implements Serializable {

    private int image1;
    private String cityName;

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
