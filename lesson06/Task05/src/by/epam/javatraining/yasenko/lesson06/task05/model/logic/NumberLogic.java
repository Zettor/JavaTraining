package by.epam.javatraining.yasenko.lesson06.task05.model.logic;

public class NumberLogic {

    public static boolean checkIsSimple(int number) {

        boolean checker = false;

        if (number > 1) {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    checker = false;
                }
            }
            checker = true;
        }
        return checker;
    }

}
