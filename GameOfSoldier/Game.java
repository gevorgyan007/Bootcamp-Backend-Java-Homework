package com.company.GameOfSoldier;

import com.company.GameOfSoldier.utility.RandomNum;

public class Game {
    private Warrior warrior;
    private Warrior randWarrior;
    private int numberSolider;

    @Override
    public String toString() {
        return "Game{" +
                "warrior=" + warrior +
                ", randWarrior=" + randWarrior +
                ", numberSolider=" + numberSolider +
                '}';
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

    //private void randomSolider() {
    //     if (warrior.equals(new Swordsmen())) {
//
    //        int result = RandomNum.randNum(1,2);
//
    //         if (result == 1) {
    //             randWarrior = new Archer();
    //         } else if (result == 2) {
    //             randWarrior = new Mage();
    //         }
    //     }else if (warrior.equals(new Archer())) {
//
    //         int result = RandomNum.randNum(1,2);
//
    //         if (result == 1) {
    //             randWarrior = new Swordsmen();
    //         } else if (result == 2) {
    //             randWarrior = new Mage();
    //         }
    //     }if (warrior.equals(new Mage())) {
//
    //         int result = RandomNum.randNum(1,2);
//
    //         if (result == 1) {
    //             randWarrior = new Archer();
    //         } else if (result == 2) {
    //             randWarrior = new Archer();
    //         }
    //     }
    // }
    public  void start() {
        int num1 = RandomNum.randNum(1, 6);
        int num2 = RandomNum.randNum(1, 6);

            if (num1 > num2) {
                while(){
                warrior.attack(randWarrior);
                randWarrior.attack(warrior);
                }
            }else  if (num1 < num2) {
                randWarrior.attack(warrior);
            }
        }




    private void setSolider() {
        if (numberSolider == 1) {
            warrior = new Swordsmen();

            int result = RandomNum.randNum(1, 2);

            if (result == 1) {
                randWarrior = new Archer();
            } else if (result == 2) {
                randWarrior = new Mage();
            }

        } else if (numberSolider == 2) {
            warrior = new Archer();
            int result = RandomNum.randNum(1, 2);

            if (result == 1) {
                randWarrior = new Swordsmen();
            } else if (result == 2) {
                randWarrior = new Mage();
            }
        }
        if (numberSolider == 3) {
            warrior = new Mage();
            int result = RandomNum.randNum(1, 2);

            if (result == 1) {
                randWarrior = new Archer();
            } else if (result == 2) {
                randWarrior = new Archer();
            }
        }
    }

}
