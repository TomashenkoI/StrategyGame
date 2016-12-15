package com.interlink;

public class Resources {

    private static int iron;
    private static int wood;
    private static int stone;
    private static int fish;
    private static int meat;

    public static void addIron(int numberOfIron) {
        iron += numberOfIron;
    }
    public static void removeIron(int numberOfIron) {
        iron -= numberOfIron;
    }

    public static void addWood(int numberOfWood) {
        wood += numberOfWood;
    }
    public static void removeWood(int numberOfWood) {
        wood -= numberOfWood;
    }

    public static void addStone(int numberOfStone) {
        stone += numberOfStone;
    }
    public static void removeStone(int numberOfStone) {
        stone -= numberOfStone;
    }

    public static void addFish(int numberOfFish) {
        fish += numberOfFish;
    }
    public static void removeFish(int numberOfFish) {
        fish -= numberOfFish;
    }

    public static void addMeat(int numberOfMeat){
        meat += numberOfMeat;
    }
    public static void removeMeat(int numberOfMeat){
        meat -= numberOfMeat;
    }

    public static int getIron() {
        return iron;
    }

    public static void setIron(int iron) {
        Resources.iron = iron;
    }

    public static int getWood() {
        return wood;
    }

    public static void setWood(int wood) {
        Resources.wood = wood;
    }

    public static int getStone() {
        return stone;
    }

    public static void setStone(int stone) {
        Resources.stone = stone;
    }

    public static int getFish() {
        return fish;
    }

    public static void setFish(int fish) {
        Resources.fish = fish;
    }

    public static int getMeat() {
        return meat;
    }

    public static void setMeat(int meat) {
        Resources.meat = meat;
    }
}
