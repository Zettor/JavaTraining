package by.epam.javatraining.yasenko.maintask01.model.util;

import by.epam.javatraining.yasenko.maintask01.model.logic.VectorSearching;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorUtilTest {

    private static final double DELTA = 0.0;

    @Test
    public void add() {

        double[] vector = new double[5];

        double expected = 6.0;

        vector = VectorUtil.add(vector, 6.0);

        Assert.assertEquals(expected, vector[vector.length - 1], DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNull() {

        double[] vector = null;

        vector = VectorUtil.add(vector, 6.0);
    }

    @Test
    public void remove() {

        double[] vector = new double[5];

        int expected = 4;

        vector = VectorUtil.remove(vector);

        Assert.assertEquals(expected, vector.length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeNull() {

        double[] vector = null;

        VectorUtil.remove(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeLength0() {

        double[] vector = new double[0];

        vector = VectorUtil.remove(vector);
    }

}