package com.aadi.springcore.config;

import com.aadi.springcore.commons.Coach;
import com.aadi.springcore.commons.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    /**
     * Bean annotation is used to make a dependency class which doesn't have @Component annotation
     * a bean for DI.
     * By default, bean id(used to reference the bean) reference the method name, unless you explicitly
     * provide a new one.
     * @return - Object of type Coach
     */
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
