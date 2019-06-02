package by.epam.javatraining.yasenko.lesson06.task03.model.logic;

public class NumberLogic {

    public static int getFactorial(int number) {

        if (number >= 0) {

            int factorial = 1;

            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }

            return factorial;
        }
        return -1;
    }
}