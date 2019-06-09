package by.epam.javatraining.yasenko.maintask01.model.logic;

/**
 * This class contains methods for working with matrix
 * @author Yasenko Alexander Sergeyevich
 * @version 0.2
 */

public class MatrixLogic {

    public static final String ERROR_MSG = "Incorrect data!";

    public static String findMax(double[][] matrix) {

        if (!checkMatrix(matrix)) {
            return ERROR_MSG;
        }


        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }

        return Double.toString(max);
    }

    public static String findMin(double[][] matrix) {

        if (!checkMatrix(matrix)) {
            return ERROR_MSG;
        }


        double min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }

        return Double.toString(min);
    }

    public static boolean checkMatrix(double[][] matrix) {

        boolean checker = true;

        if (matrix.length != 0 && matrix[0].length != 0) {
            for (int i = 1; i < matrix.length; i++) {
                checker = matrix[i].length != matrix[i - 1].length ? false : true;
            }
        } else {
            checker = false;
        }

        return checker;
    }
}