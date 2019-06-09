package by.epam.javatraining.yasenko.maintask01.controller.main;


import by.epam.javatraining.yasenko.maintask01.model.logic.VectorLogic;
import by.epam.javatraining.yasenko.maintask01.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        double[] vector = new double[n];

        ////////testing vector initialization and its output///////////

        VectorLogic.randInitVector(vector);

        vector = VectorLogic.add(vector, 4.0);

        Printer.printArrays(vector);

        ///////extreme value search testing////////////////////////////

        String max = VectorLogic.findMax(vector);
        String min = VectorLogic.findMax(vector);

        Printer.println("Maximum: " + max);
        Printer.println("Minimum: " + min);

        ///////Arithmetic and Geometric means search testing///////////

        String arithmetic = VectorLogic.findArithmeticMean(vector);
        String geometric = VectorLogic.findGeometricMean(vector);

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

        vector = VectorLogic.reverse(vector);

        Printer.println("Reverse vector:");
        Printer.printArrays(vector);

        ///////bubble sort increase testing//////////////////////////////////////

        vector = VectorLogic.bubbleSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printArrays(vector);

        ///////testing of binary search////////////////////////////////

        elementIndex = VectorLogic.searchBinary(vector, element);

        Printer.printIntIndex(elementIndex);

        ///////insertion sort decrease testing//////////////////////////////////////

        vector = VectorLogic.insertionSortDecrease(vector);

        Printer.println("Sorted vector:");
        Printer.printArrays(vector);

        ///////selection sort increase testing//////////////////////////////////////

        vector = VectorLogic.selectionSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printArrays(vector);

        ///////merge sort decrease testing//////////////////////////////////////

        vector = VectorLogic.mergeSortDecrease(vector);

        Printer.println("Sorted vector:");
        Printer.printArrays(vector);

        ///////quick sort increase testing//////////////////////////////////////

        vector = VectorLogic.quickSortIncrease(vector);

        Printer.println("Sorted vector:");
        Printer.printArrays(vector);


    }
}
