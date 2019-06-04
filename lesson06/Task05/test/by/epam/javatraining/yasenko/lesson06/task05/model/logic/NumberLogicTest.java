package by.epam.javatraining.yasenko.lesson06.task05.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void checkIsSimple() {

        int number = 193;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkIsSimple(number));

    }

    @Test
    public void checkIsSimpleNegative() {

        int number = -193;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkIsSimple(number));

    }

    @Test
    public void checkIsSimpleZero() {

        int number = 0;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkIsSimple(number));

    }

    @Test
    public void isSimpleOne() {

        int number = 1;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkIsSimple(number));

    }
}