package by.epam.javatraining.Yasenko.lesson05.task04.task04.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateLogicTest {

    @Test
    public void dateCheckIncorrectMonth() {

        int year = 2017;
        int month = 30;
        int day = 12;

        boolean expected = false;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));
    }

    @Test
    public void dateCheckIncorrectDay() {

        int year = 2017;
        int month = 3;
        int day = -34;

        boolean expected = false;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));
    }

    @Test
    public void dateCheckLeapYear() {

        int year = 1600;
        int month = 2;
        int day = 29;

        boolean expected = true;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));
    }

    @Test
    public void dateCheckNoLeapYear() {

        int year = 2017;
        int month = 2;
        int day = 29;

        boolean expected = false;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));
    }

    @Test
    public void dateCheckDays30() {

        int year = 2017;
        int month = 4;
        int day = 31;

        boolean expected = false;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));
    }

    @Test
    public void dateCheckDays31() {

        int year = 2017;
        int month = 5;
        int day = 31;

        boolean expected = true;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));

    }

    @Test
    public void dateCheck() {

        int year = 2017;
        int month = 5;
        int day = 12;

        boolean expected = true;

        Assert.assertEquals(expected, DateLogic.DateCheck(year, month, day));

    }

    @Test
    public void showTomorrow() {

        int year = 2017;
        int month = 3;
        int day = 12;

        String expected = "2017.3.13.";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }

    @Test
    public void showTomorrowIncorrect() {

        int year = 2017;
        int month = 30;
        int day = 12;

        String expected = "Error: incorrect date! ";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }


    @Test
    public void showTomorrowLeapYear() {

        int year = 1600;
        int month = 2;
        int day = 29;

        String expected = "1600.3.1.";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }

    @Test
    public void showTomorrowNoLeapYear() {

        int year = 2017;
        int month = 2;
        int day = 28;

        String expected = "2017.3.1.";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }

    @Test
    public void showTomorrowDays30() {

        int year = 2017;
        int month = 4;
        int day = 30;

        String expected = "2017.5.1.";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }

    @Test
    public void showTomorrowDays31() {

        int year = 2017;
        int month = 5;
        int day = 31;

        String expected = "2017.6.1.";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }

    @Test
    public void showTomorrowNewYear() {

        int year = 2017;
        int month = 12;
        int day = 31;

        String expected = "2018.1.1.";

        Assert.assertEquals(expected, DateLogic.showTomorrow(year, month, day));

    }
}
