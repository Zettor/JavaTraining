package by.epam.javatraining.yasenko.lesson06.task04.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void checkParityEven() {

        int number = 246;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityOdd() {

        int number = 135;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityNegative() {

        int number = -135;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.checkParity(number));
    }

    @Test
    public void checkParityFalse() {

        int number = 123456789;

        boolean expected = false;

        Assert.assertEquals(expected,NumberLogic.checkParity(number));
    }

    @Test
    public void checkEven() {

        int number = 246;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.checkEven(number));
    }

    @Test
    public void checkEvenFalse() {

        int number = 135;

        boolean expected = false;

        Assert.assertEquals(expected,NumberLogic.checkEven(number));
    }

    @Test
    public void checkEvenNegative() {

        int number = -246;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.checkEven(number));
    }

    @Test
    public void checkOdd() {

        int number = 135;

        boolean expected=true;

        Assert.assertEquals(expected,NumberLogic.checkOdd(number));


    }

    @Test
    public void checkOddFalse() {

        int number = 246;

        boolean expected=false;

        Assert.assertEquals(expected,NumberLogic.checkOdd(number));


    }

    @Test
    public void checkOddNegative() {

        int number = -135;

        boolean expected=true;

        Assert.assertEquals(expected,NumberLogic.checkOdd(number));


    }
}