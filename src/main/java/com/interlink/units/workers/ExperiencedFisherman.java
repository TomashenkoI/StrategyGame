package com.interlink.units.workers;

public class ExperiencedFisherman extends Fisherman{

    private int health = 150;

    private int numberOfProducedFish = 2;

    public ExperiencedFisherman(String name, int age) {
        super(name, age);
        this.setHealth(health);
        this.setNumberOfProducedFish(numberOfProducedFish);
    }
}
