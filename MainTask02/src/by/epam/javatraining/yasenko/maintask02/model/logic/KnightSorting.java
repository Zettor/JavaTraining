package by.epam.javatraining.yasenko.maintask02.model.logic;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.Ammunition;
import by.epam.javatraining.yasenko.maintask02.model.knight.Knight;

public class KnightSorting {


    private static final String MSG_SORT_BY_PRICE_INCREASE = "sortByPriceIncrease()";
    private static final String MSG_SORT_BY_WEIGHT_INCREASE = "sortByDamageIncrease()";
    private static final String MSG_SORT_BY_PRICE_DECREASE = "sortByPriceDecrease()";
    private static final String MSG_SORT_BY_WEIGHT_DECREASE = "sortByDamageDecrease()";


    public static void sortByPriceIncrease(Knight warrior) {

        Knight.checkKnightOnlyNull(warrior, MSG_SORT_BY_PRICE_INCREASE);

        Ammunition[] equipment = warrior.getEquipment();

        for (int i = 0; i < equipment.length; i++) {

            int minIndex = i;

            for (int j = i; j < equipment.length; j++) {
                if (equipment[j].getPrice() < equipment[minIndex].getPrice()) {
                    minIndex = j;
                }
            }
            warrior.swap(i, minIndex);
        }
    }

    public static void sortByPriceDecrease(Knight warrior) {

        Knight.checkKnightOnlyNull(warrior, MSG_SORT_BY_PRICE_DECREASE);

        Ammunition[] equipment = warrior.getEquipment();

        for (int i = 0; i < equipment.length; i++) {

            int maxIndex = i;

            for (int j = i; j < equipment.length; j++) {
                if (equipment[j].getPrice() > equipment[maxIndex].getPrice()) {
                    maxIndex = j;
                }
            }
            warrior.swap(i, maxIndex);
        }
    }

    public static void sortByWeightIncrease(Knight warrior) {

        Knight.checkKnightOnlyNull(warrior, MSG_SORT_BY_WEIGHT_INCREASE);

        Ammunition[] equipment = warrior.getEquipment();

        for (int i = 0; i < equipment.length; i++) {

            int minIndex = i;

            for (int j = i; j < equipment.length; j++) {
                if (equipment[j].getWeight() < equipment[minIndex].getWeight()) {
                    minIndex = j;
                }
            }
            warrior.swap(i, minIndex);
        }
    }

    public static void sortByWeightDecrease(Knight warrior) {

        Knight.checkKnightOnlyNull(warrior, MSG_SORT_BY_WEIGHT_DECREASE);

        Ammunition[] equipment = warrior.getEquipment();

        for (int i = 0; i < equipment.length; i++) {

            int maxIndex = i;

            for (int j = i; j < equipment.length; j++) {
                if (equipment[j].getWeight() > equipment[maxIndex].getWeight()) {
                    maxIndex = j;
                }
            }
            warrior.swap(i, maxIndex);
        }
    }
}