package by.epam.javatraining.yasenko.maintask02.model.ammunition;

import by.epam.javatraining.yasenko.maintask02.model.ammunition.Ammunition;

abstract public class Weapon extends Ammunition {

    protected int damage;
    protected int range;

    protected final int MAX_DAMAGE = 80;


    public abstract int attack(int damage, int distance);

    public int getDamage() {
        return damage;
    }

    public abstract void setDamage(int damage);

    public int getRange() {
        return range;
    }

    public abstract void setRange(int range);

    public abstract boolean equals(Object o);


    public abstract String toString();

}
