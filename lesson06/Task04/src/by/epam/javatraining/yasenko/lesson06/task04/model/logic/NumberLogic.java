package by.epam.javatraining.yasenko.lesson06.task04.model.logic;

public class NumberLogic {

    public static boolean checkParity(int number) {

        number = number > 0 ? number : -number;

        return checkEven(number) || checkOdd(number) ? true : false;
    }

    public static boolean checkEven(int number) {

        number = number > 0 ? number : -number;

        boolean checker = true;

        while ((number / 10) > 0) {

            int digit = (number % 10);
            number /= 10;

            if (digit % 2 != 0) {
                checker = false;
            }

        }
        return checker;
    }

    public static boolean checkOdd(int number) {

        number = number > 0 ? number : -number;

        boolean checker = true;

        while ((number / 10) > 0) {

            int digit = (number % 10);
            number /= 10;

            if (digit % 2 == 0) {
                checker = false;
            }

        }
        return checker;
    }
}
