package by.epam.javatraining.yasenko.lesson06.task03.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void getFactorial() {

        int number = 5;

        int expected = 120;

        Assert.assertEquals(expected, NumberLogic.getFactorial(number));
    }

    @Test
    public void getFactorialOne() {

        int number = 1;

        int expected = 1;

        Assert.assertEquals(expected, NumberLogic.getFactorial(number));
    }

    @Test
    public void getFactorialZero() {

        int number = 0;

        int expected = 1;

        Assert.assertEquals(expected, NumberLogic.getFactorial(number));
    }

    @Test
    public void getFactorialNegative() {

        int number = -7;

        int expected = -1;

        Assert.assertEquals(expected, NumberLogic.getFactorial(number));
    }
}