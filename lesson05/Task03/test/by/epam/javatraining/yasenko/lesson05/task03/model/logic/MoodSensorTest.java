package by.epam.javatraining.yasenko.lesson05.task03.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.javatraining.yasenko.lesson05.task03.model.logic.MoodSensor.showMood;
import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test
    public void showMood0() {

        int moodnum = 0;

        String expected = ":D";

        Assert.assertEquals(expected, showMood(moodnum));

    }

    @Test
    public void showMood1() {

        int moodnum = 1;

        String expected = ":)";

        Assert.assertEquals(expected, showMood(moodnum));


    }

    @Test
    public void showMood2() {

        int moodnum = 2;

        String expected = ":O";

        Assert.assertEquals(expected, showMood(moodnum));
    }

    @Test
    public void showMood3() {

        int moodnum = 3;

        String expected = ":(";

        Assert.assertEquals(expected, showMood(moodnum));
    }

    @Test
    public void showMood4() {

        int moodnum = 4;

        String expected = ":|";

        Assert.assertEquals(expected, showMood(moodnum));
    }

    @Test
    public void showMoodError() {

        int moodnum = 5;

        String expected = "Error: Something went wrong!";

        Assert.assertEquals(expected, showMood(moodnum));
    }
}