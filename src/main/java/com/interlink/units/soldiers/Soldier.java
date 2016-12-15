package com.interlink.units.soldiers;

import com.interlink.units.Person;

public class Soldier extends Person implements Military {

    private int health = 200;
    private int damage = 20;

    public Soldier(String name, int age) {
        super(name, age);
        this.setHealth(health);
    }

    public void attack(Object target) {
        makeDamage(target);
    }

    protected void makeDamage(Object target) {
        Person person = (Person) target;
        person.takeDamage(getDamage());
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
