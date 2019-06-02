package by.epam.javatraining.yasenko.lesson06.task04.model.logic;

public class NumberLogic {

    public static boolean ParityCheck(int number) {

        number = number > 0 ? number : -number;

        if (EvenCheck(number) || OddCheck(number)) {
            return true;
        }
        return false;
    }

    public static boolean EvenCheck(int number) {

        number = number > 0 ? number : -number;

        do {

            int digit = (number % 10);
            if (digit % 2 != 0) {
                return false;
            }

        } while ((number /= 10) > 0);

        return true;
    }

    public static boolean OddCheck(int number) {

        number = number > 0 ? number : -number;

        do {

            int digit = (number % 10);
            if (digit % 2 == 0) {
                return false;
            }

        } while ((number /= 10) > 0);

        return true;
    }
}
