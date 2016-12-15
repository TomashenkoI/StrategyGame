package com.interlink.units;

public abstract class Person {

    private String name;
    private int age;
    private int health;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void takeDamage(int damage) {
        int currentPersonHealth = this.getHealth();
        this.setHealth(currentPersonHealth - damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
