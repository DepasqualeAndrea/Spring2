package DepasqualeRepo.ExerciseMainPizzeria.Classi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Oggettistica extends Merce {

	public Oggettistica(String name, double price) {
		super(name, price);
	
	}

	@Override
	public String toString() {
		return "Oggettistica [Nome=" + getName() + ", Prezzo=" + getPrice() + "]";
	}


}
