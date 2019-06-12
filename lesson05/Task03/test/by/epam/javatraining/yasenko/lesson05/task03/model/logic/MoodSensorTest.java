package by.epam.javatraining.yasenko.lesson05.task03.model.logic;

import org.junit.Assert;
import org.junit.Test;

import static by.epam.javatraining.yasenko.lesson05.task03.model.logic.MoodSensor.showMood;
import static org.junit.Assert.*;

public class MoodSensorTest {

    @Test
    public void showMood() {


        String expected = ":D :) :O :( :|";

        assertTrue(expected.contains(MoodSensor.showMood()));
    }
}