package by.epam.javatraining.yasenko.maintask02.model.ammunition;

import java.util.Random;

public class Spear extends Weapon {

    private final int MAX_RANGE = 6;
    private final int MIN_RANGE = 2;
    private final int DEFAULT_RANGE = 3;
    protected final int DEFAULT_DAMAGE = 60;
    protected final double DEFAULT_PRICE=70;
    protected final double DEFAULT_WEIGHT=80;

    boolean presence;

    public Spear(double weight, double price, int damage, int range) {

        this.weight = weight;
        this.price = price;

        this.damage = damage < MAX_DAMAGE && damage > 0 ? damage : DEFAULT_DAMAGE;

        this.range = range < MAX_RANGE && range > MIN_RANGE ? range : DEFAULT_RANGE;

        presence = true;
    }

    public Spear() {

        weight = DEFAULT_WEIGHT;
        price = DEFAULT_PRICE;

        this.damage = DEFAULT_DAMAGE;

        this.range = DEFAULT_RANGE;

        presence = true;
    }

    @Override
    public int attack(int damage, int distance) {

        int attackValue = 0;

        if (distance <= range && distance >= MIN_RANGE && presence) {
            Random rand = new Random();
            attackValue = rand.nextInt(damage);
        }

        return attackValue;
    }

    public int shoot(int damage, int distance) {

        int attackValue = 0;

        if (distance <= MAX_RANGE && distance >= MIN_RANGE && presence) {
            Random rand = new Random();
            attackValue = rand.nextInt(damage * 2);
            presence = false;
        }

        return attackValue;
    }

    public void put() {
        presence = true;
    }

    public void setDamage(int damage) {
        this.damage = damage < MAX_DAMAGE && damage > 0 ? damage : this.damage;
    }

    public void setRange(int range) {
        this.range = range < MAX_RANGE && range > MIN_RANGE ? range : this.range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spear)) return false;
        Spear spear = (Spear) o;
        return weight == spear.weight
                && price == spear.price
                && damage == spear.damage
                && range == spear.range;
    }

    @Override
    public String toString() {
        return "Spear{"
                + ", weight=" + weight +
                ", price=" + price +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
