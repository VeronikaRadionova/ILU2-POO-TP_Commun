package model;

public class FormulaireRestaurant extends ReservationRestaurant {
	
	private int identificationEntite; // ???
	
	public FormulaireRestaurant (int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois, numService, nbPersonnes);
	}

	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}

	
	
}
