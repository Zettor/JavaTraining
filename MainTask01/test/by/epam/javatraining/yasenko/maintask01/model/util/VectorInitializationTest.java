package by.epam.javatraining.yasenko.maintask01.model.util;

import by.epam.javatraining.yasenko.maintask01.model.logic.VectorSearching;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorInitializationTest {

    @Test(expected = IllegalArgumentException.class)
    public void randInitNull() {

        double[] vector = null;

        VectorInitialization.randInit(vector);
    }

    @Test(expected = IllegalArgumentException.class)
    public void randInitLength0() {

        double[] vector = new double[0];

        VectorInitialization.randInit(vector);
    }

}