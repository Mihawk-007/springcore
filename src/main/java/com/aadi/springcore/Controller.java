package com.aadi.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Coach myCoach;

    /**
     * It demonstrates how dependency injection works in spring. The following code will be interpreted as
     * Coach objCoach = new CricketCoach();
     * Controller c = new Controller(objCoach);
     *
     * @param objCoach - Obj of type Coach( Can be any class that implements Coach interface)
     */
    @Autowired
    public Controller(Coach objCoach){
        this.myCoach = objCoach;
    }

    @RequestMapping(path = "/dailyWorkout",method = RequestMethod.GET)
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
