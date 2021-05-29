package com.company.GameOfSoldier.models.Shields;

public class MediumShield extends Shields {
    public MediumShield() {
        setHealthOfShield(80);
    }

    @Override
   public int protect(int damage) {
        int damageth = damage;
        damage = (int) (damage-(damage*0.4));
        if (getHealthOfShield()>0) {
            setHealthOfShield(getHealthOfShield() - damage);
        }else {
            return damageth;
        }
        return damage;
    }
}
