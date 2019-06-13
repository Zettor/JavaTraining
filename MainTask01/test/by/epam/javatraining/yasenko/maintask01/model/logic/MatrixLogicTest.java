package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixLogicTest {

    @Test
    public void findMax() {

        double[][] matrix = {{1.5, 4.2, 1.2}, {7.4, 3.8, 5.6}, {3.9, 7.2, 3.1}};

        String expected = "7.4";

        Assert.assertEquals(expected, MatrixLogic.findMax(matrix));

    }

    @Test
    public void findMaxLength0() {

        double[][] matrix = new double[0][];

        String expected = "Incorrect data!";

        Assert.assertEquals(expected, MatrixLogic.findMax(matrix));

    }

    @Test
    public void findMaxLengthN0() {

        double[][] matrix = {{1.0, 2.0, 3.0}, {}};

        String expected = "Incorrect data!";

        Assert.assertEquals(expected, MatrixLogic.findMax(matrix));

    }


    @Test
    public void findMaxNotMatrix() {

        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0}};

        String expected = "Incorrect data!";

        Assert.assertEquals(expected, MatrixLogic.findMax(matrix));

    }

    @Test
    public void findMin() {

        double[][] matrix = {{1.5, 4.2, 1.2}, {7.4, 3.8, 5.6}, {3.9, 7.2, 3.1}};

        String expected = "1.2";

        Assert.assertEquals(expected, MatrixLogic.findMin(matrix));

    }

    @Test
    public void findMinLength0() {

        double[][] matrix = new double[0][];

        String expected = "Incorrect data!";

        Assert.assertEquals(expected, MatrixLogic.findMin(matrix));

    }

    @Test
    public void findMinLengthN0() {

        double[][] matrix = {{1.0, 2.0, 3.0}, {}};

        String expected = "Incorrect data!";

        Assert.assertEquals(expected, MatrixLogic.findMin(matrix));

    }

    @Test
    public void findMinNotMatrix() {

        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0}};

        String expected = "Incorrect data!";

        Assert.assertEquals(expected, MatrixLogic.findMin(matrix));

    }

    @Test
    public void checkSymmetry() {

        double[][] matrix = {{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};

        boolean expected = true;

        Assert.assertEquals(expected, MatrixLogic.checkSymmetry(matrix));

    }

    @Test
    public void checkSymmetryLength0() {

        double[][] matrix = new double[0][];

        boolean expected = false;

        Assert.assertEquals(expected, MatrixLogic.checkSymmetry(matrix));

    }

    @Test
    public void checkSymmetryLengthN0() {

        double[][] matrix = {{1.0, 0.0, 0.0}, {0.0, 1.0}, {0.0, 0.0, 1.0}};


        boolean expected = false;

        Assert.assertEquals(expected, MatrixLogic.checkSymmetry(matrix));

    }

    @Test
    public void transposition() {

        double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0,6.0},{7.0,8.0,9.0}};

        double[][] expected = {{1.0, 4.0, 7.0}, {2.0, 5.0,8.0},{3.0,6.0,9.0}};

        Assert.assertEquals(expected, MatrixLogic.transposition(matrix));

    }

    @Test
    public void transpositionLength0() {

        double[][] matrix = new double[0][];

        double[][] expected = null;

        Assert.assertEquals(expected, MatrixLogic.transposition(matrix));

    }
}