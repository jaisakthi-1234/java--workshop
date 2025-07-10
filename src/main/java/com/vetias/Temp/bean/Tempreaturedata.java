package com.vetias.Temp.bean;

public class Tempreaturedata {

    public static void main(String[] args) {
        Temperaturesensor sensor= new Temperaturesensor(19.5f);
        float reading =sensor.getReading();
        System.out.println(reading);
    }
}
