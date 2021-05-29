package com.company.GameOfSoldier.models.Weapons;

public abstract class Weapon {
    private int damage;
    public Weapon(int damage) {
        this.damage = damage;
    }
    public Weapon() {
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void hitPower(){};
}
