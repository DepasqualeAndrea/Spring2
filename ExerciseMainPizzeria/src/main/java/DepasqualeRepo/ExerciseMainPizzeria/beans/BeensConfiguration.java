package DepasqualeRepo.ExerciseMainPizzeria.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import DepasqualeRepo.ExerciseMainPizzeria.Classi.Bevande;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Ingredienti;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Pizza;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.PizzaMargherita;

@Configuration
public class BeensConfiguration {
	@Bean
	@Scope("prototype")
	Pizza pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	@Scope("prototype")
	Bevande bevandaVino() {
		return new Bevande("Calice di vino", 3.50, 400);
	}

	@Bean
	@Scope("prototype")
	Ingredienti ingredienteFunghi() {
		return new Ingredienti("Funghi", 1.20, 180);
	}

}
