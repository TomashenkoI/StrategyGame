package com.interlink.units.workers;

public class ExperiencedMiner extends Miner {

    private int health = 150;

    private int numberOfProducedResources = 2;

    public ExperiencedMiner(String name, int age) {
        super(name, age);
        this.setHealth(health);
        this.setNumberOfProducedResources(numberOfProducedResources);
    }
}
