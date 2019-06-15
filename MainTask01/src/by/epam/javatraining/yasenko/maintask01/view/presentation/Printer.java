package by.epam.javatraining.yasenko.maintask01.view.presentation;

import org.apache.log4j.Logger;

import java.util.Arrays;


/**
 * This class print results of work of methods for working with vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class Printer {

    private static final Logger LOGGER = Logger.getRootLogger();

    public static void println(String logic) {

        LOGGER.info(logic);
    }

    public static void printIntIndex(int logic) {

        LOGGER.info(logic >= 0 ? "The searching index " + logic
                : "In vector is not such an index " + logic);

    }

    public static void printVector(double[] logic) {

        LOGGER.info(logic != null ? Arrays.toString(logic) : "Incorrect data!");

    }
}
