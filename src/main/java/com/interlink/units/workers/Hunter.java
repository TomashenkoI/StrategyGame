package com.interlink.units.workers;

import com.interlink.Resources;
import com.interlink.units.Person;

public class Hunter extends Person implements Worker {

    private int health = 100;

    private int numberOfProducedMeet = 1;

    public Hunter(String name, int age) {
        super(name, age);
        this.setHealth(health);
    }

    public void work() {
        extractMeat();
    }

    protected void extractMeat() {
        Resources.addMeat(numberOfProducedMeet);
        System.out.println("+" + getNumberOfProducedMeet() + " meat");
    }

    public int getNumberOfProducedMeet() {
        return numberOfProducedMeet;
    }

    public void setNumberOfProducedMeet(int numberOfProducedMeet) {
        this.numberOfProducedMeet = numberOfProducedMeet;
    }
}
