package DepasqualeRepo.ExerciseMainPizzeria.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import DepasqualeRepo.ExerciseMainPizzeria.Classi.Bevande;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Ingredienti;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Ordine;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Pizza;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.PizzaMargherita;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Tavoli;
import DepasqualeRepo.ExerciseMainPizzeria.Decorator.DecoratorPizza;
import DepasqualeRepo.ExerciseMainPizzeria.Decorator.DecoratoreSize;
import DepasqualeRepo.ExerciseMainPizzeria.EnumStao.StatoOrdine;
import DepasqualeRepo.ExerciseMainPizzeria.EnumStao.StatoTavolo;

@Configuration
@PropertySource("classpath:application.properties")
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
	Bevande bevandaCoca() {
		return new Bevande("Cocacola", 2.50, 800);
	}

	@Bean
	@Scope("prototype")
	Ingredienti ingredienteFunghi() {
		return new Ingredienti("Funghi", 1.20, 180);
	}

	@Bean
	@Scope("prototype")
	Ingredienti ingredienteCotto() {
		return new Ingredienti("Cotto", 1.40, 180);
	}

	@Bean
	@Scope("prototype")
	Ingredienti ingredienteCrudo() {
		return new Ingredienti("Crudo", 1.70, 180);
	}

	@Bean
	@Scope("prototype")
	Pizza pizzaConCotto() {
		return new DecoratorPizza(new PizzaMargherita(), ingredienteCotto());
	}

	@Bean
	@Scope("prototype")
	Pizza pizzaCustom() {
		DecoratorPizza custom1 = new DecoratorPizza(new DecoratorPizza(new PizzaMargherita(), ingredienteCotto()),
				ingredienteCrudo());
		custom1.setName("Margherta Cotto & Crudo");
		return custom1;
	}

	@Bean
	@Scope("prototype")
	Pizza pizzaMaxi() {
		DecoratoreSize custom2 = new DecoratoreSize(new DecoratorPizza(new PizzaMargherita(), ingredienteFunghi()));
		custom2.setName("Maxi Pizza");
		return custom2;
	}

	@Bean
	@Scope("prototype")
	Ordine ordinetav1() {
		List<Pizza> listaPizze = new ArrayList<>();
		listaPizze.add(pizzaMaxi());
		listaPizze.add(pizzaCustom());
		listaPizze.add(pizzaConCotto());
		List<Bevande> bevanda = new ArrayList<>();
		bevanda.add(bevandaCoca());
		bevanda.add(bevandaVino());
		bevanda.add(bevandaVino());
		bevanda.add(bevandaVino());
		return new Ordine(12, StatoOrdine.INCORSO, 3, LocalDate.now(), tavolo1(), listaPizze, bevanda);
	}

	@Bean
	@Scope("prototype")
	Tavoli tavolo1() {
		Tavoli tavolo1 = new Tavoli(0, 4, StatoTavolo.OCCUPATO);
		tavolo1.setNumeroTavolo(1);
		return tavolo1;
	}

}
