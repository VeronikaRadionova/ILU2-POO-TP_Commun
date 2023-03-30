package model;

public class Reservation {
	protected int mois;
	protected int jour;
	
	public Reservation(int mois, int jour) {
		this.mois = mois;
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}
	
	
}
