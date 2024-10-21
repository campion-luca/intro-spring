package lucacampion.introSpring.entities;

public class Drink extends menuItems {

    public Drink(int calories, double price, String name) {
        super(calories, price, name);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
