package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorCalculatorTest {

    private static final double DELTA = 0.0;

    @Test
    public void findMax() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 7.8;

        Assert.assertEquals(expected, VectorCalculator.findMax(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxLength0() {

        double[] vector = new double[0];

        VectorCalculator.findMax(vector);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxNull() {

        double[] vector = null;

        VectorCalculator.findMax(vector);

    }

    @Test
    public void findMin() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 3.2;

        Assert.assertEquals(expected, VectorCalculator.findMin(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinLength0() {

        double[] vector = new double[0];

        VectorCalculator.findMin(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinNull() {

        double[] vector = null;

        VectorCalculator.findMin(vector);
    }

    @Test
    public void findArithmeticMean() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 5.08;

        Assert.assertEquals(expected, VectorCalculator.findArithmeticMean(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findArithmeticMeanLength0() {

        double[] vector = new double[0];

        VectorCalculator.findArithmeticMean(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findArithmeticMeanNull() {

        double[] vector = null;

        VectorCalculator.findArithmeticMean(vector);
    }

    @Test
    public void findGeometricMean() {

        double[] vector = {4.5, 3.4, 6.5, 7.8, 3.2};

        double expected = 4.774961493731803;

        Assert.assertEquals(expected, VectorCalculator.findGeometricMean(vector), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findGeometricMeanLength0() {

        double[] vector = new double[0];

        VectorCalculator.findGeometricMean(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void findGeometricMeanNull() {

        double[] vector = null;

        VectorCalculator.findGeometricMean(vector);
    }

}