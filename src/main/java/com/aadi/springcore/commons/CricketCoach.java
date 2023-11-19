package com.aadi.springcore.commons;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Bowl for 15 minutes daily.";
    }
}
