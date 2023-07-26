package DepasqualeRepo.ExerciseMainPizzeria.Decorator;

import DepasqualeRepo.ExerciseMainPizzeria.Classi.Pizza;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DecoratoreSize extends Pizza {

	public DecoratoreSize(Pizza pizza) {
		super(pizza.getName() + " MaxiPizza ", pizza.getPrice() + 4.15, pizza.getCalorie() * 1.95);

	}

}
