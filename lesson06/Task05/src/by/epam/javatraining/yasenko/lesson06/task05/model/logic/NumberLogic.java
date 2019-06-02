package by.epam.javatraining.yasenko.lesson06.task05.model.logic;

public class NumberLogic {

    public static boolean IsSimple(int number) {

        if (number > 1) {

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
