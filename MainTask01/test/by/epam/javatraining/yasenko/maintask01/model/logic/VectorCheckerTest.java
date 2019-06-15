package by.epam.javatraining.yasenko.maintask01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorCheckerTest {

    @Test
    public void checkSequenceIncrease() {

        double[] vector = {1.2, 2.4, 3.5, 4.8, 5.2};

        boolean expected = true;

        Assert.assertEquals(expected, VectorChecker.checkSequence(vector));
    }

    @Test
    public void checkSequenceDecrease() {

        double[] vector = {5.2, 4.4, 3.5, 2.8, 1.2};

        boolean expected = true;

        Assert.assertEquals(expected, VectorChecker.checkSequence(vector));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSequenceLength0() {

        double[] vector = new double[0];

        VectorChecker.checkSequence(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSequenceNull() {

        double[] vector = null;

        VectorChecker.checkSequence(vector);
    }

    @Test
    public void checkSequenceFalse() {

        double[] vector = {1.2, 5.4, 2.4, 7.5, 3.4};

        boolean expected = false;

        Assert.assertEquals(expected, VectorChecker.checkSequence(vector));
    }

}