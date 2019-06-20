package by.epam.javatraining.yasenko.maintask02.model.ammunition;

public class ChainArmor extends Outfit {

    private final int MAX_ARMOR = 100;
    private final int DEFAULT_ARMOR = 70;
    private final int MAX_DURABILITY = 100;
    protected final double DEFAULT_PRICE=100;
    protected final double DEFAULT_WEIGHT=150;


    public ChainArmor(double weight, double price, int armor) {

        this.weight = weight;
        this.price = price;

        this.armor = armor < MAX_ARMOR && armor > 0 ? armor : DEFAULT_ARMOR;

        mobility = MAX_ARMOR - this.armor;
        durability = MAX_DURABILITY;
    }

    public ChainArmor() {

        weight = DEFAULT_WEIGHT;
        price = DEFAULT_PRICE;

        armor = DEFAULT_ARMOR;

        mobility = MAX_ARMOR - armor;
        durability = MAX_DURABILITY;
    }

    @Override
    protected int defend(int attackValue) {
        if (durability > 0) {
            durability -= attackValue;
            durability = durability < 0 ? 0 : durability;

            attackValue -= armor;
            attackValue = attackValue < 0 ? 0 : attackValue;
        }

        return attackValue;
    }

    @Override
    protected int dodge(int attackValue) {

        if (mobility > attackValue) {
            attackValue = 0;
        }

        return attackValue;
    }

    public void setArmor(int armor) {
        this.armor = armor < MAX_ARMOR && armor > 0 ? armor : this.armor;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility < MAX_ARMOR && mobility > 0 ? mobility : this.mobility;
    }

    public void setDurability(int durability) {
        this.durability = durability < MAX_DURABILITY && durability > 0 ? durability : this.durability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChainArmor)) return false;
        ChainArmor chainArmor = (ChainArmor) o;
        return weight == chainArmor.weight &&
                price == chainArmor.price &&
                armor == chainArmor.armor &&
                mobility == chainArmor.mobility &&
                durability == chainArmor.durability;
    }

    @Override
    public String toString() {
        return "ChainArmor{" +
                "armor=" + armor +
                ", mobility=" + mobility +
                ", durability=" + durability +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}