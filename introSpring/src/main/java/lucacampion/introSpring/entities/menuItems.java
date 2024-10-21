package lucacampion.introSpring.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public abstract class menuItems {

    protected int calories;
    protected double price;
    protected String name;

}
