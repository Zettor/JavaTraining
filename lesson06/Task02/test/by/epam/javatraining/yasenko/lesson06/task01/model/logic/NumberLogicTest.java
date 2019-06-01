package by.epam.javatraining.yasenko.lesson06.task01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberLogicTest {

    @Test
    public void checkIncrease() {

        int number = 12345;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkIncrease(number));
    }

    @Test
    public void checkIncreaseFalse() {

        int number = 987654;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkIncrease(number));
    }

    @Test
    public void checkIncreaseNotSequence() {

        int number = 675;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkIncrease(number));
    }

    @Test
    public void checkIncreaseNegative() {

        int number = -1234;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkIncrease(number));
    }

    @Test
    public void checkDecrease() {
        int number = 987654;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkDecrease(number));
    }

    @Test
    public void checkDecreaseFalse() {
        int number = 1234;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkDecrease(number));
    }

    @Test
    public void checkDecreaseNotSequence() {
        int number = 675;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkDecrease(number));
    }

    @Test
    public void checkDecreaseNegative() {
        int number = -9876;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkDecrease(number));
    }

    @Test
    public void checkSequenceIncrease() {
        int number = 12345;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkSequence(number));

    }

    @Test
    public void checkSequenceDecrease() {
        int number = 98765;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkSequence(number));

    }

    @Test
    public void checkSequenceNegative() {
        int number = -876;

        boolean expected = true;

        Assert.assertEquals(expected, NumberLogic.checkSequence(number));

    }

    @Test
    public void checkSequenceFalse() {
        int number = 675;

        boolean expected = false;

        Assert.assertEquals(expected, NumberLogic.checkSequence(number));

    }
}