package com.interlink.units.workers;

public class ExperiencedLumberjack extends Lumberjack {

    private int health = 150;

    private int numberOfProducedWood = 2;

    public ExperiencedLumberjack(String name, int age) {
        super(name, age);
        this.setHealth(health);
        this.setNumberOfProducedWood(numberOfProducedWood);
    }
}
