package com.company;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWork() {
        return "SwimCoach getDailyWork method";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune()+" from SwimCoach ";
    }
}
