package DepasqualeRepo.ExerciseMainPizzeria.Decorator;

import DepasqualeRepo.ExerciseMainPizzeria.Classi.Ingredienti;
import DepasqualeRepo.ExerciseMainPizzeria.Classi.Pizza;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecoratorPizza extends Pizza {

	public DecoratorPizza(Pizza pizza, Ingredienti ingrediente) {
		super(pizza.getName() + " + " + ingrediente.getName(), pizza.getPrice() + ingrediente.getPrice(),
				pizza.getCalorie() + ingrediente.getCalorie());
	}

}
