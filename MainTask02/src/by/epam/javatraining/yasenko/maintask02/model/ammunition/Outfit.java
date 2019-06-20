package by.epam.javatraining.yasenko.maintask02.model.ammunition;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.Ammunition;

public abstract class Outfit extends Ammunition {

    protected int armor;
    protected int mobility;
    protected int durability;

    public int getArmor() {
        return armor;
    }

    public abstract void setArmor(int armor);

    public int getMobility() {
        return mobility;
    }

    public abstract void setMobility(int mobility);

    public int getDurability() {
        return durability;
    }

    public abstract void setDurability(int durability);

    protected abstract int defend(int attackValue);

    protected abstract int dodge(int attackValue);

    public abstract boolean equals(Object o);

    public abstract String toString();


}
