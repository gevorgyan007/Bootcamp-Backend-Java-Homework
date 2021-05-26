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
import java.util.Scanner;


public class Game {
    private Warrior warrior;
    private Warrior opponent;
    private int numberSolider;

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

    public void start() {
        System.out.println("Please throw the dice for start fight");
        String diceTh = new Scanner(System.in).next();
        int num1 = RandomNum.randNum(1, 6);
        System.out.println("Your " + diceTh + " is --> " + num1);
        int num2 = RandomNum.randNum(1, 6);
        System.out.println("Opponent dice is --> " + num2);
        playerFight(num1, num2);
        opponentFight(num1, num2);
        if (num1 == num2) {
            start();
        }
    }

    private void opponentFight(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("Opponent started attack");
            while (true) {
                if (warrior.getHealth() <= 0) {
                    System.out.println(warrior.getName() + " you lose!");
                    break;
                } else if (opponent.getHealth() < 0) {
                    System.out.println("Opponent lose!");
                    break;
                } else {
                    opponent.attack(warrior);
                    opponent.getWeapon().setDamage(new Random().nextInt(30) + 15);
                    System.out.println("Opponent you hit " + opponent.getWeapon().getDamage());
                    System.out.println(warrior.getName() + " health balance is " + warrior.getHealth());
                }
                if (warrior.getHealth() <= 0) {
                    System.out.println(warrior.getName() + " you lose!");
                    break;
                } else if (opponent.getHealth() <= 0) {
                    System.out.println("Opponent lose!");
                    break;
                } else {
                    warrior.attack(opponent);
                    warrior.getWeapon().setDamage(new Random().nextInt(30) + 19);
                    System.out.println(warrior.getName() + " you hit " + warrior.getWeapon().getDamage());
                    System.out.println("Opponent health balance is " + opponent.getHealth());
                }
            }
        }
    }

    private void playerFight(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Player started attack");
            System.out.println("Opponent health is" + opponent.getHealth());
            while (true) {
                if (warrior.getHealth() <= 0) {
                    System.out.println(warrior.getName() + "you lose!");
                    break;
                } else if (opponent.getHealth() <= 0) {
                    System.out.println("Opponent lose!");
                    break;
                } else {
                    warrior.attack(opponent);
                    warrior.getWeapon().setDamage(new Random().nextInt(30) + 10);
                    System.out.println(warrior.getName() + " you hit " + warrior.getWeapon().getDamage());
                    System.out.println("Opponent health balance is " + opponent.getHealth());
                }
                if (warrior.getHealth() <= 0) {
                    System.out.println(warrior.getName() + "you lose!");
                    break;
                } else if (opponent.getHealth() <= 0) {
                    System.out.println("Opponent lose!");
                    break;
                } else {
                    opponent.attack(warrior);
                    opponent.getWeapon().setDamage(new Random().nextInt(30) + 15);
                    System.out.println("Opponent  hit " + opponent.getWeapon().getDamage());
                    System.out.println(warrior.getName() + " health balance is " + warrior.getHealth());
                }

            }
        }
    }

    private void setSolider() {
        selectorSolider1();
        selectorSolider2();
        selectorSolider3();
    }
    private void selectorSolider3() {
        if (numberSolider == 3) {
            System.out.println("You select Mage!");
            System.out.println("Select name of your hero!");
            String nameMg = new Scanner(System.in).next();
            warrior = new Mage(500, nameMg);
            System.out.println("Your hero is Archer name is --> " + nameMg);
            warrior.setWeapon(new MageWeapon(new Random().nextInt(40) + 15));
            int result = RandomNum.randNum(1, 2);
            if (result == 1) {
                System.out.println("Your opponent Archer");
                opponent = new Archer(400, "Archer");
                opponent.setWeapon(new Arrow((new Random().nextInt(40) + 10)));
            } else if (result == 2) {
                System.out.println("Your opponent Archer");
                opponent = new Swordsmen(300, "Swordsmen");
                opponent.setWeapon(new Sword(new Random().nextInt(30) + 10));
            }
        }
    }

    private void selectorSolider2() {
        if (numberSolider == 2) {
            System.out.println("You select Archer!");
            System.out.println("Select name of your hero!");
            String nameAr = new Scanner(System.in).next();
            warrior = new Archer(400, nameAr);
            System.out.println("Your hero is Archer name is --> " + nameAr);
            warrior.setWeapon(new Arrow((new Random().nextInt(40) + 10)));
            int result = RandomNum.randNum(1, 2);
            if (result == 1) {
                System.out.println("Your opponent Swordsmen");
                opponent = new Swordsmen(300, "Swordsmen");
                opponent.setWeapon(new Sword((new Random().nextInt(30) + 10)));
            } else if (result == 2) {
                opponent = new Mage(500, "Mage");
                opponent.setWeapon(new MageWeapon((new Random().nextInt(40) + 15)));
                System.out.println("Your opponent Mage");
            }
        }
    }

    private void selectorSolider1() {
        if (numberSolider == 1) {
            System.out.println("You select Swordsmen!");
            System.out.println("Select name of your hero!");
            String nameSw = new Scanner(System.in).next();
            warrior = new Swordsmen(200, nameSw);
            System.out.println("Your hero is Swordsmen name is --> " + nameSw);
            warrior.setWeapon(new Sword((new Random().nextInt(30) + 10)));
            int result = RandomNum.randNum(1, 2);
            if (result == 1) {
                System.out.println("Your opponent Archer");
                opponent = new Archer(300, "Archer");
                opponent.setWeapon(new Arrow((new Random().nextInt(40) + 10)));
            } else if (result == 2) {
                System.out.println("Your opponent Mage");
                opponent = new Mage(400, "Mage");
                opponent.setWeapon(new MageWeapon((new Random().nextInt(40) + 20)));
            }
        }
    }

}
