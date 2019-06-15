package by.epam.javatraining.yasenko.maintask01.controller.main;


import by.epam.javatraining.yasenko.maintask01.model.logic.VectorCalculator;
import by.epam.javatraining.yasenko.maintask01.model.logic.VectorChecker;
import by.epam.javatraining.yasenko.maintask01.model.logic.VectorSearching;
import by.epam.javatraining.yasenko.maintask01.model.logic.VectorSorting;
import by.epam.javatraining.yasenko.maintask01.model.util.VectorInitialization;
import by.epam.javatraining.yasenko.maintask01.model.util.VectorUtil;
import by.epam.javatraining.yasenko.maintask01.view.presentation.Printer;

/**
 * This class demonstrates work of methods for working with vectors
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        int n = 5;
        double[] vector = new double[n];

        ////////testing vector initialization and its output///////////

        VectorInitialization.randInit(vector);

        VectorUtil.add(vector, 4.0);

        Printer.printVector(vector);

        ///////extreme value search testing////////////////////////////

        double max = VectorCalculator.findMax(vector);
        double min =VectorCalculator.findMax(vector);

        Printer.println("Maximum: " + max);
        Printer.println("Minimum: " + min);

        ///////Arithmetic and Geometric means search testing///////////

        double arithmetic = VectorCalculator.findArithmeticMean(vector);
        double geometric = VectorCalculator.findGeometricMean(vector);

        Printer.println("Arithmetic Mean: " + arithmetic);
        Printer.println("Geometric Mean: " + geometric);

        ///////sequencing testing//////////////////////////////////////

        boolean checker = VectorChecker.checkSequence(vector);

        Printer.println("Result of sequence check is " + checker);

        ///////testing of searching local minimum and maximum positions//

        int localMinIndex = VectorSearching.findLocalMin(vector);
        int localMaxIndex = VectorSearching.findLocalMax(vector);

        Printer.printIntIndex(localMinIndex);
        Printer.printIntIndex(localMaxIndex);

        ///////testing of linear search////////////////////////////////

        double element = 4.0;

        int elementIndex = VectorSearching.searchLinear(vector, element);

        Printer.printIntIndex(elementIndex);

        /////// reverse testing////////////////////////////////////////

        VectorSorting.reverse(vector);

        Printer.println("Reverse vector:");
        Printer.printVector(vector);

        ///////bubble sort increase testing//////////////////////////////////////

        VectorSorting.bubbleSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////testing of binary search////////////////////////////////

        elementIndex = VectorSearching.searchBinary(vector, element);

        Printer.printIntIndex(elementIndex);

        ///////insertion sort decrease testing//////////////////////////////////////

        VectorSorting.insertionSortDecrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////selection sort increase testing//////////////////////////////////////

        VectorSorting.selectionSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////merge sort decrease testing//////////////////////////////////////

        int firsIndex = 0;
        int lastIndex = vector.length - 1;

        VectorSorting.mergeSortDecrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////quick sort increase testing//////////////////////////////////////


        VectorSorting.quickSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

    }
}
