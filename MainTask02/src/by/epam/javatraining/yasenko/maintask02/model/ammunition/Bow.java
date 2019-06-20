package by.epam.javatraining.yasenko.maintask02.model.ammunition;

import java.util.Random;

    public class Bow extends Weapon {

        private final int MAX_RANGE = 30;
        private final int MIN_RANGE = 8;
        private final int MAX_ARROWS = 20;
        protected final int DEFAULT_DAMAGE = 30;
        protected final double DEFAULT_PRICE=30;
        protected final double DEFAULT_WEIGHT=20;

        private int arrows;

        public Bow(double weight, double price, int damage, int range) {

            this.weight = weight;
            this.price = price;

            this.damage = damage < MAX_DAMAGE && damage > 0 ? damage : DEFAULT_DAMAGE;

            this.range = range < MAX_RANGE && range > MIN_RANGE ? range : DEFAULT_DAMAGE;

            arrows = MAX_ARROWS;
        }

        public Bow() {

            weight = weight;
            price = price;

            damage = DEFAULT_DAMAGE;

            range = DEFAULT_DAMAGE;

            arrows = MAX_ARROWS;
        }

        @Override
        public int attack(int damage, int distance) {

            int attackValue = 0;

            if (distance <= range && distance >= MIN_RANGE && arrows > 0) {
                Random rand = new Random();
                attackValue = rand.nextInt(damage);
                arrows--;
            }

            return attackValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Bow)) return false;
            Bow bow = (Bow) o;
            return weight == bow.weight
                    && price == bow.price
                    && damage == bow.damage
                    && range == bow.range
                    && arrows == bow.arrows;
        }

        public void setDamage(int damage) {
            this.damage = damage < MAX_DAMAGE && damage > 0 ? damage : this.damage;
        }

        public void setRange(int range) {
            this.range = range < MAX_RANGE && range > MIN_RANGE ? range : this.range;
        }


        @Override
        public String toString() {
            return "Bow{" +
                    ", weight=" + weight +
                    ", price=" + price +
                    ", damage=" + damage +
                    ", range=" + range +
                    "arrows=" + arrows +
                    '}';
        }

        public void putArrow() {
            arrows++;
        }


    }


