package com.company.GameOfSoldier.models.Soliders;

import com.company.GameOfSoldier.models.Weapons.Weapon;

public abstract class Warrior extends Weapon {
    protected int health;
    protected String name;
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Warrior() {

    }
   // public Warrior(int damage) {
   //     super(damage);
   // }
    public Warrior(int health,String name) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack(Warrior warrior);

    public abstract void takeDamage();

}
