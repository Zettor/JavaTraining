package by.epam.javatraining.yasenko.lesson05.task03.model.logic;

import java.util.Random;

public class MoodSensor {

    private static int MOOD_COUNT = 5;

    public static String RandomMood() {

        Random moodrand = new Random();

        int moodnum = moodrand.nextInt(MOOD_COUNT);

        return showMood(moodnum);

    }

    public static String showMood(int moodnum) {

        switch (moodnum) {

            case 0:
                return ":D";

            case 1:
                return ":)";

            case 2:
                return ":O";

            case 3:
                return ":(";
            case 4:
                return ":|";

            default:
                return "Error: Something went wrong!";
        }
    }
}
