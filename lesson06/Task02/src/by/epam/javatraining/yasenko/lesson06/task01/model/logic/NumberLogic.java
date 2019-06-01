package by.epam.javatraining.yasenko.lesson06.task01.model.logic;

public class NumberLogic {

    public static boolean checkIncrease(int number) {

        number = number > 0 ? number : -number;

        int prev = number % 10;

        while ((number /= 10) > 0) {
            int digit = number % 10;

            if (digit > prev) {
                return false;
            }
            prev = digit;
        }
        return true;
    }

    public static boolean checkDecrease(int number) {

        number = number > 0 ? number : -number;

        int prev = number % 10;

        while ((number /= 10) > 0) {
            int digit = number % 10;

            if (digit < prev) {
                return false;
            }
            prev = digit;
        }
        return true;
    }

    public static boolean checkSequence(int number) {

        number = number > 0 ? number : -number;

        if (checkDecrease(number) || checkIncrease(number)) {
            return true;
        }
        return false;
    }

}
