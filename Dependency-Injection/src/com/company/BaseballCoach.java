package com.company;

public class BaseballCoach implements Coach {

    // define private field to dependency
    private FortuneService fortuneService;

    // define a constructor for the dependency
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "20 minit works";
    }

    // use my fortune service to get a fortune
    @Override
    public String getDailyFortune() {
        return " use BaseBall class "+fortuneService.getFortune();
    }
}
