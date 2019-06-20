package by.epam.javatraining.yasenko.maintask02.model.logic;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.*;
import by.epam.javatraining.yasenko.maintask02.model.knight.Knight;
import by.epam.javatraining.yasenko.maintask02.model.logic.KnightMeans;
import org.junit.Assert;
import org.junit.Test;

public class KnightMeansTest {

    @Test
    public void getDamage() {

        Knight warrior = new Knight();

        int expected = 50;

        Assert.assertEquals(expected, KnightMeans.getDamage(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDamageLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.getDamage(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getDamageNull() {

        Knight warrior = new Knight(null);

        KnightMeans.getDamage(warrior);
    }

    @Test
    public void getArmor() {

            Knight warrior = new Knight();

            int expected = 105;

            Assert.assertEquals(expected,KnightMeans.getArmor(warrior));


    }

    @Test(expected = IllegalArgumentException.class)
    public void getArmorLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.getArmor(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getArmorNull() {

        Knight warrior = new Knight(null);

        KnightMeans.getArmor(warrior);
    }

    @Test
    public void getPrice() {

        Knight warrior = new Knight();

        int expected = 230;

        Assert.assertEquals(expected,KnightMeans.getPrice(warrior));

    }

    @Test(expected = IllegalArgumentException.class)
    public void getPriceLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.getPrice(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getPriceNull() {

        Knight warrior = new Knight(null);

        KnightMeans.getPrice(warrior);
    }

    @Test
    public void getWeight() {

        Knight warrior = new Knight();

        int expected = 290;

        Assert.assertEquals(expected,KnightMeans.getWeight(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWeightLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.getWeight(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getWeightNull() {

        Knight warrior = new Knight(null);

        KnightMeans.getWeight(warrior);
    }

    @Test
    public void getMobility() {

        Knight warrior = new Knight();

        int expected = 65;

        Assert.assertEquals(expected,KnightMeans.getMobility(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getMobilityLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.getMobility(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getMobilityNull() {

        Knight warrior = new Knight(null);

        KnightMeans.getMobility(warrior);
    }

    @Test
    public void findMaxDamage() {

        Knight warrior = new Knight();

        Ammunition expected = new Sword();

        Ammunition bow = new Bow();

        warrior.equip(bow);

        Assert.assertEquals(expected,KnightMeans.findMaxDamage(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxDamageLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.findMaxDamage(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxDamageNull() {

        Knight warrior = new Knight(null);

        KnightMeans.findMaxDamage(warrior);
    }

    @Test
    public void findMinDamage() {

        Knight warrior = new Knight();

        Ammunition expected = new Bow();

        Ammunition bow = new Bow();

        warrior.equip(bow);

        Assert.assertEquals(expected,KnightMeans.findMinDamage(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinDamageLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.findMinDamage(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinDamageNull() {

        Knight warrior = new Knight(null);

        KnightMeans.findMinDamage(warrior);
    }

    @Test
    public void findMaxArmor() {

        Knight warrior = new Knight();

        Ammunition expected = new ChainArmor();

        Assert.assertEquals(expected,KnightMeans.findMaxArmor(warrior));

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxArmorLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.findMaxArmor(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxArmorNull() {

        Knight warrior = new Knight(null);

        KnightMeans.findMaxArmor(warrior);
    }
    @Test
    public void findMinArmor() {

        Knight warrior = new Knight();

        Ammunition expected = new Helmet();

        Assert.assertEquals(expected,KnightMeans.findMinArmor(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinArmorLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.findMinArmor(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinArmorNull() {

        Knight warrior = new Knight(null);

        KnightMeans.findMinArmor(warrior);
    }

    @Test
    public void findMaxMobility() {

        Knight warrior = new Knight();

        Ammunition expected = new ChainArmor();

        Assert.assertEquals(expected,KnightMeans.findMaxMobility(warrior));

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxMobilityLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.findMaxMobility(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMaxMobilityNull() {

        Knight warrior = new Knight(null);

        KnightMeans.findMaxMobility(warrior);
    }
    @Test
    public void findMinMobility() {

        Knight warrior = new Knight();

        Ammunition expected = new Helmet();

        Assert.assertEquals(expected,KnightMeans.findMinArmor(warrior));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinMobilityLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightMeans.findMinMobility(warrior);

    }

    @Test(expected = IllegalArgumentException.class)
    public void findMinMobilityNull() {

        Knight warrior = new Knight(null);

        KnightMeans.findMinMobility(warrior);
    }
}