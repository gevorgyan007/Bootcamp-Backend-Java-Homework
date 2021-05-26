package com.company.GameOfSoldier.models.Soliders;

public class Swordsmen extends Warrior {
    public Swordsmen() {
    }
    public Swordsmen(int health, String name) {
        super(health, name);
    }
    @Override
    public void attack(Warrior war) {
        war.setHealth(war.getHealth() - getWeapon().getDamage());
    }
}
