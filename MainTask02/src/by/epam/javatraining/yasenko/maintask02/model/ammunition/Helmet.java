package by.epam.javatraining.yasenko.maintask02.model.ammunition;

public class Helmet extends Outfit {


    private int visibility;

    private final int MAX_ARMOR = 10;
    private final int DEFAULT_ARMOR = 5;
    private final int MAX_MOBILITY = 20;
    private final int MIN_MOBILITY = 10;
    private final int MAX_DURABILITY = 10;
    protected final double DEFAULT_PRICE=20;
    protected final double DEFAULT_WEIGHT=30;

    public Helmet(double weight, double price, int armor) {

        this.weight = weight;
        this.price = price;

        this.armor = armor < MAX_ARMOR && armor > 0 ? armor : DEFAULT_ARMOR;

        visibility = MAX_ARMOR - this.armor;
        mobility = visibility + MIN_MOBILITY;
        durability = MAX_DURABILITY;
    }

    public Helmet() {

        weight = DEFAULT_WEIGHT;
        price = DEFAULT_PRICE;

        armor = DEFAULT_ARMOR;

        visibility = MAX_ARMOR - armor;
        mobility = visibility + MIN_MOBILITY;
        durability = MAX_DURABILITY;
    }

    @Override
    protected int defend(int attackValue) {
        if (durability > 0) {
            durability--;
            attackValue = 0;
        }
        return attackValue;
    }

    @Override
    protected int dodge(int attackValue) {

        if (2 * (visibility + mobility) > attackValue) {
            attackValue = 0;
        }
        return attackValue;
    }

    public void setArmor(int armor) {
        this.armor = armor < MAX_ARMOR && armor > 0 ? armor : this.armor;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility < MAX_MOBILITY && mobility > MIN_MOBILITY ? mobility : this.mobility;
    }

    public void setDurability(int durability) {
        this.durability = durability < MAX_DURABILITY && durability > 0 ? durability : this.durability;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = armor < MAX_ARMOR && armor > 0 ? visibility : this.visibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helmet)) return false;
        Helmet helmet = (Helmet) o;
        return weight == helmet.weight &&
                price == helmet.price &&
                armor == helmet.armor &&
                mobility == helmet.mobility &&
                durability == helmet.durability &&
                visibility == helmet.visibility;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "armor=" + armor +
                ", mobility=" + mobility +
                ", durability=" + durability +
                ", visibility=" + visibility +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

}
