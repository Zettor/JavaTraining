package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorLogicTest {

    @Test
    public void findMax() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        String expected = "7.8";

        Assert.assertEquals(expected, VectorLogic.findMax(vector));
    }

    @Test
    public void findMaxLength0() {

        double[] vector = new double[0];

        String expected = "ERROR: Incorrect data!";

        Assert.assertEquals(expected, VectorLogic.findMax(vector));

    }

    @Test
    public void findMin() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        String expected = "3.2";

        Assert.assertEquals(expected, VectorLogic.findMin(vector));
    }

    @Test
    public void findMinLength0() {

        double[] vector = new double[0];

        String expected = "ERROR: Incorrect data!";

        Assert.assertEquals(expected, VectorLogic.findMin(vector));
    }

    @Test
    public void findArithmeticMean() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        String expected = "5.08";

        Assert.assertEquals(expected, VectorLogic.findArithmeticMean(vector));
    }

    @Test
    public void findArithmeticMeanLength0() {

        double[] vector = new double[0];

        String expected = "ERROR: Incorrect data!";

        Assert.assertEquals(expected, VectorLogic.findArithmeticMean(vector));
    }

    @Test
    public void findGeometricMean() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        String expected = "4.774961493731803";

        Assert.assertEquals(expected, VectorLogic.findGeometricMean(vector));
    }

    @Test
    public void findGeometricMeanLength0() {

        double[] vector = new double[0];

        String expected = "ERROR: Incorrect data!";

        Assert.assertEquals(expected, VectorLogic.findGeometricMean(vector));
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

    @Test
    public void checkSequenceLength0() {

        double[] vector = new double[0];

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkSequence(vector));
    }

    @Test
    public void checkSequenceFalse() {

        double[] vector = {1.2, 5.4, 2.4, 7.5, 3.4};

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkSequence(vector));
    }

    @Test
    public void checkIncrease() {

        double[] vector = {1.2, 2.4, 3.5, 4.8, 5.2};

        boolean expected = true;

        Assert.assertEquals(expected, VectorLogic.checkIncrease(vector));
    }

    @Test
    public void checkIncreaseFalse() {

        double[] vector = {5.2, 4.4, 3.5, 2.8, 1.2};

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkIncrease(vector));
    }

    @Test
    public void checkIncreaseLength0() {

        double[] vector = new double[0];

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkIncrease(vector));
    }

    @Test
    public void checkDecrease() {

        double[] vector = {5.2, 4.4, 3.5, 2.8, 1.2};

        boolean expected = true;

        Assert.assertEquals(expected, VectorLogic.checkDecrease(vector));
    }

    @Test
    public void checkDecreaseFalse() {

        double[] vector = {1.2, 2.4, 3.5, 4.8, 5.2};

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkDecrease(vector));
    }

    @Test
    public void checkDecreaseLength0() {

        double[] vector = new double[0];

        boolean expected = false;

        Assert.assertEquals(expected, VectorLogic.checkDecrease(vector));
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

    @Test
    public void findLocalMaxLength0() {

        double[] vector = new double[0];

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.findLocalMax(vector));

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

    @Test
    public void findLocalMinLength0() {

        double[] vector = new double[0];

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.findLocalMin(vector));
    }

    @Test
    public void searchLinear() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        double element = 4.1;

        int expected = 1;

        Assert.assertEquals(expected, VectorLogic.searchLinear(vector, element));

    }

    @Test
    public void searchLinearLength0() {

        double[] vector = new double[0];

        double element = 4.1;

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.searchLinear(vector, element));

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

        double[] vector = {2.4, 4.1,8.3, 9.8, 10.7};

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

    @Test
    public void searchBinaryLength0() {

        double[] vector = new double[0];

        double element = 5.8;

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.searchBinary(vector, element));
    }

    @Test
    public void searchBinaryFalseElement() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 99.8;

        int expected = -1;

        Assert.assertEquals(expected, VectorLogic.searchBinary(vector, element));
    }

    @Test
    public void reverseOddCount() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 7.8, 6.5, 3.4, 4.5};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.reverse(vector), delta);
    }

    @Test
    public void reverseEvenCount() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2, 3.1};

        double[] expected = {3.1, 3.2, 7.8, 6.5, 3.4, 4.5};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.reverse(vector), delta);
    }

    @Test
    public void reverseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.reverse(vector), delta);
    }

    @Test
    public void bubbleSortIcrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.bubbleSortIncrease(vector), delta);
    }

    @Test
    public void bubbleSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.bubbleSortIncrease(vector), delta);
    }

    @Test
    public void bubbleSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.bubbleSortDecrease(vector), delta);
    }

    @Test
    public void bubbleSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.bubbleSortDecrease(vector), delta);
    }

    @Test
    public void insertionSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.insertionSortIncrease(vector), delta);
    }

    @Test
    public void insertionSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.insertionSortIncrease(vector), delta);
    }

    @Test
    public void insertionSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.insertionSortDecrease(vector), delta);
    }

    @Test
    public void insertionSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.insertionSortDecrease(vector), delta);
    }

    @Test
    public void selectionSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {3.2, 3.4, 4.5, 6.5, 7.8};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.selectionSortIncrease(vector), delta);
    }

    @Test
    public void selectionSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.selectionSortIncrease(vector), delta);
    }

    @Test
    public void selectionSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.selectionSortDecrease(vector), delta);
    }

    @Test
    public void selectionSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.selectionSortDecrease(vector), delta);
    }

    @Test
    public void mergeSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {2.2, 3.2, 3.4, 4.5, 6.5, 7.8};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.mergeSortIncrease(vector), delta);
    }

    @Test
    public void mergeSortLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.mergeSortIncrease(vector), delta);
    }

    @Test
    public void mergeSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2, 2.2};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.mergeSortDecrease(vector), delta);
    }

    @Test
    public void mergeSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.mergeSortDecrease(vector), delta);
    }

    @Test
    public void quickSortIncrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {2.2, 3.2, 3.4, 4.5, 6.5, 7.8};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.quickSortIncrease(vector), delta);
    }

    @Test
    public void quickSortIncreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.quickSortIncrease(vector), delta);
    }

    @Test
    public void quickSortDecrease() {

        double[] vector = {4.5, 3.4, 6.5, 2.2, 7.8, 3.2};

        double[] expected = {7.8, 6.5, 4.5, 3.4, 3.2, 2.2};

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.quickSortDecrease(vector), delta);
    }

    @Test
    public void quickSortDecreaseLength0() {

        double[] vector = new double[0];

        double[] expected = null;

        double delta = 0.01;

        Assert.assertArrayEquals(expected, VectorLogic.quickSortDecrease(vector), delta);
    }
}