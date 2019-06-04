package by.epam.javatraining.yasenko.lesson06.task03.model.logic;

public class NumberLogic {

    private static final int ERROR_NUMBER = -1;

    private static final int FIRST_MULTIPLIER = 2;

    public static int getFactorial(int number) {

        int factorial = ERROR_NUMBER;

        if (number >= 0) {

            factorial = 1;

            for (int i = FIRST_MULTIPLIER; i <= number; i++) {
                factorial *= i;
            }

        }
        return factorial;
    }
}