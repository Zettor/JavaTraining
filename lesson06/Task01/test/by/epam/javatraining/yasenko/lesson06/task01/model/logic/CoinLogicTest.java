package by.epam.javatraining.yasenko.lesson06.task01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinLogicTest {

    @Test
    public void getHeadsAndTailsIncorrect() {
        int throwcount = -100;

        String expected = "Error: incorrect count of throws!";

        Assert.assertEquals(expected, CoinLogic.getHeadsAndTails(throwcount));
    }

    @Test
    public void getHeadsAndTails() {
        int throwcount = 100;

        String expected = "Error: incorrect count of throws!";

        Assert.assertNotEquals(expected, CoinLogic.getHeadsAndTails(throwcount));
    }
}