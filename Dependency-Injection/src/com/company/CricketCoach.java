package com.company;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach constructer");
    }

    // use setter injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach call fortuneService setter method of CricktCoach class");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: emailAddress setter method of CricktCoach class");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: team setter method of CricktCoach class");
        this.team = team;
    }


    @Override
    public String getDailyWorkout() {
        return "CricketCoach getDailyWorkout Method ";
    }

    @Override
    public String getDailyFortune() {
        return "CricketCoach call "+fortuneService.getFortune();
    }
}
