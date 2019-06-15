package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorSortingTest {

    private static final double DELTA = 0.0;

    @Test
    public void reverse() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 7.8, 6.5, 3.4, 4.5};

        VectorSorting.reverse(vector);


        double delta = 0.01;

        Assert.assertArrayEquals(expected, vector, delta);
    }


    @Test
    public void reverseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.reverse(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverseNull() {

        double[] vector = null;

        VectorSorting.reverse(vector);
    }

    @Test
    public void bubbleSortIcrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        VectorSorting.bubbleSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void bubbleSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.bubbleSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bubbleSortIncreaseNull() {

        double[] vector = null;

        VectorSorting.bubbleSortIncrease(vector);
    }

    @Test
    public void bubbleSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        VectorSorting.bubbleSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void bubbleSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.bubbleSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bubbleSortDecreaseNull() {

        double[] vector = null;

        VectorSorting.bubbleSortDecrease(vector);
    }

    @Test
    public void insertionSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        VectorSorting.insertionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void insertionSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.insertionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertionSortIncreaseNull() {

        double[] vector = null;

        VectorSorting.insertionSortIncrease(vector);
    }

    @Test
    public void insertionSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        VectorSorting.insertionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void insertionSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.insertionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertionSortDecreaseNull() {

        double[] vector = null;

        VectorSorting.insertionSortDecrease(vector);
    }

    @Test
    public void selectionSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        VectorSorting.selectionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void selectionSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.selectionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void selectionSortIncreaseNull() {

        double[] vector = null;

        VectorSorting.selectionSortIncrease(vector);
    }

    @Test
    public void selectionSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        VectorSorting.selectionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void selectionSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.selectionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void selectionSortDecreaseNull() {

        double[] vector = null;

        VectorSorting.selectionSortDecrease(vector);
    }

    @Test
    public void mergeSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {2.2, 3.2, 3.4, 4.5, 6.5, 7.8};

        VectorSorting.mergeSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void mergeSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.mergeSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mergeSortIncreaseNull() {

        double[] vector = null;

        VectorSorting.mergeSortIncrease(vector);
    }

    @Test
    public void mergeSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2, 2.2};

        VectorSorting.mergeSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void mergeSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.mergeSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mergeSortDecreaseNull() {

        double[] vector = null;

        VectorSorting.mergeSortDecrease(vector);
    }

    @Test
    public void quickSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {2.2, 3.2, 3.4, 4.5, 6.5, 7.8};

        VectorSorting.quickSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void quickSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.quickSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void quickSortIncreaseNull() {

        double[] vector = null;

        VectorSorting.quickSortIncrease(vector);
    }

    @Test
    public void quickSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2, 2.2};

        VectorSorting.quickSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void quickSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorSorting.quickSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void quickSortDecreaseNull() {

        double[] vector = null;

        VectorSorting.quickSortDecrease(vector);

    }



}