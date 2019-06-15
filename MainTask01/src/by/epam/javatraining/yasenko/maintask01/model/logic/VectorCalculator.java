package by.epam.javatraining.yasenko.maintask01.model.logic;

import by.epam.javatraining.yasenko.maintask01.model.util.VectorUtil;

/**
 * This class contains methods of calculating different double means of vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorCalculator {

    private static final String FIND_MAX_MSG="findMax()";
    private static final String FIND_MIN_MSG="findMin()";
    private static final String FIND_ARITHMETIC_MEAN_MSG="findArithmeticMean()";
    private static final String FIND_GEOMETRIC_MEAN_MSG="findGeometricMean()";


    /**
     * Finds maximum in vector
     *
     * @param vector The vector in which the maximum is sought
     */
    public static double findMax(double[] vector) {

        VectorUtil.checkVector(vector,FIND_MAX_MSG);

        double max = vector[0];      // at start max is first element of vector

        for (int i = 1; i < vector.length; i++) {        //iterate over the vector
            max = max < vector[i] ? vector[i] : max;     //and look for maximum
        }
        return max;
    }

    /**
     * Finds minimum in vector
     *
     * @param vector The vector in which the minimum is sought
     */
    public static double findMin(double[] vector) {

        VectorUtil.checkVector(vector,FIND_MIN_MSG);

        double min = vector[0];   // at start min is first element of vector

        for (int i = 1; i < vector.length; i++) {         //iterate over the vector
            min = min > vector[i] ? vector[i] : min;      //and look for minimum
        }
        return min;
    }

    /**
     * Finds the arithmetic average of the components of this vector
     *
     * @param vector The vector to calculate the arithmetic average of its components
     */
    public static double findArithmeticMean(double[] vector) {

        VectorUtil.checkVector(vector,FIND_ARITHMETIC_MEAN_MSG);

        double result = 0.0;

        for (int i = 0; i < vector.length; i++) {
            result += vector[i];                             //find the sum of the components of the vector
        }

        return result / vector.length;                       // divide this sum by count of the components
    }

    /**
     * Finds the geometric average of the components of this vector
     *
     * @param vector The vector to calculate the geometric average of its components
     */
    public static double findGeometricMean(double[] vector) {

        VectorUtil.checkVector(vector,FIND_GEOMETRIC_MEAN_MSG);

        double result = 1.0;

        for (int i = 0; i < vector.length; i++) {
            result *= vector[i];                                             //multiply all the components of the vector
        }

        return Math.pow(result, 1.0 / vector.length);      //and take the root of this value
    }


}
