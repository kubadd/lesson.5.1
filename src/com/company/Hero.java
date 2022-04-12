package com.company;

public class Hero {
    private int damage;
    private int health;
    private String HeroAttacTape;

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getHeroAttacTape() {
        return HeroAttacTape;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHeroAttacTape(String heroAttacTape) {
        HeroAttacTape = heroAttacTape;
    }

    public Hero(int damage, int health, String heroAttacTape) {
        this.damage = damage;
        this.health = health;
        HeroAttacTape = heroAttacTape;
    }

    public Hero(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }
}
