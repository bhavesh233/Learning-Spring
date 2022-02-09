package com.company;

public class TrackCoach implements Coach {

    private  FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TrackCoach getDailyWorkout Method";
    }

    @Override
    public String getDailyFortune() {
        return " TrackCoach use "+fortuneService.getFortune();
    }


    public void  initMethod(){
        System.out.println("TrackCoach Init Method");
    }

    public void  destroyMethod(){
        System.out.println("TrackCoach Destroy Method");
    }

}
