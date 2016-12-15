package com.interlink.units.workers;

public class ExperiencedHunter extends Hunter {

    private int health = 150;

    private int numberOfProducedMeet = 2;

    public ExperiencedHunter(String name, int age) {
        super(name, age);
        this.setHealth(health);
        this.setNumberOfProducedMeet(numberOfProducedMeet);
    }
}
