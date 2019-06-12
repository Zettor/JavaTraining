package by.epam.javatraining.yasenko.lesson05.task03.model.logic;

import java.util.Random;

public class MoodSensor {

    private static final int MOOD_COUNT = 5;

    private static final String FUNNY = ":D";
    private static final String SMILE = ":)";
    private static final String CRY = ":O";
    private static final String SAD = ":(";
    private static final String NEUTRAL = ":|";


    public static String showMood() {

        Random moodrand = new Random();

        String mood = NEUTRAL;

        switch (moodrand.nextInt(MOOD_COUNT)) {

            case 0:
                mood = FUNNY; break;

            case 1: mood = SMILE; break;

            case 2: mood = CRY; break;

            case 3: mood = SAD; break;
        }
        return mood;
    }
}