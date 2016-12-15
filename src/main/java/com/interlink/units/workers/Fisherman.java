package com.interlink.units.workers;

import com.interlink.Resources;
import com.interlink.units.Person;

public class Fisherman extends Person implements Worker {

    private int health = 100;

    private int numberOfProducedFish = 1;

    public Fisherman(String name, int age) {
        super(name, age);
        this.setHealth(health);
    }

    public void work() {
        extractFish();
    }

    protected void extractFish() {
        Resources.addFish(numberOfProducedFish);
        System.out.println("+" + getNumberOfProducedFish() +  " fish");
    }

    public int getNumberOfProducedFish() {
        return numberOfProducedFish;
    }

    public void setNumberOfProducedFish(int numberOfProducedFish) {
        this.numberOfProducedFish = numberOfProducedFish;
    }
}
