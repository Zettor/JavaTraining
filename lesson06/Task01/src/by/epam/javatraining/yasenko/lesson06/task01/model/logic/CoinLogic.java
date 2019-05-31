package by.epam.javatraining.yasenko.lesson06.task01.model.logic;

import java.util.Random;

public class CoinLogic {

    private static Random rand = new Random();
    private static final int COIN_SIDES = 2;

    public static String getHeadsAndTails(int throwcount) {

        if (throwcount >= 0) {

            int heads = 0;

            for (int i = 0; i < throwcount; i++) {
                heads += rand.nextInt(COIN_SIDES);

            }
            return heads + " heads and " + (throwcount - heads) + " tails.";
        }
        return "Error: incorrect count of throws!";
    }


}
