package by.epam.javatraining.yasenko.lesson06.task03.view.presentation;

public class Printer {

    public static void println(int result) {

        System.out.println("Factorial "
                + (result > 0 ? "is " + result: "does not exist"));

    }

}
