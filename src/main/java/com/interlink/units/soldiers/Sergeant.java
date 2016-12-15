package com.interlink.units.soldiers;

import com.interlink.units.Person;

import java.util.List;

public class Sergeant extends Soldier {

    private int health = 250;
    private int damage = 30;

    private int amountOfGrenades = 2;
    private int damageByGrenade = 60;

    public Sergeant(String name, int age) {
        super(name, age);
        this.setDamage(damage);
        this.setHealth(health);
    }

    public void throwGrenade(List<Person> targets) {
        setAmountOfGrenades(getAmountOfGrenades() - 1);
        targets.forEach(t -> makeDamageByGrenade(t));
    }

    private void makeDamageByGrenade(Person target) {
        target.takeDamage(damageByGrenade);
    }

    public int getAmountOfGrenades() {
        return amountOfGrenades;
    }

    public void setAmountOfGrenades(int amountOfGrenades) {
        this.amountOfGrenades = amountOfGrenades;
    }

}
