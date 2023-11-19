package com.aadi.springcore.rest;

import com.aadi.springcore.commons.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach myCoach;
    private Coach anotherCoach;


//   An example of DI (dependency injection) called as Filed Injection.
//   Not recommended to use anymore(used in legacy project)
//   Makes code harder to unit test.
//   @Autowired
//   private Coach getMyCoach;

    /**
     * An example of Constructor injection.
     * It demonstrates how dependency injection works in spring. The following code will be interpreted as
     * Coach objCoach = new CricketCoach();
     * Controller c = new Controller(objCoach);
     *
     * <P>Qualifier requires the name of the bean ( same as class name in lower camel case). It is needed
     * when we have multiple implementations of a dependency, to be more specific.
     * Primary can also be used in place of Qualifier, but if both of them is present, qualifier will take
     * the priority.
     *
     * @param myCoach - Obj of type Coach( Can be any class that implements Coach interface)
     * @param anotherCoach - Obj of type Coach
     */
    @Autowired
    public Controller(
            @Qualifier("tennisCoach") Coach myCoach,
            @Qualifier("tennisCoach") Coach anotherCoach
    ){
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    /**
     * An example of Setter Injection.
     */
//    @Autowired
//    public void setMyCoach(Coach myCoach){
//        this.myCoach = myCoach;
//    }

    @RequestMapping(path = "/dailyWorkout",method = RequestMethod.GET)
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    /**
     * Check if myCoach and anotherCoach are same instances or not.
     * @return - String specifying result of check.
     */
    @RequestMapping(path = "/check", method = RequestMethod.GET)
    public String check(){
        return "Checking : myCoach == anotherCoach "+ (myCoach == anotherCoach) ;
    }
}
