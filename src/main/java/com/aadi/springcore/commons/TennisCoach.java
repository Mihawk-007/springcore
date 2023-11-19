package com.aadi.springcore.commons;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach(){
        System.out.println("In constructor: "+ getClass().getName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley.";
    }
}
