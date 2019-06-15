package by.epam.javatraining.yasenko.lesson06.task05.model.logic;

public class NumberLogic {

    public static boolean checkIsSimple(int number) {

        boolean checker = false;

        double limit = (int) Math.sqrt(number);

        if (number > 1) {

            checker = true;

            for (int i = 2; i < limit; i++) {

                if (number % i == 0) {

                    checker = false;
                    break;
                }
            }
        }
        return checker;
    }

}
