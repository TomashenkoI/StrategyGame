package com.interlink.units.soldiers;

import com.interlink.units.Person;

import java.util.ArrayList;
import java.util.List;

public class Captain extends Sergeant{

    private int health = 400;
    private int damage = 40;

    private int amountOfGrenades = 3;

    private List<Soldier> squadOfSoldiers = new ArrayList<>();

    public Captain(String name, int age) {
        super(name, age);
        this.setDamage(damage);
        this.setHealth(health);
        this.setAmountOfGrenades(amountOfGrenades);
    }

    public void commandToSquadToAttack(Person target) {
        getSquadOfSoldiers().forEach(soldier -> soldier.attack(target));
    }

    public void addSoldierToSquad(Soldier soldier) {
        squadOfSoldiers.add(soldier);
    }

    public List<Soldier> getSquadOfSoldiers() {
        return squadOfSoldiers;
    }

    public void setSquadOfSoldiers(List<Soldier> squadOfSoldiers) {
        this.squadOfSoldiers = squadOfSoldiers;
    }
}
