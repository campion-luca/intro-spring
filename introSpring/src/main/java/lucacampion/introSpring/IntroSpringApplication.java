package lucacampion.introSpring;

import lucacampion.introSpring.entities.Drink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class IntroSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(IntroSpringApplication.class, args);


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(menuConfiguration.class);

		Drink dr = context.getBean(Drink.class);
		System.out.println(dr);





		context.close();
	}

}
