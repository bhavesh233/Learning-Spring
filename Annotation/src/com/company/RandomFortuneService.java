package com.company;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements  FortuneService{

    String data[] = {"HI","HELLO","WORLD","WELCOME"};

    Random myRandom= new Random();

    @Override
    public String getFortune() {

        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];

        return "RandomFortuneService : call getFortune Method And "+theFortune+" ";
    }
}
