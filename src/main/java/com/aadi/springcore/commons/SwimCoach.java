package com.aadi.springcore.commons;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Swim for 1000 metres daily.";
    }
}
