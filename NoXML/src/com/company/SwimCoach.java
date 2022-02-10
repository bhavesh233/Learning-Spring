package com.company;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String emailAddress;

    @Value("${foo.team}")
    private String team;


    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


/*
       @Value("${foo.email}")
        public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }
        @Value("${foo.team}")
        public void setTeam(String team) {
            this.team = team;
        }
*/

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
