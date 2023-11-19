package com.aadi.springcore.commons;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    public BaseballCoach(){
        System.out.println("In Constructor: "+ getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practise.";
    }
}
