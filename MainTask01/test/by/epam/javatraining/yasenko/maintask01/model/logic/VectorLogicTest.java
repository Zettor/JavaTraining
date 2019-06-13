package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {

    private static final double DELTA = 0.01;

    @Test(expected = IllegalArgumentException.class)
    public void randInitNull() {

        double[] vector = null;

        VectorLogic.randInit(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void randInitLength0() {

        double[] vector = new double[0];

        VectorLogic.randInit(vector);
    }

    @Test
    public void findMax() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 7.8;

        Assert.assertEquals(expected, VectorLogic.findMax(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxLength0() {

        double[] vector = new double[0];

        VectorLogic.findMax(vector);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxNull() {

        double[] vector = null;

        VectorLogic.findMax(vector);

    }

    @Test
    public void findMin() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 3.2;

        Assert.assertEquals(expected, VectorLogic.findMin(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinLength0() {

        double[] vector = new double[0];

        VectorLogic.findMin(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinNull() {

        double[] vector = null;

        VectorLogic.findMin(vector);
    }

    @Test
    public void findArithmeticMean() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 5.08;

        Assert.assertEquals(expected, VectorLogic.findArithmeticMean(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findArithmeticMeanLength0() {

        double[] vector = new double[0];

        VectorLogic.findArithmeticMean(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findArithmeticMeanNull() {

        double[] vector = null;

        VectorLogic.findArithmeticMean(vector);
    }

    @Test
    public void findGeometricMean() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 4.774961493731803;

        Assert.assertEquals(expected, VectorLogic.findGeometricMean(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findGeometricMeanLength0() {

        double[] vector = new double[0];

        VectorLogic.findGeometricMean(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findGeometricMeanNull() {

        double[] vector = null;

        VectorLogic.findGeometricMean(vector);
    }

    @Test
    public void checkSequenceIncrease() {

        double[] vector = {1.2, 2.4, 3.5, 4.8, 5.2};

        boolean expected = true;

        Assert.assertEquals(expected, VectorLogic.checkSequence(vector));
    }

    @Test
    public void checkSequenceDecrease() {

        double[] vector = {5.2, 4.4, 3.5, 2.8, 1.2};

        boolean expected = true;

        Assert.assertEquals(expected, VectorLogic.checkSequence(vector));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSequenceLength0() {

        double[] vector = new double[0];

        VectorLogic.checkSequence(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSequenceNull() {

        double[] vector = null;

        VectorLogic.checkSequence(vector);
    }

    @Test
    public void checkSequenceFalse() {

        double[] vector = {1.2, 5.4, 2.4, 7.5, 3.4};

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkSequence(vector));
    }

    @Test
    public void findLocalMax() {

        double[] vector = {2.4, 4.5, 2.3, 5.6, 1.1};

        int expected = 1;

        Assert.assertEquals(expected, VectorLogic.findLocalMax(vector));

    }

    @Test
    public void findLocalMaxNo() {

        double[] vector = {2.4, 1.1, 2.3, 5.6, 5.7};

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.findLocalMax(vector));

    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMaxLength0() {

        double[] vector = new double[0];

        VectorLogic.findLocalMax(vector);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMaxNull() {

        double[] vector = null;

        VectorLogic.findLocalMax(vector);

    }

    @Test
    public void findLocalMin() {

        double[] vector = {2.4, 4.1, 1.3, 5.6, 5.7};

        int expected = 2;

        Assert.assertEquals(expected, VectorLogic.findLocalMin(vector));
    }

    @Test
    public void findLocalMinNo() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.findLocalMin(vector));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMinLength0() {

        double[] vector = new double[0];

        VectorLogic.findLocalMin(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMinNull() {

        double[] vector = null;

        VectorLogic.findLocalMin(vector);
    }

    @Test
    public void searchLinear() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        double element = 4.1;

        int expected = 1;

        Assert.assertEquals(expected, VectorLogic.searchLinear(vector, element));

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchLinearLength0() {

        double[] vector = new double[0];

        double element = 4.1;

        VectorLogic.searchLinear(vector, element);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchLinearNull() {

        double[] vector = null;

        double element = 4.1;

        VectorLogic.searchLinear(vector, element);

    }

    @Test
    public void searchLinearFalseElement() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        double element = 99.1;

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.searchLinear(vector, element));

    }

    @Test
    public void searchBinary() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 9.8;

        int expected = 3;

        Assert.assertEquals(expected, VectorLogic.searchBinary(vector, element));
    }

    @Test
    public void searchBinaryNotSorted() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 9.8;

        int expected = -1;

        Assert.assertNotEquals(expected, VectorLogic.searchBinary(vector, element));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchBinaryLength0() {

        double[] vector = new double[0];

        double element = 5.8;

        VectorLogic.searchBinary(vector, element);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchBinaryNull() {

        double[] vector = null;

        double element = 5.8;

        VectorLogic.searchBinary(vector, element);
    }

    @Test
    public void searchBinaryFalseElement() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 99.8;

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.searchBinary(vector, element));
    }

    @Test
    public void reverse() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 7.8, 6.5, 3.4, 4.5};

        VectorLogic.reverse(vector);


        double delta = 0.01;

        Assert.assertArrayEquals(expected, vector, delta);
    }


    @Test
    public void reverseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.reverse(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void reverseNull() {

        double[] vector = null;

        VectorLogic.reverse(vector);
    }

    @Test
    public void bubbleSortIcrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        VectorLogic.bubbleSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void bubbleSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.bubbleSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bubbleSortIncreaseNull() {

        double[] vector = null;

        VectorLogic.bubbleSortIncrease(vector);
    }

    @Test
    public void bubbleSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        VectorLogic.bubbleSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void bubbleSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.bubbleSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bubbleSortDecreaseNull() {

        double[] vector = null;

        VectorLogic.bubbleSortDecrease(vector);
    }

    @Test
    public void insertionSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        VectorLogic.insertionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void insertionSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.insertionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertionSortIncreaseNull() {

        double[] vector = null;

        VectorLogic.insertionSortIncrease(vector);
    }

    @Test
    public void insertionSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        VectorLogic.insertionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void insertionSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.insertionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertionSortDecreaseNull() {

        double[] vector = null;

        VectorLogic.insertionSortDecrease(vector);
    }

    @Test
    public void selectionSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        VectorLogic.selectionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void selectionSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.selectionSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void selectionSortIncreaseNull() {

        double[] vector = null;

        VectorLogic.selectionSortIncrease(vector);
    }

    @Test
    public void selectionSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        VectorLogic.selectionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void selectionSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.selectionSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void selectionSortDecreaseNull() {

        double[] vector = null;

        VectorLogic.selectionSortDecrease(vector);
    }

    @Test
    public void mergeSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {2.2, 3.2, 3.4, 4.5, 6.5, 7.8};

        VectorLogic.mergeSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void mergeSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.mergeSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mergeSortIncreaseNull() {

        double[] vector = null;

        VectorLogic.mergeSortIncrease(vector);
    }

    @Test
    public void mergeSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2, 2.2};

        VectorLogic.mergeSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void mergeSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.mergeSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mergeSortDecreaseNull() {

        double[] vector = null;

        VectorLogic.mergeSortDecrease(vector);
    }

    @Test
    public void quickSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {2.2, 3.2, 3.4, 4.5, 6.5, 7.8};

        VectorLogic.quickSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void quickSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.quickSortIncrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void quickSortIncreaseNull() {

        double[] vector = null;

        VectorLogic.quickSortIncrease(vector);
    }

    @Test
    public void quickSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2, 2.2};

        VectorLogic.quickSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test
    public void quickSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = new double[0];

        VectorLogic.quickSortDecrease(vector);

        Assert.assertArrayEquals(expected, vector, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void quickSortDecreaseNull() {

        double[] vector = null;

        VectorLogic.quickSortDecrease(vector);

    }

    @Test
    public void add() {

        double[] vector = new double[5];

        double expected = 6.0;

        vector = VectorLogic.add(vector, 6.0);

        Assert.assertEquals(expected, vector[vector.length - 1], DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNull() {

        double[] vector = null;

        vector = VectorLogic.add(vector, 6.0);
    }

    @Test
    public void remove() {

        double[] vector = new double[5];

        int expected = 4;

        vector = VectorLogic.remove(vector);

        Assert.assertEquals(expected, vector.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeNull() {

        double[] vector = null;

        VectorLogic.remove(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeLength0() {

        double[] vector = new double[0];

        vector = VectorLogic.remove(vector);
    }


}