package by.epam.javatraining.yasenko.lesson06.task02.model.logic;

public class NumberLogic {

    public static boolean checkIncrease(int number) {

        number = number > 0 ? number : -number;

        boolean checker = true;

        int prev = number % 10;

        while ((number /= 10) > 0) {
            int digit = number % 10;

            if (digit > prev) {
                checker = false;
            }

            prev = digit;
        }
        return checker;
    }

    public static boolean checkDecrease(int number) {

        number = number > 0 ? number : -number;

        boolean checker = true;

        int prev = number % 10;

        while ((number /= 10) > 0) {
            int digit = number % 10;

            if (digit < prev) {
                checker = false;
            }

            prev = digit;
        }
        return checker;
    }

    public static boolean checkSequence(int number) {

        number = number > 0 ? number : -number;

        return checkDecrease(number) || checkIncrease(number)?true:false;
    }

}
