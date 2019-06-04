package by.epam.javatraining.yasenko.lesson06.task01.model.logic;

import java.util.Random;

public class CoinLogic {


    private static final int COIN_SIDES = 2;

    private static final String STRING_TASKS = "Head and tails: ";

    public static String getHeadsAndTails(int throwcount) {

        Random rand = new Random();

        String result = "Error: incorrect count of throws!";

        if (throwcount > 0) {

            int heads = 0;

            for (int i = 0; i < throwcount; i++) {
                heads += rand.nextInt(COIN_SIDES);

            }
            result =STRING_TASKS + heads + " " + (throwcount - heads);
        }
        return result;
    }


}
