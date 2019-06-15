package by.epam.javatraining.yasenko.maintask01.model.logic;


import by.epam.javatraining.yasenko.maintask01.model.util.VectorUtil;

import java.util.Arrays;

/**
 * This class contains methods of searching different elements of vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorSearching {

    private static final int WRONG_INDEX = -1;


    private static final String FIND_LOCAL_MAX_MSG="findLocalMax()";
    private static final String FIND_LOCAL_MIN_MSG="findLocalMin()";
    private static final String SEARCH_LINEAR_MSG="searchLinear()";
    private static final String SEARCH_BINARY_MSG="searchBinary()";


    /**
     * Finds local maximum in vector
     *
     * @param vector The vector in which the local maximum is sought
     */
    public static int findLocalMax(double[] vector) {

        VectorUtil.checkVector(vector,FIND_LOCAL_MAX_MSG);

        int result = WRONG_INDEX;                                                              //if the vector does not contain a local maximum return -1

        for (int i = 1; i < vector.length - 1; i++) {

            if ((i == 0 && vector[i] > vector[i + 1])
                    || (i == vector.length - 1 && vector[i] > vector[i - 1])
                    || (vector[i] > vector[i - 1] && vector[i] > vector[i + 1])) {    //local maximum is an element
                result = i;                                                           //that is larger than any of its neighbors
                break;
            }
        }
        return result;
    }

    /**
     * Finds local minimum in vector
     *
     * @param vector The vector in which the local minimum is sought
     */
    public static int findLocalMin(double[] vector) {

        VectorUtil.checkVector(vector,FIND_LOCAL_MIN_MSG);

        int result = WRONG_INDEX;                                                      //if the vector does not contain a local maximum
        //return -1
        for (int i = 1; i < vector.length - 1; i++) {

            if ((i == 0 && vector[i] < vector[i + 1])
                    || (i == vector.length - 1 && vector[i] < vector[i - 1])
                    || (vector[i] < vector[i - 1] && vector[i] < vector[i + 1])) {     //local minimum is an element
                result = i;                                                   //that is less than any of its neighbors
                break;
            }
        }
        return result;
    }

    /**
     * Finds index of element in vector
     *
     * @param vector  The vector in which the element index is searched
     * @param element The element whose index is searched
     */
    public static int searchLinear(double[] vector, double element) {

        VectorUtil.checkVector(vector,SEARCH_LINEAR_MSG);

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < vector.length; i++) {        //iterate over the components of the vector
            if (element == vector[i]) {                  // and look for our element
                result = i;
                break;
            }
        }
        return result;
    }

    /**
     * Finds index of element in vector
     *
     * @param vector  The vector in which the element index is searched
     * @param element The element whose index is searched
     */
    public static int searchBinary(double[] vector, double element) {

        VectorUtil.checkVector(vector,SEARCH_BINARY_MSG);

        int firstIndex = 0;
        int lastIndex = vector.length;
        int result = WRONG_INDEX;

        if (VectorChecker.checkIncrease(vector)) {    //vector should be sorted
            while (firstIndex < lastIndex && firstIndex >= 0 && lastIndex <= vector.length) {

                int mid = firstIndex + (lastIndex - firstIndex) / 2;      //index of middle element

                if (vector[mid] == element) {
                    result = mid;
                    break;
                }                                                 //break the vector into pieces discarding unnecessary with "mid" Index
                if (vector[mid] > element) {                     // and look for element
                    lastIndex = mid;
                } else
                    firstIndex = mid + 1;
            }
        }
        return result;
    }







}
