package by.epam.javatraining.yasenko.maintask02.model.knight;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    @Test
    public void equip() {

        Knight warrior = new Knight();

        Ammunition bow = new Bow();

        Knight expected = new Knight(new ChainArmor(), new Helmet(), new Shield(), new Sword(), new Bow());

        warrior.equip(bow);

        if (!warrior.equals(expected)){
            Assert.fail();
        }

    }

    @Test
    public void equipLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        Ammunition bow = new Bow();

        Knight expected = new Knight(new Bow());

        warrior.equip(bow);

        if (!warrior.equals(expected)){
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void equipNull() {

        Knight warrior = new Knight(null);

        Ammunition bow = new Bow();

        warrior.equip(bow);
    }
    @Test
    public void remove() {

        Knight warrior = new Knight();

        Ammunition bow = new Bow();

        Knight expected = new Knight(new ChainArmor(), new Helmet(), new Shield());

        warrior.remove();

        if (!warrior.equals(expected)){
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        warrior.remove();

    }

    @Test(expected = IllegalArgumentException.class)
    public void removeNull() {

        Knight warrior = new Knight(null);

        warrior.remove();

    }
}