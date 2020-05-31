package com.clockworkjava.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Knight() {
        this.name = "Lancelot";
        this.age = 29;

    }

    private String name;
    private int age;
    private Quest quest;

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Rycerz o imieniu " + name + "(" + age + ") . Ma za zadanie: " + quest;
    }
}
