package com.platzi.javatest.util.ejemplos;

public class Player {

    private static Dice dice;
    private static int minNUmberWin = 4;

    public Player(Dice dice, int minNUmberWin) {
        this.dice = dice;
        this.minNUmberWin = minNUmberWin;
    }

    public static boolean play(){
        int diceNumber = dice.roll();
        return diceNumber>= minNUmberWin ? true : false;
    }
}
