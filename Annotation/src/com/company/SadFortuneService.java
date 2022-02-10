package com.company;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "SadFortuneService: getFortune method call ";
    }
}
