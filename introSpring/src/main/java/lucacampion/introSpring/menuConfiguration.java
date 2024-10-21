package lucacampion.introSpring;
import lucacampion.introSpring.entities.Drink;
import lucacampion.introSpring.entities.Pizza;
import lucacampion.introSpring.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class menuConfiguration {


    @Bean
    @Scope("prototype")
    public Drink getDrink1() {
        return new Drink(128,1.29,"Lemonade (0.33l)");
    }

    @Bean
    @Scope("prototype")
    public Drink getDrink2() {
        return new Drink(0,1.29,"Water (0.5l)");
    }

    @Bean
    @Scope("prototype")
    public Drink getDrink3() {
        return new Drink(607,7.49,"Wine (0.75l, 13%");
    }


//    @Bean
//    public Pizza getPizza() {
//        return new Pizza(1108,4.99,"Pizza Margherita");
//    }

}
