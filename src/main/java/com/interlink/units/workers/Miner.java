package com.interlink.units.workers;

import com.interlink.Resources;
import com.interlink.units.Person;

public class Miner extends Person implements Worker {

    private int health = 100;

    private int numberOfProducedResources = 1;

    public Miner(String name, int age) {
        super(name, age);
        this.setHealth(health);
    }

    public void work() {
        extractStone();
        extractIron();
    }

    protected void extractStone() {
        Resources.addStone(numberOfProducedResources);
        System.out.println("+" + getNumberOfProducedResources() + " stone");
    }

    protected void extractIron() {
        Resources.addIron(numberOfProducedResources);
        System.out.println("+ iron");
    }

    public int getNumberOfProducedResources() {
        return numberOfProducedResources;
    }

    public void setNumberOfProducedResources(int numberOfProducedResources) {
        this.numberOfProducedResources = numberOfProducedResources;
    }
}
