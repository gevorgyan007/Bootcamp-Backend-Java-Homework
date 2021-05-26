package com.company.GameOfSoldier.models.Soliders;

public class Archer extends Warrior {
    public Archer() {
    }

    public Archer(int health, String name) {
        super(health,name);
    }

    @Override
    public void takeDamage() {

    }

    @Override
    public void attack(Warrior warrior) {
       warrior.setHealth(warrior.getHealth()-getWeapon().getDamage());
    }
}
