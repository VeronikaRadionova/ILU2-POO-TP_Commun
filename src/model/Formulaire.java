package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int entite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
		this.entite = entite;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	public int getEntite() {
		return entite;
	}

	public void setEntite(int identificationEntite) {
		this.entite = identificationEntite;
	}
	
	protected abstract int getNumService();

	protected abstract int getNbPersonnes();
	
	
}
