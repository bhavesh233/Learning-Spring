package com.company;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "DataBaseFortunService : call getFortune Method ";
    }
}
