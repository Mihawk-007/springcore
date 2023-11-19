package com.aadi.springcore.commons;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Lazy annotation makes sure that the bean will be initialized only when it is being directly referred.
 * It may help in application optimization but the drawback if a bean has some config issue then you may
 * not be able to know about and it may cause error later.
 */
@Component
@Lazy
//@Primary
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+ getClass().getName());
    }
    @Override
    public String getDailyWorkout(){
        return "Bowl for 15 minutes daily.";
    }
}
