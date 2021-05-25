package com.company.GameOfSoldier;

public abstract class Warrior {
   protected int health;
    protected int damage;

    public Warrior() {
    }

    public Warrior(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract void attack(Warrior warrior);
    public abstract void takeDamage();



}
