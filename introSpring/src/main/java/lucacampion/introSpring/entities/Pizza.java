package lucacampion.introSpring.entities;

public class Pizza extends menuItems {
    private Topping topping;


    public Pizza(int calories, double price, String name, Topping topping) {
        super(calories, price, name);
        this.topping = topping;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + topping +
                ", calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
