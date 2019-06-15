package by.epam.javatraining.yasenko.maintask01.model.util;

import java.util.Random;

/**
 * This class contains methods of Initialization of vector
 *
 * @author Yasenko Alexander Sergeyevich
 * @version 1.0
 */
public class VectorInitialization {

    private static final String RAND_INIT_MSG = "randInit()";

    /**
     * Fills the vector with random numbers
     *
     * @param vector The vector that must be filled
     */
    public static void randInit(double[] vector) {

        VectorUtil.checkVector(vector,RAND_INIT_MSG);

        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10); //filling this vector with random numbers
        }

    }

}
