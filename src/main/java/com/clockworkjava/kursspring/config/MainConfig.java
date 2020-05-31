package com.clockworkjava.kursspring.config;


import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.Knight;
import com.clockworkjava.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration

public class MainConfig {

@Autowired
    Quest quest;

@Bean(name="Lancelot")
@Primary
    public Knight lancelot(){

    Knight knight= new Knight("Lancelot", 29);
    lancelot().setQuest(quest);
    return lancelot();
}


@Bean(name="Percival")
    public Knight percival(){
    Knight knight= new Knight("Percival", 12);
    percival().setQuest(quest);
    return percival();


}
}
