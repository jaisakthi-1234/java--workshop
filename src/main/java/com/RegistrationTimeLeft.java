package com;

import java.time.LocalTime;

public class RegistrationTimeLeft { 
    public static void main(String[] args) {
        LocalTime currenTime = LocalTime.now();
        LocalTime registrtionendTime= LocalTime.of(18,00,00);
        int hourleft = registrtionendTime.getHour()-currenTime.getHour();
        int minuteleft = registrtionendTime.getMinute()-currenTime.getMinute();
        int secondleft = registrtionendTime.getSecond()-currenTime.getSecond();
         System.out.println("you have "+hourleft+"hours,"+ minuteleft+ "minute,"+ secondleft+"second");
        }

}
