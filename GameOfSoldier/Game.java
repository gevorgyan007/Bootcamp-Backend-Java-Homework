package com.company.GameOfSoldier;

import com.company.GameOfSoldier.models.Soliders.Archer;
import com.company.GameOfSoldier.models.Soliders.Mage;
import com.company.GameOfSoldier.models.Soliders.Swordsmen;
import com.company.GameOfSoldier.models.Soliders.Warrior;
import com.company.GameOfSoldier.models.Weapons.Arrow;
import com.company.GameOfSoldier.models.Weapons.MageWeapon;
import com.company.GameOfSoldier.models.Weapons.Sword;
import com.company.GameOfSoldier.utility.*;

import java.util.Random;


public class Game {
   // private Warrior warrior;
    private Warrior warrior;
    private Warrior opponent;

    private int numberSolider;

    //private Weapon weapon;
    //private Weapon weaponOpp;

    @Override
    public String toString() {
        return "Game{" +
                "warrior=" + warrior +
                ", opponent=" + opponent +
                ", numberSolider=" + numberSolider + '}';
               // ", weapon=" + weapon +
               // ", weapon skill =" + weapon.getDamage()+
               // ", weaponOpp=" + weaponOpp +
               // ", weaponOPP skill="+weaponOpp.getDamage()+
               // '}';
    }

    public Game(int numberSolider) {
        this.numberSolider = numberSolider;
        setSolider();
        start();
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }


   public   void start() {
    int num1 = RandomNum.randNum(1, 6);
       System.out.println("Dice 1" + num1);
    int num2 = RandomNum.randNum(1, 6);
       System.out.println("Dice 2" + num2);
       System.out.println(this.toString());
       if (num1 > num2) {
            System.out.println("Player started attack");
            while (true) {
             if (warrior.getHealth()<0){
                 System.out.println(warrior.getName()+ warrior.getHealth());
                 break;
             }else if ( opponent.getHealth()<0){
                 System.out.println(opponent.getName() + opponent.getHealth());
                 break;}
             else{
                 warrior.attack(opponent);
             }
             if (warrior.getHealth()<0 ){
                 System.out.println(warrior.getName()+ warrior.getHealth());
                 break;
             }else if (opponent.getHealth()<0){
                 System.out.println(opponent.getName() + opponent.getHealth());
                 break;
             }
             else{
                 opponent.attack(warrior);
             }

         }
        }else if (num1 < num2) {
            System.out.println("Opponent started attack");
            while (true) {
                if (warrior.getHealth()<0){
                    System.out.println(warrior.getName()+ warrior.getHealth());
                    break;
                }else  if ( opponent.getHealth()<0){
                    System.out.println(opponent.getName() + opponent.getHealth());
                    break;
                } else{
                    opponent.attack(warrior);
                }
                if (warrior.getHealth()<0 ){
                    System.out.println(warrior.getName() + warrior.getHealth());
                    break;
                }else if (opponent.getHealth()<0){
                    System.out.println(opponent.getName() + opponent.getHealth());
                    break;
                } else{
                    warrior.attack(opponent);
                }

            }
        }else if(num1 == num2) {
            start();
        }
    }

    private void setSolider() {
        if (numberSolider == 1) {
            warrior = new Swordsmen(300,"Swordsmen");
            warrior.setWeapon(new Sword((new Random().nextInt(30)+10)));
            int result = RandomNum.randNum(1, 2);
            if (result == 1) {
                System.out.println("Your opponent Archer");
                opponent = new Archer(400,"Archer");
                opponent.setWeapon(new Arrow((new Random().nextInt(40)+10)));
            } else if (result == 2) {
                System.out.println("Your opponent Mage");
                opponent = new Mage(500,"Mage");
                opponent.setWeapon(new MageWeapon((new Random().nextInt(40)+15)));
            }
        } else if (numberSolider == 2) {
            warrior = new Archer(400,"Archer");
            warrior.setWeapon(new Arrow((new Random().nextInt(40)+10)));
            int result = RandomNum.randNum(1, 2);
            if (result == 1) {
                System.out.println("Your opponent Swordsmen");
                opponent = new Swordsmen(300,"Swordsmen");

                opponent.setWeapon(new Sword((new Random().nextInt(30)+10)));
            } else if (result == 2) {
                opponent = new Mage(500,"Mage");
                opponent.setWeapon(new MageWeapon((new Random().nextInt(40)+15)));
                System.out.println("Your opponent Mage");
            }
        }
        if (numberSolider == 3) {
            warrior =  new Mage(500,"Mage");
            warrior.setWeapon(new MageWeapon(new Random().nextInt(40)+15));
            int result = RandomNum.randNum(1, 2);
            if (result == 1) {
                System.out.println("Your opponent Archer");
                opponent = new Archer(400,"Archer");
                opponent.setWeapon( new Arrow((new Random().nextInt(40)+10)));
            } else if (result == 2) {
                System.out.println("Your opponent Archer");
                opponent =new Swordsmen(300,"Swordsmen");
                opponent.setWeapon(new Sword(new Random().nextInt(30)+10)); ;
            }
        }
    }

}
