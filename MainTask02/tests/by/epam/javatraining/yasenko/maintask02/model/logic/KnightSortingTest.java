package by.epam.javatraining.yasenko.maintask02.model.logic;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.*;
import by.epam.javatraining.yasenko.maintask02.model.knight.Knight;
import by.epam.javatraining.yasenko.maintask02.model.logic.KnightSorting;
import org.junit.Assert;
import org.junit.Test;

public class KnightSortingTest {

    @Test
    public void sortByPriceIncrease() {

        Knight warrior = new Knight();

        Knight expected = new Knight(new Helmet(), new Shield(), new Sword(), new ChainArmor());

        KnightSorting.sortByPriceIncrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test
    public void sortByPriceIncreaseLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        Knight expected = new Knight(new Ammunition[0]);

        KnightSorting.sortByPriceIncrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortByPriceIncreaseNull() {

        Knight warrior = new Knight(null);

        KnightSorting.sortByPriceIncrease(warrior);

    }

    @Test
    public void sortByPriceDecrease() {

        Knight warrior = new Knight();

        Knight expected = new Knight(new ChainArmor(), new Sword(), new Shield(), new Helmet());

        KnightSorting.sortByPriceDecrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test
    public void sortByPriceDecreaseLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        Knight expected = new Knight(new Ammunition[0]);

        KnightSorting.sortByPriceDecrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortByPriceDecreaseNull() {

        Knight warrior = new Knight(null);

        KnightSorting.sortByPriceDecrease(warrior);
    }

    @Test
    public void sortByWeightIncrease() {

        Knight warrior = new Knight();

        Knight expected = new Knight(new Helmet(), new Shield(), new Sword(), new ChainArmor());

        KnightSorting.sortByWeightIncrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test
    public void sortByWeightIncreaseLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        Knight expected = new Knight(new Ammunition[0]);

        KnightSorting.sortByWeightIncrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortByWeightIncreaseNull() {

        Knight warrior = new Knight(null);

        KnightSorting.sortByWeightIncrease(warrior);
    }

    @Test
    public void sortByWeightDecrease() {

        Knight warrior = new Knight();

        Knight expected = new Knight(new ChainArmor(), new Sword(), new Shield(), new Helmet());

        KnightSorting.sortByWeightDecrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test
    public void sortByWeightDecreaseLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        Knight expected = new Knight(new Ammunition[0]);

        KnightSorting.sortByWeightDecrease(warrior);

        if (!warrior.equals(expected)) {
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortByWeightDecreaseNull() {

        Knight warrior = new Knight(null);

        KnightSorting.sortByWeightDecrease(warrior);
    }
}