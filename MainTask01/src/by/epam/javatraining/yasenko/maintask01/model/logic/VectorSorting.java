package by.epam.javatraining.yasenko.maintask01.model.logic;

import by.epam.javatraining.yasenko.maintask01.model.util.VectorUtil;

import java.util.Arrays;

/**
 * This class contains methods of sorting elements of vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorSorting {

    private static final String REVERSE_MSG = "reverse()";
    private static final String BUBBLE_SORT_INCREASE_MSG = "bubbleSortIncrease()";
    private static final String BUBBLE_SORT_DECREASE_MSG = "bubbleSortDecrease()";
    private static final String INSERTION_SORT_INCREASE_MSG = "insertionSortIncrease()";
    private static final String INSERTION_SORT_DECREASE_MSG = "insertionSortDecrease()";
    private static final String SELECTION_SORT_INCREASE_MSG = "selectionSortIncrease()";
    private static final String SELECTION_SORT_DECREASE_MSG = "selectionSortDecrease()";
    private static final String MERGE_SORT_INCREASE_MSG = "mergeSortIncrease()";
    private static final String MERGE_SORT_DECREASE_MSG = "mergeSortDecrease()";
    private static final String QUICK_SORT_INCREASE_MSG = "quickSortIncrease()";
    private static final String QUICK_SORT_DECREASE_MSG = "quickSortDecrease()";

    /**
     * Revers elements of the vector
     *
     * @param vector The vector elements which are reversed
     */
    public static void reverse(double[] vector) {

        VectorUtil.checkVectorOnlyNull(vector, REVERSE_MSG);

        int lastIndex = vector.length - 1;

        if (vector.length != 0) {
            for (int i = 0; i <= lastIndex; i++, lastIndex--) {
                VectorUtil.swap(i, lastIndex, vector);
            }
        }
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void bubbleSortIncrease(double[] vector) {

        VectorUtil.checkVectorOnlyNull(vector, BUBBLE_SORT_INCREASE_MSG);

        boolean flag = vector.length != 0;

        //if flag = true we iterate over vector components
        while (flag) {
            flag = false;
            for (int i = 1; i < vector.length; i++) {
                // and if present component less then previous
                if (vector[i] < vector[i - 1]) {
                    VectorUtil.swap(i, i - 1, vector);
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

        VectorUtil.checkVectorOnlyNull(vector, BUBBLE_SORT_DECREASE_MSG);

        boolean flag = true;

        while (flag) {                                  //if flag = true we iterate over vector components
            flag = false;
            for (int i = 1; i < vector.length; i++) {   // and if present component greater then previous
                if (vector[i] > vector[i - 1]) {        //we swap them and we iterate over vector components again
                    VectorUtil.swap(i, i - 1, vector);
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

        VectorUtil.checkVectorOnlyNull(vector, INSERTION_SORT_INCREASE_MSG);

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

        VectorUtil.checkVectorOnlyNull(vector, INSERTION_SORT_DECREASE_MSG);

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

        VectorUtil.checkVectorOnlyNull(vector, SELECTION_SORT_INCREASE_MSG);

        for (int i = 0; i < vector.length; i++) {

            int minIndex = i;

            for (int j = i; j < vector.length; j++) {         //in iteration we search minimum
                if (vector[j] < vector[minIndex]) {           //and swap minimum and element
                    minIndex = j;                             //whose index is equal to the number of present iteration
                }
            }
            VectorUtil.swap(i, minIndex, vector);
        }
    }

    /**
     * Sorts the elements of the vector in descending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void selectionSortDecrease(double[] vector) {

        VectorUtil.checkVectorOnlyNull(vector, SELECTION_SORT_DECREASE_MSG);

        int lastIndex = vector.length;

        for (int i = 0; i < vector.length; i++) {

            int maxIndex = i;


            for (int j = i; j < vector.length; j++) {  //in iteration we search minimum
                if (vector[j] > vector[maxIndex]) {    //and swap maximum and element
                    maxIndex = j;                      //whose index is equal to the number of present iteration
                }
            }
            VectorUtil.swap(i, maxIndex, vector);
            lastIndex--;
        }
    }

    /**
     * Start to sort the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     */
    public static void mergeSortIncrease(double[] vector) {

        VectorUtil.checkVectorOnlyNull(vector, MERGE_SORT_INCREASE_MSG);

        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        doMergeSortIncrease(vector, firstIndex, lastIndex);
    }

    /**
     * Sorts the elements of the vector in ascending order
     *
     * @param vector The vector elements which are sorted
     * @param first  Index of first element
     * @param last   Index of last element
     */
    public static void doMergeSortIncrease(double[] vector, int first, int last) {

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

        VectorUtil.checkVectorOnlyNull(vector, MERGE_SORT_DECREASE_MSG);

        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        doMergeSortDecrease(vector, firstIndex, lastIndex);
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

        VectorUtil.checkVectorOnlyNull(vector, QUICK_SORT_INCREASE_MSG);
        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        doQuickSortIncrease(vector, firstIndex, lastIndex);
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
                    VectorUtil.swap(leftMarker, rightMarker, vector);
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
     * @param vector The vector elements which are sorted
     */
    public static void quickSortDecrease(double[] vector) {

        VectorUtil.checkVectorOnlyNull(vector, QUICK_SORT_DECREASE_MSG);

        int firstIndex = 0;
        int lastIndex = vector.length - 1;
        doQuickSortDecrease(vector, firstIndex, lastIndex);
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
                    VectorUtil.swap(leftMarker, rightMarker, vector);
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
}
