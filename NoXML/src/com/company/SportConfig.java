package com.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.company")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for our swim coach and inject Dependency, here bean ID is swimCoach
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
