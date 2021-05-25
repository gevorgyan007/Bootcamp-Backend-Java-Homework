package com.company.GameOfSoldier.utility;

import java.util.Random;

public  class RandomNum {
    public static int randNum(int min, int max) {
        int minV = min, maxV = max;
        int dif = maxV - minV;
        int random = new Random().nextInt(dif);
        return minV + random;
    }
}
