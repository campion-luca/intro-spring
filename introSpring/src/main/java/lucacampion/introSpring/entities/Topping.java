package lucacampion.introSpring.entities;

public class Topping extends menuItems {

    public Topping(int calories, double price, String name) {
        super(calories, price, name);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
