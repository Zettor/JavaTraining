package by.epam.javatraining.yasenko.lesson05.task01.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonLogicTest {

    @Test
    public void getHeadsIncorrectAge() {

        double years = -32;

        int expected = 0;

        Assert.assertEquals(expected, DragonLogic.getHeads(years));
    }

    @Test
    public void getHeadsLess200() {

        double years = 126;

        int expected = 381;

        Assert.assertEquals(expected, DragonLogic.getHeads(years));
    }

    @Test
    public void getHeadsLess300() {

        double years = 226;

        int expected = 655;

        Assert.assertEquals(expected, DragonLogic.getHeads(years));
    }

    @Test
    public void getHeadsMore300() {

        double years = 445;

        int expected = 948;

        Assert.assertEquals(expected, DragonLogic.getHeads(years));
    }

    @Test
    public void getEyesIncorrectAge() {

        double years = -32;

        int expected = 0;

        Assert.assertEquals(expected, DragonLogic.getEyes(years));
    }

    @Test
    public void getEyesLess200() {

        double years = 126;

        int expected = 762;

        Assert.assertEquals(expected, DragonLogic.getEyes(years));
    }

    @Test
    public void getEyesLess300() {

        double years = 226;

        int expected = 1310;

        Assert.assertEquals(expected, DragonLogic.getEyes(years));
    }

    @Test
    public void getEyesMore300() {

        double years = 445;

        int expected = 1896;

        Assert.assertEquals(expected, DragonLogic.getEyes(years));
    }

}