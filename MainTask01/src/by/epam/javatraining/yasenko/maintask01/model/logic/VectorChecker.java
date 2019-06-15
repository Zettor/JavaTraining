package by.epam.javatraining.yasenko.maintask01.model.logic;

import by.epam.javatraining.yasenko.maintask01.model.util.VectorUtil;

/**
 * This class contains methods of checking vectors for different tasks
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorChecker {

    private static final String CHECK_SEQUENCE_MSG="checkSequence()";

    /**
     * Checks that the components of the vector are a sequence
     *
     * @param vector The vector that is checked for sequence
     */
    public static boolean checkSequence(double[] vector) {

        VectorUtil.checkVector(vector,CHECK_SEQUENCE_MSG);

        return checkIncrease(vector) || checkDecrease(vector);     //sequence can increasing and decreasing

    }

    /**
     * Checks that the components of the vector are increasing
     *
     * @param vector The vector that is checked for increasing sequence
     */
    protected static boolean checkIncrease(double[] vector) {

        boolean result = true;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {  // if sequense is increasing,
                result = false;               // all components must be less than the previous one
                break;
            }
        }

        return result;
    }

    /**
     * Checks that the components of the vector are decreasing
     *
     * @param vector The vector that is checked for decreasing sequence
     */
    protected static boolean checkDecrease(double[] vector) {

        boolean result = true;

        for (int i = 1; i < vector.length; i++) {     // if sequense is increasing,
            if (vector[i] > vector[i - 1]) {          // all components must be greater than the previous one
                result = false;
                break;
            }
        }

        return result;
    }

}
