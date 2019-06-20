package by.epam.javatraining.yasenko.maintask02.model.logic;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.Ammunition;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.Outfit;
import by.epam.javatraining.yasenko.maintask02.model.ammunition.Weapon;
import by.epam.javatraining.yasenko.maintask02.model.knight.Knight;

public class KnightSearching {

    private static final int WRONG_INDEX = -1;

    private static final String MSG_SEARCH_ELEMENT="searchElement()";
    private static final String MSG_SEARCH_DAMAGE="searchDamage()";
    private static final String MSG_SEARCH_ARMOR="searchArmor()";
    private static final String MSG_SEARCH_MOBILITY="searchMobility()";
    private static final String MSG_SEARCH_PRICE="searchPrice()";
    private static final String MSG_SEARCH_WEIGHT="searchWeight()";


    public static int searchElement(Knight warrior, Ammunition element) {

        Knight.checkKnight(warrior,MSG_SEARCH_ELEMENT);

        Ammunition[] equipment = warrior.getEquipment();

        int result = WRONG_INDEX;

        for (int i = 0; i < equipment.length; i++) {
            if (element.equals(equipment[i])) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int searchDamage(Knight warrior, int damage) {

        Knight.checkKnight(warrior,MSG_SEARCH_DAMAGE);

        Ammunition[] equipment = warrior.getEquipment();

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < equipment.length; i++) {        //iterate over the components of the vector
            if (equipment[i] instanceof Weapon && ((Weapon) equipment[i]).getDamage() == damage) {                  // and look for our element
                result = i;
                break;
            }
        }
        return result;
    }

    public static int searchArmor(Knight warrior, int armor) {

        Knight.checkKnight(warrior,MSG_SEARCH_ARMOR);

        Ammunition[] equipment = warrior.getEquipment();

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < equipment.length; i++) {        //iterate over the components of the vector
            if (equipment[i] instanceof Outfit && ((Outfit) equipment[i]).getArmor() == armor) {                  // and look for our element
                result = i;
                break;
            }
        }
        return result;
    }

    public static int searchMobility(Knight warrior, int mobility) {

        Knight.checkKnight(warrior,MSG_SEARCH_MOBILITY);

        Ammunition[] equipment = warrior.getEquipment();

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < equipment.length; i++) {        //iterate over the components of the vector
            if (equipment[i] instanceof Outfit && ((Outfit) equipment[i]).getMobility() == mobility) {                  // and look for our element
                result = i;
                break;
            }
        }
        return result;
    }

    public static int searchPrice(Knight warrior, int price) {

        Knight.checkKnight(warrior,MSG_SEARCH_PRICE);

        Ammunition[] equipment = warrior.getEquipment();

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < equipment.length; i++) {        //iterate over the components of the vector
            if (equipment[i].getPrice() == price) {                  // and look for our element
                result = i;
                break;
            }
        }
        return result;
    }

    public static int searchWeight(Knight warrior, int weight) {

        Knight.checkKnight(warrior,MSG_SEARCH_WEIGHT);

        Ammunition[] equipment = warrior.getEquipment();

        int result = WRONG_INDEX;                        //if the vector does not contain this element return -1

        for (int i = 0; i < equipment.length; i++) {        //iterate over the components of the vector
            if (equipment[i].getWeight() == weight) {                  // and look for our element
                result = i;
                break;
            }
        }
        return result;
    }


}
