package com.aadi.springcore.commons;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Scope is used to define bean scope.
 * Changing the default bean Scope (Singleton) to PROTOTYPE.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley.";
    }
}
