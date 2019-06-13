package by.epam.javatraining.yasenko.maintask01.model.logic;


import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

/**
 * This class contains methods for working with vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorLogic {

    private static final Logger LOGGER = Logger.getRootLogger();

    private static final String ERROR_MSG = "ERROR: Incorrect data!";
    private static final int WRONG_INDEX = -1;

    /**
     * Swapping two elements of the vector
     *
     * @param vector The vector where two components will be swapped
     * @param i      Index of first component
     * @param j      Index of second component
     */
    private static void swap(int i, int j, double... vector) { //swap two elements in array
        double temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    /**
     * Fills the vector with random numbers
     *
     * @param vector The vector that must be filled
     */
    public static void randInit(double[] vector) {

        if (vector == null || vector.length == 0) {
            LOGGER.error("randInit() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10); //filling this vector with random numbers
        }

    }

    /**
     * Finds maximum in vector
     *
     * @param vector The vector in which the maximum is sought
     */
    public static double findMax(double[] vector) {

        if (vector == null || vector.length == 0) {
            LOGGER.error("findMax() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

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

        if (vector == null || vector.length == 0) {
            LOGGER.error("findMin() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

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

        if (vector == null || vector.length == 0) {
            LOGGER.error("findArithmeticMean() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

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

        if (vector == null || vector.length == 0) {
            LOGGER.error("findGeometricMean() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

        double result = 1.0;

        for (int i = 0; i < vector.length; i++) {
            result *= vector[i];                                             //multiply all the components of the vector
        }

        return Math.pow(result, 1.0 / vector.length);      //and take the root of this value
    }

    /**
     * Checks that the components of the vector are a sequence
     *
     * @param vector The vector that is checked for sequence
     */
    public static boolean checkSequence(double[] vector) {

        if (vector == null || vector.length == 0) {
            LOGGER.error("checkSequence() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

        return checkIncrease(vector) || checkDecrease(vector);     //sequence can increasing and decreasing

    }

    /**
     * Checks that the components of the vector are increasing
     *
     * @param vector The vector that is checked for increasing sequence
     */
    private static boolean checkIncrease(double[] vector) {

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
    private static boolean checkDecrease(double[] vector) {

        boolean result = true;

        for (int i = 1; i < vector.length; i++) {     // if sequense is increasing,
            if (vector[i] > vector[i - 1]) {          // all components must be greater than the previous one
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * Finds local maximum in vector
     *
     * @param vector The vector in which the local maximum is sought
     */
    public static int findLocalMax(double[] vector) {

        if (vector == null || vector.length == 0) {
            LOGGER.error("findLocalMax() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

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

        if (vector == null || vector.length == 0) {
            LOGGER.error("findLocalMin() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

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

        if (vector == null || vector.length == 0) {
            LOGGER.error("searchLinear() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < vector.length; i++) {        //iterate over the components of the vector
            if (element == vector[i]) {                  // and look for our element
                result = i;
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

        if (vector == null || vector.length == 0) {
            LOGGER.error("searchBinary() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

        int firstIndex = 0;
        int lastIndex = vector.length;
        int result = WRONG_INDEX;

        if (checkIncrease(vector)) {    //vector should be sorted
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

    /**
     * Revers elements of the vector
     *
     * @param vector The vector elements which are reversed
     */
    public static void reverse(double[] vector) {

        if (vector == null) {
            LOGGER.error("reverse() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        int lastIndex = vector.length - 1;

        if (vector.length != 0) {
            for (int i = 0; i <= lastIndex; i++, lastIndex--) {
                swap(i, lastIndex, vector);
            }
        }
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void bubbleSortIncrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("bubbleSortIncrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        boolean flag = vector.length != 0;

        while (flag) {                                       //if flag = true we iterate over vector components
            flag = false;
            for (int i = 1; i < vector.length; i++) {

                if (vector[i] < vector[i - 1]) {             // and if present component less then previous
                    swap(i, i - 1, vector);
                    flag = true;
                }
            }
        }

    }

    /**
     * Sorts the elements of the vector in descending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void bubbleSortDecrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("bubbleSortDecrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        boolean flag = true;

        while (flag) {                                  //if flag = true we iterate over vector components
            flag = false;
            for (int i = 1; i < vector.length; i++) {   // and if present component greater then previous
                if (vector[i] > vector[i - 1]) {        //we swap them and we iterate over vector components again
                    swap(i, i - 1, vector);
                    flag = true;
                }
            }
        }
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void insertionSortIncrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("insertionSortIncrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < vector.length; i++) {

            double value = vector[i];            // we take value from vector
            int j;

            for (j = i - 1; j >= 0; j--) {

                if (value < vector[j]) {        //and search position for inserts of this element
                    vector[j + 1] = vector[j];
                } else {
                    break;
                }

            }
            vector[j + 1] = value;
        }
    }

    /**
     * Sorts the elements of the vector in descending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void insertionSortDecrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("insertionSortDecrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < vector.length; i++) {

            double value = vector[i];                // we take value from vector
            int j;

            for (j = i - 1; j >= 0; j--) {           //and search position for inserts of this element

                if (value > vector[j]) {
                    vector[j + 1] = vector[j];
                } else {
                    break;
                }

            }
            vector[j + 1] = value;
        }
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void selectionSortIncrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("selectionSortIncrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < vector.length; i++) {

            int minIndex = i;

            for (int j = i; j < vector.length; j++) {         //in iteration we search minimum
                if (vector[j] < vector[minIndex]) {           //and swap minimum and element
                    minIndex = j;                             //whose index is equal to the number of present iteration
                }
            }
            swap(i, minIndex, vector);
        }
    }

    /**
     * Sorts the elements of the vector in descending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void selectionSortDecrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("selectionSortDecrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < vector.length; i++) {

            int maxIndex = i;

            for (int j = i; j < vector.length; j++) {  //in iteration we search minimum
                if (vector[j] > vector[maxIndex]) {    //and swap maximum and element
                    maxIndex = j;                      //whose index is equal to the number of present iteration
                }
            }
            swap(i, maxIndex, vector);
        }
    }

    /**
     * Start to sort the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void mergeSortIncrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("mergeSortIncrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        int firstIndex=0;
        int lastIndex=vector.length-1;
        doMergeSortIncrease(vector,firstIndex,lastIndex);
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     * @param first  Index of first element
     * @param last   Index of last element
     */
    public static void doMergeSortIncrease(double[] vector, int first, int last) {

        if (vector == null) {
            LOGGER.error("mergeSortIncrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        if (last > first) {
            int mid = first + (last - first) / 2;
            doMergeSortIncrease(vector, first, mid);
            doMergeSortIncrease(vector, mid + 1, last);

            double[] buf = Arrays.copyOf(vector, vector.length);

            for (int k = first; k <= last; k++)
                buf[k] = vector[k];

            int i = first, j = mid + 1;
            for (int k = first; k <= last; k++) {

                if (i > mid) {
                    vector[k] = buf[j];
                    j++;
                } else if (j > last) {
                    vector[k] = buf[i];
                    i++;
                } else if (buf[j] < buf[i]) {
                    vector[k] = buf[j];
                    j++;
                } else {
                    vector[k] = buf[i];
                    i++;
                }
            }
        }
    }

    /**
     * Start to sort the elements of the vector in descending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void mergeSortDecrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("mergeSortDecrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        int firstIndex=0;
        int lastIndex=vector.length-1;
        doMergeSortDecrease(vector,firstIndex,lastIndex);
    }

    /**
     * Sorts the elements of the vector in descending order
     *
     * @param vector The vector elements which are sorted
     * @param first  Index of first element
     * @param last   Index of last element
     */
    public static void doMergeSortDecrease(double[] vector, int first, int last) {

        if (last > first) {
            int mid = first + (last - first) / 2;
            doMergeSortDecrease(vector, first, mid);
            doMergeSortDecrease(vector, mid + 1, last);

            double[] buf = Arrays.copyOf(vector, vector.length);

            for (int k = first; k <= last; k++)
                buf[k] = vector[k];

            int i = first, j = mid + 1;
            for (int k = first; k <= last; k++) {

                if (i > mid) {
                    vector[k] = buf[j];
                    j++;
                } else if (j > last) {
                    vector[k] = buf[i];
                    i++;
                } else if (buf[j] > buf[i]) {
                    vector[k] = buf[j];
                    j++;
                } else {
                    vector[k] = buf[i];
                    i++;
                }
            }
        }
    }

    public static void quickSortIncrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("quickSortIncrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        int firstIndex=0;
        int lastIndex=vector.length-1;
        doQuickSortIncrease(vector,firstIndex,lastIndex);
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector      The vector elements which are sorted
     * @param leftBorder  Index of first element
     * @param rightBorder Index of last element
     */
    private static void doQuickSortIncrease(double[] vector, int leftBorder, int rightBorder) {

        if (leftBorder < rightBorder) {

            double pivot = vector[leftBorder + (rightBorder - leftBorder) / 2];

            int leftMarker = leftBorder;
            int rightMarker = rightBorder;

            while (leftMarker <= rightMarker) {

                while (vector[leftMarker] < pivot) {
                    leftMarker++;
                }

                while (vector[rightMarker] > pivot) {
                    rightMarker--;
                }

                if (leftMarker <= rightMarker) {
                    swap(leftMarker, rightMarker, vector);
                    leftMarker++;
                    rightMarker--;
                }
            }
            if (leftBorder < rightMarker) {
                doQuickSortIncrease(vector, leftBorder, rightMarker);
            }
            if (rightBorder > leftMarker) {
                doQuickSortIncrease(vector, leftMarker, rightBorder);
            }
        }
    }

    /**
     * Start to sort the elements of the vector in descending order
     *
     * @param vector      The vector elements which are sorted
     */
    public static void quickSortDecrease(double[] vector) {

        if (vector == null) {
            LOGGER.error("quickSortDecrease() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

        int firstIndex=0;
        int lastIndex=vector.length-1;
        doQuickSortDecrease(vector,firstIndex,lastIndex);
    }

    /**
     * Sorts the elements of the vector in descending order
     *
     * @param vector      The vector elements which are sorted
     * @param leftBorder  Index of first element
     * @param rightBorder Index of last element
     */
    private static void doQuickSortDecrease(double[] vector, int leftBorder, int rightBorder) {


        if (leftBorder < rightBorder) {

            double pivot = vector[leftBorder + (rightBorder - leftBorder) / 2];

            int leftMarker = leftBorder;
            int rightMarker = rightBorder;

            while (leftMarker <= rightMarker) {

                while (vector[leftMarker] > pivot) {
                    leftMarker++;
                }

                while (vector[rightMarker] < pivot) {
                    rightMarker--;
                }

                if (leftMarker <= rightMarker) {
                    swap(leftMarker, rightMarker, vector);
                    leftMarker++;
                    rightMarker--;
                }
            }
            if (leftBorder < rightMarker) {
                doQuickSortDecrease(vector, leftBorder, rightMarker);
            }
            if (rightBorder > leftMarker) {

                doQuickSortDecrease(vector, leftMarker, rightBorder);
            }
        }
    }

    /**
     * Add element to vector
     *
     * @param vector  The vector to which the element is added
     * @param element The element that is added to the vector
     */
    public static double[] add(double[] vector, double element) {

        if (vector == null) {
            LOGGER.error("add() method got incorrect input data(array == null) ");
            throw new IllegalArgumentException();
        }

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

        if (vector == null || vector.length == 0) {
            LOGGER.error("remove() method got incorrect input data(array == null or vector.length == 0) ");
            throw new IllegalArgumentException();
        }

        return Arrays.copyOf(vector, vector.length - 1);

    }

}
