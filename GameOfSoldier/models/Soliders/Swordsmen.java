package com.company.GameOfSoldier.models.Soliders;

import com.company.GameOfSoldier.models.Shields.OrdinaryShield;
import com.company.GameOfSoldier.models.Shields.Shields;

public class Swordsmen extends Warrior {
    private Shields shields =new OrdinaryShield();

    public Shields getShields() {
        return shields;
    }

    public void setShields(Shields shields) {
        this.shields = shields;
    }

    public Swordsmen() {
    }
    public Swordsmen(int health, String name) {
        super(health, name);
    }

    @Override
    public void attack(Warrior war) {
        war.setHealth(war.getHealth() -shields.protect(getWeapon().getDamage()));
    }
}
