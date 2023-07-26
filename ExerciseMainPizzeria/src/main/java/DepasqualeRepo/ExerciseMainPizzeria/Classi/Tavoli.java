package DepasqualeRepo.ExerciseMainPizzeria.Classi;

import DepasqualeRepo.ExerciseMainPizzeria.EnumStao.StatoTavolo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavoli {
	private int numeroTavolo;
	private int postiASedere;
	private StatoTavolo stato;
	private Ordine ordine;

	public Tavoli(int numeroTavolo, int postiASedere, StatoTavolo stato) {
		super();
		this.numeroTavolo = numeroTavolo;
		this.postiASedere = postiASedere;
		this.stato = stato;

	}

	@Override
	public String toString() {
		return "Tavoli [numeroTavolo=" + numeroTavolo + ", postiASedere=" + postiASedere + ", stato=" + stato + "]";
	}

}
