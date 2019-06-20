package by.epam.javatraining.yasenko.maintask02.model.logic;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.Ammunition;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.Bow;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.ChainArmor;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.Shield;
import by.epam.javatraining.yasenko.maintask02.model.knight.Knight;
import by.epam.javatraining.yasenko.maintask02.model.logic.KnightSearching;
import org.junit.Assert;
import org.junit.Test;

public class KnightSearchingTest {

    @Test
    public void searchElement() {

        Knight warrior=new Knight();

        int expected = 2;

        Assert.assertEquals(expected, KnightSearching.searchElement(warrior,new Shield()));
    }
    @Test
    public void searchFalse() {

        Knight warrior=new Knight();

        int expected = -1;

        Assert.assertEquals(expected,KnightSearching.searchElement(warrior,new Bow()));
    }


    @Test(expected = IllegalArgumentException.class)
    public void searchElementLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightSearching.searchElement(warrior,new Shield());

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchElementNull() {

        Knight warrior = new Knight(null);

        KnightSearching.searchElement(warrior,new ChainArmor());
    }

    @Test
    public void searchDamage() {

        Knight warrior=new Knight();

        int expected = 3;

        Assert.assertEquals(expected,KnightSearching.searchDamage(warrior,50));

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDamageLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightSearching.searchDamage(warrior,2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchDamageNull() {

        Knight warrior = new Knight(null);

        KnightSearching.searchDamage(warrior,2);
    }

    @Test
    public void searchDamageFalse() {

        Knight warrior=new Knight();

        int expected = -1;

        Assert.assertEquals(expected,KnightSearching.searchDamage(warrior,5210));

    }

    @Test
    public void searchArmor() {

        Knight warrior=new Knight();

        int expected = 1;

        Assert.assertEquals(expected,KnightSearching.searchArmor(warrior,5));

    }

    @Test
    public void searchArmorFalse() {

        Knight warrior=new Knight();

        int expected = -1;

        Assert.assertEquals(expected,KnightSearching.searchArmor(warrior,215));

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchArmorLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightSearching.searchArmor(warrior,2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchArmorNull() {

        Knight warrior = new Knight(null);

        KnightSearching.searchArmor(warrior,2);
    }

    @Test
    public void searchMobility() {

        Knight warrior=new Knight();

        int expected = 0;

        Assert.assertEquals(expected,KnightSearching.searchMobility(warrior,30));
    }

    @Test
    public void searchMobilityFalse() {

        Knight warrior=new Knight();

        int expected = -1;

        Assert.assertEquals(expected,KnightSearching.searchMobility(warrior,123));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchMobilityLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightSearching.searchMobility(warrior,2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchMobilityNull() {

        Knight warrior = new Knight(null);

        KnightSearching.searchMobility(warrior,2);
    }
    @Test
    public void searchPrice() {

        Knight warrior=new Knight();

        int expected = 1;

        Assert.assertEquals(expected,KnightSearching.searchPrice(warrior,20));

    }

    @Test
    public void searchPriceFalse() {

        Knight warrior=new Knight();

        int expected = -1;

        Assert.assertEquals(expected,KnightSearching.searchPrice(warrior,220));

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchPriceLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightSearching.searchPrice(warrior,2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchPriceNull() {

        Knight warrior = new Knight(null);

        KnightSearching.searchPrice(warrior,2);
    }

    @Test
    public void searchWeight() {

        Knight warrior=new Knight();

        int expected = 2;

        Assert.assertEquals(expected,KnightSearching.searchWeight(warrior,50));

    }

    @Test
    public void searchWeightFalse() {

        Knight warrior=new Knight();

        int expected = -1;

        Assert.assertEquals(expected,KnightSearching.searchWeight(warrior,220));

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchWeightLength0() {

        Knight warrior = new Knight(new Ammunition[0]);

        KnightSearching.searchWeight(warrior,2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void searchWeightNull() {

        Knight warrior = new Knight(null);

        KnightSearching.searchWeight(warrior,2);
    }
}