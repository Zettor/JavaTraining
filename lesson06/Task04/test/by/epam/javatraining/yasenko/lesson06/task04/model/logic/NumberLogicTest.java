package by.epam.javatraining.yasenko.lesson06.task04.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void parityCheckEven() {

        int number = 246;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.ParityCheck(number));
    }

    @Test
    public void parityCheckOdd() {

        int number = 135;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.ParityCheck(number));
    }

    @Test
    public void parityCheckNegative() {

        int number = -135;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.ParityCheck(number));
    }

    @Test
    public void parityCheckFalse() {

        int number = 123456789;

        boolean expected = false;

        Assert.assertEquals(expected,NumberLogic.ParityCheck(number));
    }

    @Test
    public void evenCheck() {

        int number = 246;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.EvenCheck(number));
    }

    @Test
    public void evenCheckFalse() {

        int number = 135;

        boolean expected = false;

        Assert.assertEquals(expected,NumberLogic.EvenCheck(number));
    }

    @Test
    public void evenCheckNegative() {

        int number = -246;

        boolean expected = true;

        Assert.assertEquals(expected,NumberLogic.EvenCheck(number));
    }

    @Test
    public void oddCheck() {

        int number = 135;

        boolean expected=true;

        Assert.assertEquals(expected,NumberLogic.OddCheck(number));


    }

    @Test
    public void oddCheckFalse() {

        int number = 246;

        boolean expected=false;

        Assert.assertEquals(expected,NumberLogic.OddCheck(number));


    }

    @Test
    public void oddCheckNegative() {

        int number = -135;

        boolean expected=true;

        Assert.assertEquals(expected,NumberLogic.OddCheck(number));


    }
}