package by.epam.javatraining.yasenko.maintask01.controller.main;


import by.epam.javatraining.yasenko.maintask01.model.logic.VectorLogic;
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

        VectorLogic.randInit(vector);

        VectorLogic.add(vector, 4.0);

        Printer.printVector(vector);

        ///////extreme value search testing////////////////////////////

        double max = VectorLogic.findMax(vector);
        double min = VectorLogic.findMax(vector);

        Printer.println("Maximum: " + max);
        Printer.println("Minimum: " + min);

        ///////Arithmetic and Geometric means search testing///////////

        double arithmetic = VectorLogic.findArithmeticMean(vector);
        double geometric = VectorLogic.findGeometricMean(vector);

        Printer.println("Arithmetic Mean: " + arithmetic);
        Printer.println("Geometric Mean: " + geometric);

        ///////sequencing testing//////////////////////////////////////

        boolean checker = VectorLogic.checkSequence(vector);

        Printer.println("Result of sequence check is " + checker);

        ///////testing of searching local minimum and maximum positions//

        int localMinIndex = VectorLogic.findLocalMin(vector);
        int localMaxIndex = VectorLogic.findLocalMax(vector);

        Printer.printIntIndex(localMinIndex);
        Printer.printIntIndex(localMaxIndex);

        ///////testing of linear search////////////////////////////////

        double element = 4.0;

        int elementIndex = VectorLogic.searchLinear(vector, element);

        Printer.printIntIndex(elementIndex);

        /////// reverse testing////////////////////////////////////////

        VectorLogic.reverse(vector);

        Printer.println("Reverse vector:");
        Printer.printVector(vector);

        ///////bubble sort increase testing//////////////////////////////////////

        VectorLogic.bubbleSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////testing of binary search////////////////////////////////

        elementIndex = VectorLogic.searchBinary(vector, element);

        Printer.printIntIndex(elementIndex);

        ///////insertion sort decrease testing//////////////////////////////////////

        VectorLogic.insertionSortDecrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////selection sort increase testing//////////////////////////////////////

        VectorLogic.selectionSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////merge sort decrease testing//////////////////////////////////////

        int firsIndex = 0;
        int lastIndex = vector.length - 1;

        VectorLogic.mergeSortDecrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

        ///////quick sort increase testing//////////////////////////////////////


        VectorLogic.quickSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printVector(vector);

    }
}
