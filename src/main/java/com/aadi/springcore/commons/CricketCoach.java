package com.aadi.springcore.commons;

import com.aadi.springcore.commons.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Bowl for 15 minutes daily.";
    }
}
