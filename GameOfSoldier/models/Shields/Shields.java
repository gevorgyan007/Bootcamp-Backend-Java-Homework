package com.company.GameOfSoldier.models.Shields;

public abstract class Shields {
    private int healthOfShield ;
    public   abstract int protect(int damage);

    public int getHealthOfShield() {
        return healthOfShield;
    }

    public void setHealthOfShield(int healthOfShield) {
        this.healthOfShield = healthOfShield;
    }
}
