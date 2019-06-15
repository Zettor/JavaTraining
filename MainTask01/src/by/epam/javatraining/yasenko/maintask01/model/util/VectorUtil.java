package by.epam.javatraining.yasenko.maintask01.model.util;

import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * This class contains methods for work with vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorUtil {

    private static final Logger LOGGER = Logger.getRootLogger();

    private static final String ADD_MSG = "add()";
    private static final String REMOVE_MSG = "remove()";

    /**
     * Swapping two elements of the vector
     *
     * @param vector The vector where two components will be swapped
     * @param i      Index of first component
     * @param j      Index of second component
     */
    public static void swap(int i, int j, double... vector) { //swap two elements in array
        double temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    /**
     * Add element to vector
     *
     * @param vector  The vector to which the element is added
     * @param element The element that is added to the vector
     */
    public static double[] add(double[] vector, double element) {

        checkVectorOnlyNull(vector, ADD_MSG);

        vector = Arrays.copyOf(vector, vector.length + 1);
        vector[vector.length - 1] = element;
        return vector;
    }

    /**
     * remove element from vector
     *
     * @param vector The vector from which the element is removed
     */
    public static double[] remove(double[] vector) {

        checkVector(vector, REMOVE_MSG);

        return Arrays.copyOf(vector, vector.length - 1);
    }
    /**
     * check that vector has not zero length and vector is not null
     *
     * @param vector The vector that is checked
     * @param method The method that calls the check
     */
    public static void checkVector(double[] vector, String method) {

        if (vector == null || vector.length == 0) {
            LOGGER.error(method + " method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

    }

    /**
     * check that vector is not null
     *
     * @param vector The vector that is checked
     * @param method The method that calls the check
     */
    public static void checkVectorOnlyNull(double[] vector, String method) {

        if (vector == null) {
            LOGGER.error(method + " method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

    }

}
