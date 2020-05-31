package com.clockworkjava.kursspring;

import com.clockworkjava.kursspring.config.MainConfig;
import com.clockworkjava.kursspring.domain.Castle;
import com.clockworkjava.kursspring.domain.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Autowired
    Tournament tournament;

;

    @Override
    public void run(String... args) throws Exception {


        System.out.println(castle);

        tournament.duel();

        System.out.println(tournament);

        System.out.println(castle);


//        Quest saveThePrincess= new Quest("Uratuj księżniczkę");
//        Knight lancelot = new Knight("lancelot", 29, saveThePrincess);
//
//
//        System.out.println(lancelot);
//
//
//        Quest killTheDragon = new Quest("kill the dragon");
//        Knight percival = new Knight("percival", 18, killTheDragon);
//
//        System.out.println(percival);


    }
}
