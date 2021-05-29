package com.company.GameOfSoldier.models.Shields;

public class OrdinaryShield extends Shields {
    public OrdinaryShield() {
        setHealthOfShield(50);
    }

    @Override
   public int protect(int damage) {
        int damageth = damage;
        damage = (int) (damage-(damage*0.2));
        if (getHealthOfShield()>0) {
            setHealthOfShield(getHealthOfShield() - damage);
        }else {
            return damageth;
        }
        return damage;
    }

}
