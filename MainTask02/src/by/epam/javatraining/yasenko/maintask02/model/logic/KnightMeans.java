package by.epam.javatraining.yasenko.maintask02.model.logic;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.Ammunition;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.Outfit;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.Weapon;
import by.epam.javatraining.yasenko.maintask02.model.knight.Knight;

public class KnightMeans {

    private static final String MSG_GET_DAMAGE = "getDamage()";
    private static final String MSG_GET_ARMOR = "getArmor()";
    private static final String MSG_GET_PRICE = "getPrice()";
    private static final String MSG_GET_WEIGHT = "getWeight()";
    private static final String MSG_GET_MOBILITY = "getMobility()";
    private static final String MSG_FIND_MAX_DAMAGE = "findMaxDamage()";
    private static final String MSG_FIND_MIN_DAMAGE = "findMinDamage()";
    private static final String MSG_FIND_MAX_ARMOR = "findMaxArmor()";
    private static final String MSG_FIND_MIN_ARMOR = "findMinArmor()";
    private static final String MSG_FIND_MAX_MOBILITY = "findMaxMobility()";
    private static final String MSG_FIND_MIN_MOBILITY = "findMinMobility()";
    private static final String MSG_FIND_MAX_PRICE = "findMaxPrice()";
    private static final String MSG_FIND_MIN_PRICE = "findMinPrice()";
    private static final String MSG_FIND_MAX_WEIGHT = "findMaxWeight()";
    private static final String MSG_FIND_MIN_WEIGHT = "findMinMobilityWeight()";


    public static int getDamage(Knight warrior) {

        Knight.checkKnight(warrior, MSG_GET_DAMAGE);

        int damage = 0;

        for (Ammunition item : warrior.getEquipment()) {
            if (item instanceof Weapon) {
                damage += ((Weapon) item).getDamage();
            }
        }
        return damage;
    }

    public static int getArmor(Knight warrior) {

        Knight.checkKnight(warrior, MSG_GET_ARMOR);

        int armor = 0;

        for (Ammunition item : warrior.getEquipment()) {
            if (item instanceof Outfit) {
                armor += ((Outfit) item).getArmor();
            }
        }
        return armor;
    }

    public static int getPrice(Knight warrior) {

        Knight.checkKnight(warrior, MSG_GET_PRICE);

        int price = 0;

        for (Ammunition item : warrior.getEquipment()) {
            price += item.getPrice();
        }

        return price;
    }

    public static int getWeight(Knight warrior) {

        Knight.checkKnight(warrior, MSG_GET_WEIGHT);

        int weight = 0;

        for (Ammunition item : warrior.getEquipment()) {
            weight += item.getWeight();
        }

        return weight;
    }

    public static int getMobility(Knight warrior) {

        Knight.checkKnight(warrior, MSG_GET_MOBILITY);

        int mobility = 0;

        for (Ammunition item : warrior.getEquipment()) {
            if (item instanceof Outfit) {
                mobility += ((Outfit) item).getMobility();
            }
        }
        return mobility;
    }

    public static Ammunition findMaxDamage(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MAX_DAMAGE);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition max = equipment[0];

        for (Ammunition item : equipment) {

            if (item instanceof Weapon && max instanceof Weapon) {
                max = ((Weapon) max).getDamage() < ((Weapon) item).getDamage() ? item : max;

            } else if (item instanceof Weapon && !(max instanceof Weapon)) {
                max = item;
            }
        }

        return max;
    }


    public static Ammunition findMinDamage(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MIN_DAMAGE);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition min = equipment[0];

        for (Ammunition item : equipment) {
            if (item instanceof Weapon && min instanceof Weapon) {
                min = ((Weapon) min).getDamage() > ((Weapon) item).getDamage() ? item : min;

            } else if (item instanceof Weapon && !(min instanceof Weapon)) {
                min = item;
            }
        }
        return min;
    }

    public static Ammunition findMaxArmor(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MAX_ARMOR);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition max = equipment[0];

        for (Ammunition item : equipment) {
            if (item instanceof Outfit && max instanceof Outfit) {
                max = ((Outfit) max).getArmor() < ((Outfit) item).getArmor() ? item : max;

            } else if (item instanceof Outfit && !(max instanceof Outfit)) {
                max = item;
            }
        }
        return max;
    }

    public static Ammunition findMinArmor(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MIN_ARMOR);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition min = equipment[0];

        for (Ammunition item : equipment) {
            if (item instanceof Outfit && min instanceof Outfit) {
                min = ((Outfit) min).getArmor() > ((Outfit) item).getArmor() ? item : min;

            } else if (item instanceof Outfit && !(min instanceof Outfit)) {
                min = item;
            }
        }
        return min;
    }

    public static Ammunition findMaxMobility(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MAX_MOBILITY);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition max = equipment[0];

        for (Ammunition item : equipment) {
            if (item instanceof Outfit && max instanceof Outfit) {
                max = ((Outfit) max).getMobility() < ((Outfit) item).getMobility() ? item : max;

            } else if (item instanceof Outfit && !(max instanceof Outfit)) {
                max = item;
            }
        }
        return max;
    }

    public static Ammunition findMinMobility(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MIN_MOBILITY);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition min = equipment[0];

        for (Ammunition item : equipment) {
            if (item instanceof Outfit && min instanceof Outfit) {
                min = ((Outfit) min).getMobility() > ((Outfit) item).getMobility() ? item : min;

            } else if (item instanceof Outfit && !(min instanceof Outfit)) {
                min = item;
            }
        }
        return min;
    }

    public static Ammunition findMaxPrice(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MAX_PRICE);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition max = equipment[0];

        for (Ammunition item : equipment) {
            max = max.getPrice() < item.getPrice() ? item : max;
        }
        return max;
    }

    public static Ammunition findMinPrice(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MIN_PRICE);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition min = equipment[0];

        for (Ammunition item : equipment) {
            min = min.getPrice() > item.getPrice() ? item : min;
        }
        return min;
    }

    public static Ammunition findMaxWeight(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MAX_WEIGHT);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition max = equipment[0];

        for (Ammunition item : equipment) {
            max = max.getWeight() < item.getWeight() ? item : max;
        }
        return max;
    }

    public static Ammunition findMinWeight(Knight warrior) {

        Knight.checkKnight(warrior, MSG_FIND_MIN_WEIGHT);

        Ammunition[] equipment = warrior.getEquipment();

        Ammunition min = equipment[0];

        for (Ammunition item : equipment) {
            min = min.getWeight() > item.getWeight() ? item : min;
        }
        return min;
    }


}
