package by.epam.javatraining.yasenko.maintask01.view.presentation;

import java.util.Arrays;

public class Printer {

    public static void println(String logic) {

        System.out.println(logic);

    }

    public static void printIntIndex(int logic) {

        System.out.println(logic >= 0 ? "The searching index " + logic
                : "In vector is not such an index " + logic);

    }

    public static void printVector(double[] logic) {

        System.out.println(logic != null ? Arrays.toString(logic) : "Incorrect data!");

    }

    public static void printMatrix(double[][] logic) {

        if(logic!=null){
            for(int i=0;i<logic.length;i++){
                for(int j=0;j<logic[i].length;i++){
                    System.out.println(logic[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
