package com.company;

public class Heroes {
    private int health;
    private String damage;
    private String superPower;


    public Heroes(int health, String damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }
    public Heroes(int health, String damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public String getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}



