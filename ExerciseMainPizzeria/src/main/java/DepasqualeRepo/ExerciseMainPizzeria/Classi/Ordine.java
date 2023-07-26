package DepasqualeRepo.ExerciseMainPizzeria.Classi;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import DepasqualeRepo.ExerciseMainPizzeria.EnumStao.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ordine {
	private int numeroOrdine;
	private StatoOrdine stato;
	private int numCoperti;
	private LocalDate orario;
	@Value("${application.costoCoperto}")
	private double costoCoperto;
	private Tavoli tavolo;
	private List<Pizza> pizza;
	private List<Bevande> bevande;
	// private List<Oggettistica> oggettistica;

	public Ordine(int numeroOrdine, StatoOrdine stato, int numCoperti, LocalDate orario, Tavoli tavolo,
			List<Pizza> pizza, List<Bevande> bevande) {
		this.numeroOrdine = numeroOrdine;
		this.stato = stato;
		this.numCoperti = numCoperti;
		this.orario = orario;
		this.tavolo = tavolo;
		this.pizza = pizza;
		this.bevande = bevande;
	}

	public double totale() {
		List<Pizza> listaPizze = this.getPizza();
		List<Bevande> listaBevande = this.getBevande();

		double sum = 0;
		for (int i = 0; i < listaPizze.size(); i++) {
			sum = sum + pizza.get(i).getPrice();
		}
		for (int i = 0; i < listaBevande.size(); i++) {
			sum = sum + bevande.get(i).getPrice();
		}

		sum = sum + (this.numCoperti * this.costoCoperto);

		return sum;

	}

	@Override
	public String toString() {
		return "Ordine [numeroOrdine=" + numeroOrdine + ", stato=" + stato + ", numCoperti=" + numCoperti
				+ ", \n orario=" + orario + ", costoCoperto=" + costoCoperto + ", tavolo=" + tavolo + ", \n pizza="
				+ pizza + ", bevande=" + bevande + "]";
	}

}
