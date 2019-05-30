package by.epam.javatraining.yasenko.lesson05.task01.model.logic;

public class DragonLogic {

    private static final int FIRST_GROWING = 200;
    private static final int SECOND_GROWING = 300;
    private static final int EYES_COUNT = 2;
    private static final int START_HEADS_COUNT = 3;
    private static final int HEADS_AFTER_FIRST_GROWING = 2;


    public static int getHeads(double years) {

        int heads = 0;

        if ((int) years >= 0) {
            heads = START_HEADS_COUNT;

            if (years > SECOND_GROWING) {

                heads += FIRST_GROWING * START_HEADS_COUNT + (SECOND_GROWING - FIRST_GROWING)
                        * HEADS_AFTER_FIRST_GROWING + (years - SECOND_GROWING);

            } else if (years > FIRST_GROWING) {

                heads += FIRST_GROWING * START_HEADS_COUNT + (years - FIRST_GROWING)
                        * HEADS_AFTER_FIRST_GROWING;

            } else {

                heads += years * START_HEADS_COUNT;

            }
        }

        return heads;
    }

    public static int getEyes(double years) {

        return getHeads(years) * EYES_COUNT;

    }
}

