package com.company.GameOfSoldier.models.Soliders;

public class Mage extends Warrior {
    public Mage() {
    }

    public Mage(int health, String name) {

        super(health, name);
    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void attack(Warrior warrior) {
        warrior.setHealth(warrior.getHealth()-getWeapon().getDamage());
    }
}
