package com.interlink.units.workers;

import com.interlink.Resources;
import com.interlink.units.Person;

public class Lumberjack extends Person implements Worker {

    private int health = 100;

    private int numberOfProducedWood = 1;

    public Lumberjack(String name, int age) {
        super(name, age);
        this.setHealth(health);
    }

    public void work() {
        extractWood();
    }

    protected void extractWood() {
        Resources.addWood(numberOfProducedWood);
        System.out.println("+" + getNumberOfProducedWood() + " wood");
    }

    public int getNumberOfProducedWood() {
        return numberOfProducedWood;
    }

    public void setNumberOfProducedWood(int numberOfProducedWood) {
        this.numberOfProducedWood = numberOfProducedWood;
    }
}
