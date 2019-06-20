package by.epam.javatraining.yasenko.maintask02.model.ammunition;

public class Shield extends Outfit {

    private int size;
    private int stamina;

    private final int MAX_SIZE = 5;
    private final int MIN_SIZE = 1;
    private final int DEFAULT_SIZE = 3;
    private final int MAX_ARMOR = 50;
    private final int MIN_ARMOR = 10;
    private final int MAX_DURABILITY = 50;
    private final int MAX_STAMINA = 20;
    protected final double DEFAULT_PRICE=50;
    protected final double DEFAULT_WEIGHT=50;


    public Shield(double weight, double price, int size) {

        this.weight = weight;
        this.price = price;

        this.size = size < MAX_SIZE && armor > MIN_SIZE ? size : DEFAULT_SIZE;

        armor = this.size * MIN_ARMOR;
        this.mobility = MAX_ARMOR - armor;
        durability = MAX_DURABILITY;
        stamina = MAX_STAMINA;
    }

    public Shield() {

        weight = DEFAULT_WEIGHT;
        price = DEFAULT_PRICE;

        size = DEFAULT_SIZE;
        armor = size * MIN_ARMOR;
        this.mobility = MAX_ARMOR - armor;
        durability = MAX_DURABILITY;
        stamina = MAX_STAMINA;
    }

    @Override
    protected int defend(int attackValue) {

        if (stamina > 0 && durability > 0) {
            durability -= attackValue / 10;
            durability = durability < 0 ? 0 : durability;
            stamina--;

            attackValue -= armor;
            attackValue = attackValue < 0 ? 0 : attackValue;
        }
        return attackValue;
    }

    @Override
    protected int dodge(int attackValue) {
        if (stamina > 0 && mobility > attackValue / 10) {
            attackValue = 0;
        }
        return attackValue;
    }

    public int parry(int attackValue) {

        if (stamina > 0 && durability > 0) {
            attackValue -= armor;
        }
        return attackValue;
    }

    public void setArmor(int armor) {
        this.armor = armor < MAX_ARMOR && armor > MIN_ARMOR ? armor : this.armor;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility < MAX_ARMOR && mobility > MIN_ARMOR ? mobility : this.mobility;
    }

    public void setDurability(int durability) {
        this.durability = durability < MAX_DURABILITY && durability > 0 ? durability : this.durability;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size < MAX_SIZE && size > MIN_SIZE ? size : this.size;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina < MAX_STAMINA && stamina > 0 ? stamina : this.stamina;
        ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shield)) return false;
        Shield shield = (Shield) o;
        return weight == shield.weight &&
                price == shield.price &&
                size == shield.size &&
                armor == shield.armor &&
                mobility == shield.mobility &&
                durability == shield.durability &&
                stamina == shield.stamina;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "size=" + size +
                ", stamina=" + stamina +
                ", armor=" + armor +
                ", mobility=" + mobility +
                ", durability=" + durability +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
