package com.aadi.springcore.rest;

import com.aadi.springcore.commons.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach myCoach;


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
     * @param myCoach - Obj of type Coach( Can be any class that implements Coach interface)
     */
    @Autowired
    public Controller(Coach myCoach){
        this.myCoach = myCoach;
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
}
