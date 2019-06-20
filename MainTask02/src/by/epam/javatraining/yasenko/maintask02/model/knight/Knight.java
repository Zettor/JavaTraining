package by.epam.javatraining.yasenko.maintask02.model.knight;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.*;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Knight {

    private final String MSG_EQUIP = "equip()";
    private final String MSG_REMOVE = "remove()";

    private static final Logger LOGGER = Logger.getRootLogger();

    private Ammunition[] equipment;

    public Knight(Ammunition... item) {
        if (item != null) {
            equipment = new Ammunition[item.length];
            for (int i = 0; i < item.length; i++) {
                equipment[i] = item[i];
            }

        } else {
            equipment = item;
        }

    }

    public Knight() {

        equipment = new Ammunition[4];

        equipment[0] = new ChainArmor();
        equipment[1] = new Helmet();
        equipment[2] = new Shield();
        equipment[3] = new Sword();
    }

    public void equip(Ammunition item) {

        checkKnightOnlyNull(this, MSG_EQUIP);

        Ammunition[] temp = new Ammunition[equipment.length + 1];
        System.arraycopy(equipment, 0, temp, 0, equipment.length);
        equipment = temp;
        equipment[equipment.length - 1] = item;

    }

    public void remove() {

        checkKnight(this, MSG_REMOVE);

        equipment = Arrays.copyOf(equipment, equipment.length - 1);
    }

    public Ammunition[] getEquipment() {
        return equipment;
    }

    public void swap(int i, int j) {

        Ammunition temp = equipment[i];
        equipment[i] = equipment[j];
        equipment[j] = temp;
    }

    public static void checkKnight(Knight warrior, String method) {

        if (warrior.getEquipment() == null || warrior.getEquipment().length == 0) {
            LOGGER.error(method + " method got incorrect input data(equipment == null or equipment.length == 0) ");
            throw new IllegalArgumentException();
        }
    }

    public static void checkKnightOnlyNull(Knight warrior, String method) {

        if (warrior.getEquipment() == null) {
            LOGGER.error(method + " method got incorrect input data(equipment == null) ");
            throw new IllegalArgumentException();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Knight)) return false;
        Knight knight = (Knight) o;

        if (knight.equipment == null || knight.equipment.length != this.equipment.length) {
            return false;
        }

        for (int i = 0; i < knight.equipment.length; i++) {
            if (!knight.equipment[i].equals(this.equipment[i])) {
                return false;
            }
        }
        return true;
    }
}
