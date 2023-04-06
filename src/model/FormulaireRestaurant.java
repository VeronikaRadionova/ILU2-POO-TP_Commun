package model;

public class FormulaireRestaurant extends Formulaire {
	
	private int entite; // ???
	private int nbPersonnes;
	private int numService;
	
	public FormulaireRestaurant (int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.entite = entite;
		this.nbPersonnes = nbPersonnes;
		this.numService = numService;
		
	}

	public int getEntite() {
		return entite;
	}

	public void setEntite(int identificationEntite) {
		this.entite = identificationEntite;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public int getNumService() {
		return numService;
	}

	
	
}
