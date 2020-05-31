package com.clockworkjava.kursspring.config;


import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfig {

    @Autowired
    Quest quest;

    @Bean(name = "Lancelot")
    @Primary
    public Knight lancelot() {
        Knight knight = new Knight("Lancelot", 29);
        knight.setQuest(quest);
        return knight;
    }


    @Bean(name = "Percival")
    public Knight percival() {
        Knight knight = new Knight("Percival", 12);
        knight.setQuest(quest);
        return knight;
    }
}
