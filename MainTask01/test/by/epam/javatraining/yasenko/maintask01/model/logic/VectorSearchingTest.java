package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorSearchingTest {

    @Test
    public void findLocalMax() {

        double[] vector = {2.4, 4.5, 2.3, 5.6, 1.1};

        int expected = 1;

        Assert.assertEquals(expected, VectorSearching.findLocalMax(vector));

    }

    @Test
    public void findLocalMaxNo() {

        double[] vector = {2.4, 1.1, 2.3, 5.6, 5.7};

        int expected = -1;

        Assert.assertEquals(expected, VectorSearching.findLocalMax(vector));

    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMaxLength0() {

        double[] vector = new double[0];

        VectorSearching.findLocalMax(vector);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMaxNull() {

        double[] vector = null;

        VectorSearching.findLocalMax(vector);

    }

    @Test
    public void findLocalMin() {

        double[] vector = {2.4, 4.1, 1.3, 5.6, 5.7};

        int expected = 2;

        Assert.assertEquals(expected, VectorSearching.findLocalMin(vector));
    }

    @Test
    public void findLocalMinNo() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        int expected = -1;

        Assert.assertEquals(expected, VectorSearching.findLocalMin(vector));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMinLength0() {

        double[] vector = new double[0];

        VectorSearching.findLocalMin(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findLocalMinNull() {

        double[] vector = null;

        VectorSearching.findLocalMin(vector);
    }

    @Test
    public void searchLinear() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        double element = 4.1;

        int expected = 1;

        Assert.assertEquals(expected, VectorSearching.searchLinear(vector, element));

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchLinearLength0() {

        double[] vector = new double[0];

        double element = 4.1;

        VectorSearching.searchLinear(vector, element);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchLinearNull() {

        double[] vector = null;

        double element = 4.1;

        VectorSearching.searchLinear(vector, element);

    }

    @Test
    public void searchLinearFalseElement() {

        double[] vector = {2.4, 4.1, 8.3, 5.8, 5.7};

        double element = 99.1;

        int expected = -1;

        Assert.assertEquals(expected, VectorSearching.searchLinear(vector, element));

    }

    @Test
    public void searchBinary() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 9.8;

        int expected = 3;

        Assert.assertEquals(expected, VectorSearching.searchBinary(vector, element));
    }

    @Test
    public void searchBinaryNotSorted() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 9.8;

        int expected = -1;

        Assert.assertNotEquals(expected, VectorSearching.searchBinary(vector, element));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchBinaryLength0() {

        double[] vector = new double[0];

        double element = 5.8;

        VectorSearching.searchBinary(vector, element);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchBinaryNull() {

        double[] vector = null;

        double element = 5.8;

        VectorSearching.searchBinary(vector, element);
    }

    @Test
    public void searchBinaryFalseElement() {

        double[] vector = {2.4, 4.1, 8.3, 9.8, 10.7};

        double element = 99.8;

        int expected = -1;

        Assert.assertEquals(expected, VectorSearching.searchBinary(vector, element));
    }

}