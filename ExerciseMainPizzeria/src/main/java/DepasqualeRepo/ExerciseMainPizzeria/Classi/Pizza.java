package DepasqualeRepo.ExerciseMainPizzeria.Classi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pizza extends Commestibile {

	public Pizza(String name, double price, double calorie) {
		super(name, price, calorie);
	}

	@Override
	public String toString() {
		return "Pizza [Calorie=" + getCalorie() + ", Name=" + getName() + ", Price=" + getPrice() + "]";
	}
	
}
