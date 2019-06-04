package by.epam.javatraining.yasenko.lesson06.task05.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void isSimple() {

        int number = 193;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.IsSimple(number));

    }

    @Test
    public void isSimpleNegative() {

        int number = -193;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.IsSimple(number));

    }

    @Test
    public void isSimpleZero() {

        int number = 0;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.IsSimple(number));

    }

    @Test
    public void isSimpleOne() {

        int number = 1;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.IsSimple(number));

    }
}