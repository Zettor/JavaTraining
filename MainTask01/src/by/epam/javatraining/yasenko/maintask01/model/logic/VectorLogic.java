package by.epam.javatraining.yasenko.maintask01.model.logic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * This class contains methods for working with vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 0.8
 */
public class VectorLogic {

    private static final String ERROR_MSG = "ERROR: Incorrect data!";

    public static void randInitVector(double[] vector) {

        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10); //filling this vector with random numbers
        }

    }

    public static String findMax(double[] vector) {

        if (vector.length == 0) {    //check that the vector has at least one component
            return ERROR_MSG;
        }

        double max = vector[0];      // at start max is first element of vector

        for (int i = 1; i < vector.length; i++) {        //iterate over the vector
            max = max < vector[i] ? vector[i] : max;     //and look for maximum
        }
        return Double.toString(max);
    }

    public static String findMin(double[] vector) {

        if (vector.length == 0) {  //check that the vector has at least one component
            return ERROR_MSG;
        }

        double min = vector[0];   // at start min is first element of vector

        for (int i = 1; i < vector.length; i++) {         //iterate over the vector
            min = min > vector[i] ? vector[i] : min;      //and look for minimum
        }
        return Double.toString(min);
    }

    public static String findArithmeticMean(double[] vector) {

        if (vector.length == 0) {     //check that the vector has at least one component
            return ERROR_MSG;
        }

        double result = 0.0;

        for (int i = 0; i < vector.length; i++) {
            result += vector[i];                   //find the sum of the components of the vector
        }

        return Double.toString(result / vector.length);   // divide this sum by count of the components
    }

    public static String findGeometricMean(double[] vector) {

        if (vector.length == 0) {                                             //check that the vector has at least one component
            return ERROR_MSG;
        }

        double result = 1.0;

        for (int i = 0; i < vector.length; i++) {
            result *= vector[i];                                             //multiply all the components of the vector
        }

        return Double.toString(Math.pow(result, 1.0 / vector.length));      //and take the root of this value
    }

    public static boolean checkSequence(double[] vector) {

        if (vector.length == 0) {                                  //check that the vector has at least one component
            return false;
        }

        return checkIncrease(vector) || checkDecrease(vector);     //sequence can increasing and decreasing

    }

    public static boolean checkIncrease(double[] vector) {

        if (vector.length == 0) {           //check that the vector has at least one component
            return false;
        }

        boolean result = true;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {  // if sequense is increasing,
                result = false;               // all components must be less than the previous one
                break;
            }
        }

        return result;
    }

    public static boolean checkDecrease(double[] vector) {

        if (vector.length == 0) {                     //check that the vector has at least one component
            return false;
        }

        boolean result = true;

        for (int i = 1; i < vector.length; i++) {     // if sequense is increasing,
            if (vector[i] > vector[i - 1]) {          // all components must be greater than the previous one
                result = false;
                break;
            }
        }

        return result;
    }

    public static int findLocalMax(double[] vector) {

        int result = -1;                                                     //if the vector does not contain a local maximum
        //return -1
        for (int i = 1; i < vector.length - 1; i++) {

            if ((i == 0 && vector[i] > vector[i + 1])
                    || (i == vector.length - 1 && vector[i] > vector[i - 1])
                    || (vector[i] > vector[i - 1] && vector[i] > vector[i + 1])) {    //local maximum is an element
                result = i;                                                  //that is larger than any of its neighbors
                break;
            }
        }
        return result;
    }

    public static int findLocalMin(double[] vector) {

        int result = -1;                                                      //if the vector does not contain a local maximum
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

    public static int searchLinear(double[] vector, double element) {

        int result = -1;                                 //if the vector does not contain this element
        //return -1
        for (int i = 0; i < vector.length; i++) {        //iterate over the components of the vector
            if (element == vector[i]) {                  // and look for our element
                result = i;
            }
        }
        return result;
    }

    public static int searchBinary(double[] vector, double element) {

        int firstIndex = 0;
        int lastIndex = vector.length;
        int result = -1;

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

    public static double[] reverse(double[] vector) {

        if (vector.length == 0) {    //check that the vector has at least one component
            return null;
        }

        int lastIndex = vector.length - 1;

        for (int i = 0; i <= lastIndex; i++, lastIndex--) {

            double temp = vector[i];
            vector[i] = vector[lastIndex];                    //swap the edges of the vector with changing these edges
            vector[lastIndex] = temp;

        }
        return vector;
    }

    public static double[] bubbleSortIncrease(double[] vector) {

        if (vector.length == 0) {        //check that the vector has at least one component
            return null;
        }

        boolean flag = true;

        while (flag) {                                       //if flag = true we iterate over vector components
            flag = false;
            for (int i = 1; i < vector.length; i++) {

                if (vector[i] < vector[i - 1]) {             // and if present component less then previous
                    double temp = vector[i];                 //we swap them and we iterate over vector components again
                    vector[i] = vector[i - 1];
                    vector[i - 1] = temp;
                    flag = true;
                }
            }
        }
        return vector;
    }

    public static double[] bubbleSortDecrease(double[] vector) {

        if (vector.length == 0) {           //check that the vector has at least one component
            return null;
        }

        boolean flag = true;

        while (flag) {                                  //if flag = true we iterate over vector components
            flag = false;
            for (int i = 1; i < vector.length; i++) {   // and if present component greater then previous
                if (vector[i] > vector[i - 1]) {        //we swap them and we iterate over vector components again
                    double temp = vector[i];
                    vector[i] = vector[i - 1];
                    vector[i - 1] = temp;
                    flag = true;
                }
            }
        }
        return vector;
    }

    public static double[] insertionSortIncrease(double[] vector) {

        if (vector.length == 0) {             //check that the vector has at least one component
            return null;
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
        return vector;
    }

    public static double[] insertionSortDecrease(double[] vector) {

        if (vector.length == 0) {                     //check that the vector has at least one component
            return null;
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
        return vector;
    }

    public static double[] selectionSortIncrease(double[] vector) {

        if (vector.length == 0) {                  //check that the vector has at least one component
            return null;
        }

        for (int i = 0; i < vector.length; i++) {

            int minIndex = i;

            for (int j = i; j < vector.length; j++) {         //in iteration we search minimum
                if (vector[j] < vector[minIndex]) {           //and swap minimum and element
                    minIndex = j;                             //whose index is equal to the number of present iteration
                }
            }
            double temp = vector[i];
            vector[i] = vector[minIndex];
            vector[minIndex] = temp;
        }

        return vector;
    }

    public static double[] selectionSortDecrease(double[] vector) {

        if (vector.length == 0) {                      //check that the vector has at least one component
            return null;
        }

        for (int i = 0; i < vector.length; i++) {

            int maxIndex = i;

            for (int j = i; j < vector.length; j++) {  //in iteration we search minimum
                if (vector[j] > vector[maxIndex]) {    //and swap maximum and element
                    maxIndex = j;                       //whose index is equal to the number of present iteration
                }
            }
            double temp = vector[i];
            vector[i] = vector[maxIndex];
            vector[maxIndex] = temp;
        }

        return vector;
    }

    public static double[] mergeSortIncrease(double[] vector) {

        if (vector.length == 0) {
            return null;
        }

        int firstIndex = 0;
        int lastIndex = vector.length - 1;

        recMergeSortIncrease(vector, firstIndex, lastIndex);

        return vector;
    }

    public static void recMergeSortIncrease(double[] vector, int first, int last) {

        if (last > first) {
            int mid = first + (last - first) / 2;
            recMergeSortIncrease(vector, first, mid);
            recMergeSortIncrease(vector, mid + 1, last);

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

    public static double[] mergeSortDecrease(double[] vector) {

        if (vector.length == 0) {
            return null;
        }

        int firstIndex = 0;
        int lastIndex = vector.length - 1;

        recMergeSortDecrease(vector, firstIndex, lastIndex);

        return vector;
    }

    public static void recMergeSortDecrease(double[] vector, int first, int last) {

        if (last > first) {
            int mid = first + (last - first) / 2;
            recMergeSortDecrease(vector, first, mid);
            recMergeSortDecrease(vector, mid + 1, last);

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

    public static double[] quickSortIncrease(double[] vector) {

        if (vector.length == 0) {
            return null;
        }

        recQuickSortIncrease(vector, 0, vector.length - 1);

        return vector;
    }

    public static void recQuickSortIncrease(double[] vector, int leftBorder, int rightBorder) {

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
                    double temp = vector[leftMarker];
                    vector[leftMarker] = vector[rightMarker];
                    vector[rightMarker] = temp;
                    leftMarker++;
                    rightMarker--;
                }
            }
            if (leftBorder < rightMarker) {
                recQuickSortIncrease(vector, leftBorder, rightMarker);
            }
            if (rightBorder > leftMarker) {
                recQuickSortIncrease(vector, leftMarker, rightBorder);
            }
        }
    }

    public static double[] quickSortDecrease(double[] vector) {

        if (vector.length == 0) {
            return null;
        }

        recQuickSortDecrease(vector, 0, vector.length - 1);

        return vector;
    }

    public static void recQuickSortDecrease(double[] vector, int leftBorder, int rightBorder) {

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
                    double temp = vector[leftMarker];
                    vector[leftMarker] = vector[rightMarker];
                    vector[rightMarker] = temp;
                    leftMarker++;
                    rightMarker--;
                }
            }
            if (leftBorder < rightMarker) {
                recQuickSortDecrease(vector, leftBorder, rightMarker);
            }
            if (rightBorder > leftMarker) {
                recQuickSortDecrease(vector, leftMarker, rightBorder);
            }
        }
    }

    public static double[] add(double[] vector, double element) {

        double[] temp = Arrays.copyOf(vector, vector.length + 1);
        temp[vector.length] = element;
        return temp;
    }

    public static double[] remove(double[] vector, double element) {

        return Arrays.copyOf(vector, vector.length - 1);

    }

}
