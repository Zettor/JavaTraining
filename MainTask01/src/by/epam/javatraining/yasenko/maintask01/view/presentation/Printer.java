package by.epam.javatraining.yasenko.maintask01.view.presentation;

import java.util.Arrays;

public class Printer {

    public static void println(String logic) {

        System.out.println(logic);

    }

    public static void printIntIndex(int logic) {

        System.out.println(logic >= 0 ? "The searching index " + logic
                : "In vector is not such an index " + logic);

    }

    public static void printArrays(double[] logic) {

        System.out.println(logic != null ? Arrays.toString(logic) : "Incorrect data!");

    }
}
