package by.epam.javatraining.yasenko.maintask02.model.ammunition;

import java.util.Random;

public class Sword extends Weapon {

    private final int MAX_RANGE = 3;
    private final int DEFAULT_RANGE = 1;
    protected final int DEFAULT_DAMAGE = 50;
    protected final double DEFAULT_PRICE=60;
    protected final double DEFAULT_WEIGHT=60;

    public Sword(double weight, double price, int damage, int range) {

        this.weight = weight;
        this.price = price;

        this.damage = damage < MAX_DAMAGE && damage > 0 ? damage : DEFAULT_DAMAGE;

        this.range = range < MAX_RANGE && range > 0 ? range : DEFAULT_RANGE;
    }

    public Sword() {

        weight = DEFAULT_WEIGHT;
        this.price = DEFAULT_PRICE;

        this.damage =  DEFAULT_DAMAGE;

        this.range =  DEFAULT_RANGE;
    }

    @Override
    public int attack(int damage, int distance) {

        int attackValue = 0;

        if (distance <= range) {
            Random rand = new Random();
            attackValue = rand.nextInt(damage);
        }

        return attackValue;
    }

    public void setDamage(int damage) {
        this.damage = damage < MAX_DAMAGE && damage > 0 ? damage : this.damage;
    }
    public void setRange(int range) {
        this.range = range < MAX_RANGE && range > 0 ? range : this.range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sword)) return false;
        Sword sword = (Sword) o;
        return weight == sword.weight
                && price == sword.price
                && damage == sword.damage
                && range == sword.range;
    }

    @Override
    public String toString() {
        return "Sword{" +
                ", weight=" + weight +
                ", price=" + price +
                ", damage=" + damage +
                ", range=" + range +
                '}';
    }
}
