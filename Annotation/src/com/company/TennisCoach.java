package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("TennisCoach1")
@Component  // it take defalut id tennisCoach
@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // default constructor
    public TennisCoach() {
        System.out.println("TennisCoach: no parameter constructor");
    }

    /*  @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    /*  @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennishCoach Call Setter Method");
        this.fortuneService = fortuneService;
    }
    */


    // define my init method

    public void initMethod(){
        System.out.println(">> TeenisCoach: Init Method Call ");
    }

    // define Destory method

    public void destroyMethod(){
        System.out.println(">> TeennisCaoch: Destory Method ");
    }


    @Override
    public String getDailyWork() {
        return "TennishCoach getDailyWork method";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() +"from TennishCoach Class";
    }
}
